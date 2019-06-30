#!/usr/bin/env bash

if [[ -p /dev/stdin ]]; then
	while IFS= read -r LINE; do
		#echo "LINE: $LINE"
		pipearray+=( "$LINE" )
	done
fi

echo ${pipearray[@]}
