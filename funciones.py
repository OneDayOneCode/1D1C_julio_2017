#-*-coding: utf-8 -*-

# Declarando una función en python 3


def operaciones(a, b):
	# Las siguientes líneas imprimen suma de variables y concatenación
    print ('la suma de', a, 'y', b, 'da como resultado:\n', a + b)
    print ('la multiplicación de', a, 'y', b, 'da como resultado:\n', a * b)
    print ('la división de', a, 'y', b, 'da como resultado:\n', a // b)


# Ingresando datos por teclado

num1 = int(input('Ingrese número 1 y de click en enter:\n'))
num2 = int(input('Ingrese número 2 y de click en enter:\n'))


# Mandamos a llamar la función con el paso de parametros (variables que ingresa el usuario)

operaciones(num1, num2)


# Declarando una función en python 3


def cadenas(cad):
	# Se imprime la longitud en índices de nuestra cadena String
    print ('Tu cadena', cad, 'tiene', len(cad), 'indices')
    # Pasamos una cadena a mayúsculas 
    print ('en mayusculas tu cadena queda de la siguiente manera:\n', cad.upper())


# Ingresando datos por teclado

cadi = input('Ingrese una cadena de texto...\n')

# Llamando una función con el parametro de la cadena que ingresael usuario

cadenas(cadi)
