# -*- coding: utf-8 -*-

print("Bienvenido a esta prueba con listas (arreglos)")

# Se crea una lista de enteros

lista = [10, 30, 100, 26, 100, -2.3, 2000]

# Se recorre con un ciclo for donde gracias a una condición se imprime 
# cuales osn positivos y cuales negativos

for num in lista:
    if num > 0:
        print(num, " positivo!!")
    else:
        print(num, " negativo!!")

	
# Se imprime una lista al revés con el uso del metodo reverse

if len(lista) > 5:
	lista.reverse()
	print("Lista al revés ", lista)
else:    
	print("No pasa nada")
