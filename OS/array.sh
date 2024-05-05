#!/bin/bash

#Array in shellscript

myarray=(1 2 hello "Hello all" )

echo "${myarray[0]}"
echo "${myarray[*]}"

echo "length : ${#myarray[*]}"
echo "${myarray[*]:1}"
echo "${myarray[*]:1:2}"
myarray+=(5 4 Ram)

echo "${myarray[*]}"
