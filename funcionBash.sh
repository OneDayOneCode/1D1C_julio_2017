#!/bin/bash

echo "############ Mostrando función e if anidados #########"

function funLocal
{
	echo "Comparando números!"

	num1=30
	num2=20

	if [ $num1 -eq $num2 ];then
		echo "Los número son iguales"
	elif [ $num1 -gt $num2 ];then
		echo "El numero 1 es mpayor al 2"
	else
		echo "No se cumple ninguna condición"
	fi

}

funLocal

echo "Por cierto, estos son losoperadores aritmeticos en Bash"
echo "-lt --> <"
echo "-gt -->  >"
echo "-le --> <="
echo "-ge --> >="
echo "-eq --> =="
echo "-ne --> !="


