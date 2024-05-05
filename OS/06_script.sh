#!/bin/bash

<< Comment
 read -p "Enter your name : " a    # read on same line

 echo "Your name is $a"
Comment

#a=3
#b=10
<<c
#let c=a+b          #to do a arithmetic oper we use "let"
((c=a+b))
((d=a*b))
((e=a-b))
echo "sum = $c"
echo "mul = $d"
echo "sub = $e"
c

#c=`expr $a + $b`
# echo "Enter no -"

<<relationalOperators
Equal == -eq
Greater than or equal to -ge
less than or equal to -le
not equal to != -ne
greater than -gt
less than -lt
relationalOperators

<<IfElifElse
read -p "Enter no: " a

if [ $a == 10 ] || [ $a == 2 ]
then
	echo "if part"
elif [ $a == 5 ]
then
	echo "else if part"
else
	echo "Else part"
fi
IfElifElse
<<f
#for loop
for ((i=0;i<=10;i++))
do
	echo "$i"
	sleep 2s
done
f
<<Alternative
for i in 1 3 5 7 9 abhinav
do
	echo "$i"
done
Alternative

while true
do
	echo "hi"
	sleep 2s
done
