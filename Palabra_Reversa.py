"""
	Programa que de el dato de entrada te regresa la palabra pero en un orden inverso.

"""

palabra_inicial = str(input("Palabra inicial:"))

# Este sera nuestro acumulador que va a ir agregando las palabras de forma inversa
palabra_final = ""

# Usando la funcion reversed la palabra se vera de forma inversa y iremos asignandole las palabras a nuestro "acumulador"
for x in reversed(palabra_inicial):
	palabra_final += x

print("Palabra en orden reverso: " + palabra_final)
