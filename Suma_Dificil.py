"""
Ejemplo de entrada
123456789012 1
2 3
4   5 -1

Ejemplo de salida
123456789013
5
8
"""

contador = 0

# Almacenara los resultados de las suma
resultados = [] 

while (contador <= 2):

	numero_de_entradas = str(input())

	# El metodo buscara y separara los numeros que tengan espacios
	numeros = numero_de_entradas.split(" ")
	suma = 0

	# un for que descomprondra la lista y hara un recorrido
	for x in numeros:
		# Por si hay un caracter de doble espacio lo eliminamos
		if (len(x) != 0):	
			suma += int(x)   
	
	# Agregamos el resultado a nuestra lista
	resultados.append(suma)
	contador += 1

print("\n\n")

for x in resultados:
	print(x)
