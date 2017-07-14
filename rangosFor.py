# -*- coding: utf-8 -*-


# Lista en python 

lista = ["Francia","México", "Dinamarca", "Rusia"]

# Ciclo for que recorre una lista con la variable ele
# Seguido de esto, se imprime el contenido de cada indice con 
# el número de caracteres del String

print("Contenido de lista con String's")

for ele in lista:
    print(ele, len(ele))
    
    
#Uso de rango sencillo en un ciclo for

print("ciclo for en un rango especifico")
for a in range(-4, 5):
    print(a)
        


#Uso de rango un poco más apropiado
# Creamos una lista

palabras = ["cero", "Uno", "Dos", "tres", "Cuatro", "Cinco", "Seis"]

# Usamos un ciclo for que recorre la lista con la variable num 
# Imprime el indice de la variable num multiplicado por 10 y el contenido de este

print("Ciclo for en una lista diferente")
for num in range(len(palabras)):
    print(num * 10, palabras[num])
    print("-----------")
