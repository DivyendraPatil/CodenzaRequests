#!/usr/bin/env bash

declare -a passarray
mapfile passarray < "$1"

echo ${passarray[@]} 
