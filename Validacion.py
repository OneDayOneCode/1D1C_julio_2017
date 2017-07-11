"""
	Pequeño ejemplo sobre una validacion se pide al usario un texto sin caracteres numericos
"""

print("Introduzca un texto sin numeros para que sea puesto de forma reversa\n\n")

palabra_a_evaluar = str(input("Introduzca una palabra:"))

# A falta de un do-while loop se usa un while infinito pero dentro se contendra un if-else para terminar con el ciclo, asi por lo menos el ciclo se ejecutara una vez

while(...):

	# Metodo con el cual se evaluara la cadena de caracteres
	if (palabra_a_evaluar.isalpha()):
		break
	else:
		palabra_a_evaluar = str(input("Error, digite nuevamente el texto:"))		

palabra_reversa = ""

for x in reversed(palabra_a_evaluar):
	
	palabra_reversa += x

print("En forma reversa seria: " + palabra_reversa)
