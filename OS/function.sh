#!/bin/bash

#function in shell script

<<f
myfun () {

	echo "Hello"
}

myfun
f

#arguments

addition() {

	num1=$1
	num2=$2
	let sum=$num1+$num2
	echo "Sum is $sum"
}

addition 10 20
