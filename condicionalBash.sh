#!/bin/bash

# Para asignar permisos de ejecución a este Script use:
# sudo chmod +x condicionalBash.sh



echo "Este pequeño Script muestra un if else en bash"
echo "----------------------------------------------"
echo "Introduce dos palabras separadas por un espacio en la misma linea"

read palabra1 palabra2

if [ $palabra1 = $palabra2 ];then
	echo "Las palabras son iguales"
else
	echo "Las palabras son diferentes"
fi

echo "El código que usted ejecuta para esto es el siguiente..."
echo "if [ $palabra1 = $palabra2 ];then"
echo "    echo 'Las palabras son iguales'"
echo "else"
echo "    echo 'Las palabras son diferentes'"
echo "fi"
echo "Bye  ;)"
