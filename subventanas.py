#!/usr/bin/env python
# -*- coding: utf-8 -*-

from tkinter import *
from tkinter import ttk

class Aplicacion():
	
	# Declaramos una variable de clase para contar las ventanas
	
	ventana = 0
	
	# Declaramos una variable de clase para usar en el cálculo de la 
	# posición de una ventana
	
	posx_y = 0
	
	def __init__(self):
		
		# Declaramos laventana
		
		self.raiz = Tk()
		
		# Define la dimensión 300x200 y la coordenada en la pantalla 
		# x=500, y=50
		
		self.raiz.geometry('300x200+500+50')
		self.raiz.resizable(0, 0)
		self.raiz.title("Aplicación Ejemplo")
		
		# Creamos un boton que active la función de abrir la otra ventana
		# el parametro command asigna al boton una función
		
		btnAbrir = ttk.Button(self.raiz, text='Abrir', command=self.abrir)
		btnAbrir.place(x=130, y=90)
		self.raiz.mainloop()
	
	
	def abrir(self):
		# Define una nueva ventana de dialogo, el objeto creado es de tipo
		# Toplevel
		
		self.dialogo = Toplevel()
		
		# Incrementa en 1 el contador de ventanas
		
		Aplicacion.ventana+=1
		
		# Recalcula posición de la ventana
		
		Aplicacion.posx_y += 50
		
		self.dialogo.geometry('200x200+590+70')
		self.dialogo.resizable(0, 0)
		
		# Obtiene identificador de la nueva ventana
		
		ident = self.dialogo.winfo_id()
		
		# Construye mensaje en la barra de título
		
		titulo = str(Aplicacion.ventana)+": "+str(ident)
		self.dialogo.title(titulo)
		
        # Define el botón 'Cerrar' que cuando sea
        # presionado cerrará (destruirá) la ventana 
        # 'self.dialogo' llamando al método
        # 'self.dialogo.destroy'
        
        btnCerrar = ttk.Button(self.dialogo, text='Cerrar', command=self.dialogo.destroy)
        btnCerrar.pack(side=BOTTOM, padx=20, pady=20)
		
        
        # Cuando la ejecución del programa llega a este 
        # punto se utiliza el método wait_window() para
        # esperar que la ventana 'self.dialogo' sea 
        # destruida. 
        # Mientras tanto se atiende a los eventos locales
        # que se produzcan, por lo que otras partes de la
        # aplicación seguirán funcionando con normalidad. 
        # Si hay código después de esta línea se ejecutará
        # cuando la ventana 'self.dialogo' sea cerrada.

        self.raiz.wait_window(self.dialogo)



    
def main():
    mi_app = Aplicacion()
    return(0)

if __name__ == '__main__':
    main()
		
	
