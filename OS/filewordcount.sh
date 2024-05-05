#!/bin/bash

#

read -p "Enter file name : " filename
while read line
do
	echo "$line"
done < $filename
c=$(cat $filename | wc -c)
w=$(cat $filename | wc -w)

echo "No, of char : $c"
echo "No. of word : $w"
