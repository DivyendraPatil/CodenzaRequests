#!/usr/bin/env bash

#The while loop is that the condition is true
# That we have lines to read
# $1 is passed to our script
# We change IDS or Internal Field Seperator to nothing
# Line wont break on spaces or characters
# -r prevents back slash interpretation
# Unescaped backslashes will be discarded
# By sed, we replace : to space
while IFS=: read -r user pass uid gid gecos home shell; do
	echo "$user $shell" # | sed 's/:/ /g'
done < "$1"
