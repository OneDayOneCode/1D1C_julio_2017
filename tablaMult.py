# -*- coding: utf-8 -*-

# El siguiente programa es en la versión 2.7 de python, aún vigente
# se hace en esta versión para conocer la diferencia en la sintaxis
# Diferencias entre versión 2 y 3 de python
# Ambas utilizadas , diferencias como la falta de parentesis en la función print
# raw_input entre las versiones y las conversiones de str e int
# Ambas versiones se utilizan mucho es necesario conocer esas pequeñas diferencias entre la sintaxis
# este programa se ejecuta de la siguiente manera por línea de comandos
# python2 tablaMult.py 

print "-------------------------------TABLAS DE MULTIPLICAR-----------------------"

# Con la sentencia raw_input le pedimos al usuario ingresar datos por teclado
# por defecto son String's , así que lo convertimos a enteros por que en este caso queremos un número
# todo esto lo guardamos en la variable 'num'

num = int(raw_input("Ingrese un número: "))

# Ciclo for en python3  , hace un recorrido en un rango del 1 al 10
# imprime la variable x que tiene el valor del rango del 1 al 10, concatenando
# con nuestro número ingresado y el resultado de la multiplicación de estos

for x in range(1,11):
	print str(x) + " X " + str(num) + " = " + str((num * x))

