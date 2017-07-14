# -*- coding: utf-8 -*-

print("Bienvenido a esta prueba con listas (arreglos)")

lista = [10, 30, 100, 26, 100, -2.3, 2000]

for num in lista:
    if num > 0:
        print(num, " positivo!!")
    else:
        print(num, " negativo!!")




if len(lista) > 5:
	lista.reverse()
	print("Lista al revés ", lista)
else:    
	print("No pasa nada")
