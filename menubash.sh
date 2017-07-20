 #!/bin/bash
 
 # Uso de select parecido a un ciclo for
 # Para implementar un pequeño menu que se puede agrandar según los requisitos
           OPCIONES="Hola Salir"
           select opt in $OPCIONES; do
               if [ "$opt" = "Salir" ]; then
                echo done
                exit
               elif [ "$opt" = "Hola" ]; then
                echo Hola Mundo
               else
                clear
                echo opción errónea
               fi
           done
