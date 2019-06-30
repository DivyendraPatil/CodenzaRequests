#!/usr/bin/env bash

echo "This is a print command"
# Move this inside the /bin folder and you can type bash1.sh to run from anywhere

#This will print 10 numbers on same line
for i in {1..10};do
	echo -ne "$i "
done

echo ""

echo $PATH
