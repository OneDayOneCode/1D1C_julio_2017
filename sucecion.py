"""
	Este programa realiza un sucecion pidiendo al usuario
	un numero final.
	
	Ejemplo: 6
	
	1 + 2 + 3 + 4 + 5 + 6
	
	La salida debe mostrarse como...
	
	Salida : [resultado de la operacion] o [Mensaje de error]
"""

try:
	numero_final = int(input("El número debe ser entero  y positivo.\nNúmero final:"))
	
	# Formula matematica usada para realizar el calculo ((n)(n+1))/2 
	sucecion = (numero_final * (numero_final + 1))//2

	mensajeDS = sucecion if (numero_final >= 0) else "[Error]Digito un número negativo."

	print ("Salida:", mensajeDS)

except ValueError:
	print ("Salida:[Error] Digito un número no entero o un dato no numerico.")
	
