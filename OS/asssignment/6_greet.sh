#!/bin/bash

#Write a shell script to greet withrespect to the hours

#hr= $(date +%H)
read -p "Enter the hour " hr
if [ $hr -ge 6 ] && [ $hr -lt 12 ]; then
	echo "Good Morning"

elif [ $hr -ge 12 ] && [ $hr -lt 18 ]; then
	echo "Good Afternoon"

else
	echo "Good Night"

fi
echo ""
