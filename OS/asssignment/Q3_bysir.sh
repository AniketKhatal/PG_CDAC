#!/bin/bash

<<Q3
Display the name of files in the current directory which is maximum & minimum size. 
The file size is considered in bytes.
Q3

ls -l | awk '{print $5, $9}' | sort -n | awk 'NR==2 {print "Minimum Value: " $2} END {print "Max Value" $2}'

# ls -l | awk '{print $5, $9}' | sort -n | head -n 5
