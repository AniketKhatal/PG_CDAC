#!/bin/bash

myvar="Hello All"

length=${#myvar}

upper=${myvar^^}
lower=${myvar,,}

echo "$myvar"
echo "$length"
echo "$upper"
echo "$lower"


#mv str.sh ~/OS/AK_OS  --- to move the file from ass to ok
