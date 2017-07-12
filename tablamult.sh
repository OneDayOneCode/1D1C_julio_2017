#!/bin/bash

# Para ejecutar este script recuerde asignar permisos de ejecución con
# sudo chmod +x tablamult.sh , después solo tiene que ejecutar con
# ./tablamult.sh y listo, siempre y cuando este en el directorio del archivo
# Alberto Cardona.

echo "Tabla de multiplicar con el uso de ciclo while en Bash :)"

X=1

echo "Ingresa un número y presiona ENTER"
read N

# El ciclo controla que X seamenor o igual a 10

while [ $X -le 10 ]
do

# En R almacenamos la multiplicación de X por N

R=$[X*N]

# Se imprime dicha multiplicación en pantalla

echo "$N * $X $R"

# Con let, incrementamos el valor de X en 1 unidad

let X=$X+1

done

