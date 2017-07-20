#!/bin/bash

#################### Alberto Cardona ###################################
# Variables y arreglos en Bash

# Declarando variables, sin dejar espacios antes o después del =

variableA='Soy el contenido de la variableA'

# Imprimir el contenido de una variable con el símbolo $ antes del nombre
# y el comando echo para imprimir

echo $variableA

# El contenido de una variable puede cambiar a lo largo del programa

variableA=10

# Comprobamos el nuevo valor imprimiendo el contenido nuevamente
# (la opción -n evita el salto de línea)
echo -n 'Ahora la variableA vale.. '
echo $variableA

# Más variables

num=100
texto='Soy un String en Bash'
booleano=true

echo "##########################"
echo "Declarando más variables:"
echo "Un entero: $num"
echo "Un String: $texto"
echo "Un booleano: $booleano"

# Arreglos en Bash

echo "Ejemplos de arrays en Bash (algo límitados)"
distros=(Debian 'Bunsen Labs' Arch Gentoo)

echo "Imprimiendo arreglos"

# Así se imprime todo el contenido del arreglo

echo ${distros[*]}

# Así accedemos a un índice del arreglo (todos comienzan en índice 0)

echo ${distros[1]}





















