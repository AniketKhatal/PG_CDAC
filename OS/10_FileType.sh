#!/bin/bash

echo "Task 10"
if [ "$#" -eq 0 ]; then
	echo "Usage: $0 <file1> [<file2> ...]"
	exit 1
fi

for file in "$@"; do
	if [ ! -e "$file" ]; then 
		echo "$file: No such file or Directory."
	elif [ -f "$file" ]; then
		echo "$file: Regular File"
	fi
