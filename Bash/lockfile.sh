#!/usr/bin/env bash 

exec 200>/tmp/${0}-lock || exit 1
flock 200 || exit 1

while true ; do
	sleep 1
done

flock -u 200

# This creates a lock file called lockfile.sh-lock and loops forever
# when killed, the lock file is released
