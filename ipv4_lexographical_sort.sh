#!/bin/bash

# Script to search for folders inside root/devops 
# grep all ipv4 addresses
# save them, sort them lexographically and print them out.

result=""

for file in $(find ./root/devops/*  -maxdepth 3 -type f)
do
	result1=$(grep -E -o "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)" $file)
    result="$result $result1"
done

echo "$result"| tr " " "\n"| awk ' { print length, $0 } ' | sort -n | cut -d" " -f2