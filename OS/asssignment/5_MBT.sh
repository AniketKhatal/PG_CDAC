#!/bin/bash

#Write a script that accept member into MBT Health CLub if the weight of the person is within the range of 30 to 250 kg

read -p "Enter the Weight" w

if [ $w -ge 30 ] && [ $w -le 250 ] ; then
	echo "You can become member of MBT"
else
	echo "You Cannot become member of MBT"

fi
echo ""

