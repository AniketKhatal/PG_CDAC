#!/bin/bash

#Concatenation of strings

conc () {
	str1=$1
	str2=$2

	str=$str1$str2
	echo "Concatenated string: $str"
}
conc "Abhinav" "Aniket"

#Find the length of the string
len () {
	str=$1
	len=${#str}
	echo "Length= $len"
}
len "Ram"

#Find the string is equal or not
is_same () {
	if [ "$1" == "$2" ]; then
		echo "String is same"
	else
		echo "String is not same"
	fi
}
is_same "Ram" "Ram"

#Check the string is palindrome or not
is_palin () {
	if [ "$(rev <<< "$1")" == "$1" ]; then
		echo "String is palindrome"
	else
		echo "String is not palindrome"
	fi
}
is_palin "sas"
<<c
> log.txt
ls
grep "hhh"
cat log.txt


make std.txt file  in that roll: name: hindi: math: phy:
1: Ram: 80 :55 :77 
c   
