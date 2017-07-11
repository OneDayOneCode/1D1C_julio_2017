"""
	Script sencillo sobre si una palabra es palindroma o no

"""

print("Se evaluara si la palabra introducida es palindroma o no\n\n\n")

palabra_usuario = str(input("Palabra a evaluar:"))
palabra_reversa = ""

# Aplicando el mismo metodo para ver una palabra en reversa
for x in reversed(palabra_usuario): 
	palabra_reversa += x

# Uso del if-else inline en Python
palindroma_o_no = "La palabra es palindroma." if (palabra_usuario == palabra_reversa) else "Palabra no palindroma"

print(palindroma_o_no)
