#!/usr/bin/env python3

import sys
import csv
from pathlib import Path
import mimetypes
import re


def process_receipt_file(lines):
	total = None
	change = '0'

	for line in lines:
		if re.search('total', line, re.IGNORECASE):
			total = re.sub(r'[^0-9.]', '', line)
			break

	for line in lines[::-1]:
		if re.search('change', line, re.IGNORECASE):
			change = re.sub(r'[^0-9.]', '', line)
			break

	return total, change


def process_bank_file(lines):
	balance = None
	num = None

	for line in lines:
		if re.search('balance', line, re.IGNORECASE) and '$' in line:
			balance = re.sub(r'\s+', '', line[line.find('$'):])
			break

	for line in lines[::-1]:
		if re.search(r'(\b(\d{3})[-.●\s]?(\d{3})[-.●\s]?(\d{4}))\b', line, re.IGNORECASE):
			for m in re.finditer(r'(\b((\d)[-.●\s]?)?(\d{3})[-.●\s]?(\d{3})[-.●\s]?(\d{4}))\b', line):
				num = "%s" % re.sub(r'\s+', '-', m.group(0))
				break
			break

	return balance, num


def process_file(filename):
	lines = [line.strip('\n').strip('\r') for line in open(filename, 'r')]
	bank = False

	for line in lines:
		if re.search('bank', line, re.IGNORECASE):
			bank = True
			break

	if bank:
		bank = 'BANK'
		amount, other = process_bank_file(lines)
	else:
		bank = 'RECEIPT'
		amount, other = process_receipt_file(lines)

	op = csv.writer(sys.stdout, delimiter=',')
	op.writerow([filename, bank, amount, other])
	pass


def process_files(filenames=[]):
	mimetypes.init()
	for filename in filenames:
		p = Path(filename)
		if p.exists() and p.is_file() and mimetypes.guess_type(filename)[0] == 'text/plain':
			process_file(filename)
		else:
			print("%s is not a file" % filename, file=sys.stderr)
	pass


if __name__ == "__main__":
	file_list = sys.argv[1:]
	process_files(file_list)
	pass

