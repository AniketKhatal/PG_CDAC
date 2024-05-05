#write a script for checking the working day or not

#read -p "Enter the date:" date
day=$(date +%u)
if [ $day -ge 1 ] && [  $day -le 5 ]; then
	echo "Working day"
else
	echo "not working day"
fi
