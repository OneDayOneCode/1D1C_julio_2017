# -*- coding: utf-8 -*-


print("Welcome-->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
nombre = str(input("Ingrese su nombre: "))

# Condicional , si la longitud de la cadena es mayor a 0 y menor a 20 
# utiliza el método lower que pasa el String a minúsculas
# si no es así, lo pasa a mayúsculas con el método upper

if len(nombre) > 0 and len(nombre) < 20:
    print("Este es su nombre en minusculas ", nombre.lower())
else:
    print("Este es su nombre en mayusculas: ", nombre.upper())
print("----------------------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")


