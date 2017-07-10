#!/usr/bin/env python
# -*- coding: utf-8 -*-



#                 Autor - Alberto Cardona -
# La finalidad de esta ventana de LOGIN que no hace nada es mostrar el uso
# de el método place en los objetos Label, Entry, Button y Separator de tkinter
# con la finalidad de dar el ejemplo sobre como acomodar los objetos en la interfaz
# Así mismo la implementación de 'command' que activa una función al presionar un boton
 

# Importamos las librerias tkinter y el módulo ttk que contiene novedades 
# de la versión 8.5 de tkinter

from tkinter import *
from tkinter import ttk

# Definimos una clase

class Ventana():
	# Método constructor
	def __init__(self):
		self.raiz = Tk()
		self.raiz.title("Login que no hace nada!")
		self.raiz.geometry("400x200")
		self.raiz.resizable(0, 0)
		
		# Creamos variables  especiales de tkinter
		self.usuario = StringVar()
		self.clave = StringVar()
		self.mensaje = StringVar()
		
		# Creamos los objetos etiquetas
		self.lblWelcome = ttk.Label(self.raiz, text="LOGIN")
		self.lblUsuario = ttk.Label(self.raiz, text="Nombre:")
		self.lblPasswd = ttk.Label(self.raiz, text="Contraseña:")
		self.lblMensaje = ttk.Label(self.raiz, textvariable=self.mensaje, foreground='blue')
		
		# Creamos los objetos caja de texto
		self.txtUsuario = ttk.Entry(self.raiz, textvariable=self.usuario, width=25)
		self.txtPassw = ttk.Entry(self.raiz, textvariable=self.clave, width=25, show="*")
		
		# Creamos un objeto separador
		self.separador1 = ttk.Separator(self.raiz, orient=HORIZONTAL)
		
		# Creamos los objetos botones
		self.btnAceptar = ttk.Button(self.raiz, text="-Aceptar-", command=self.aceptar)
		self.btnCancelar = ttk.Button(self.raiz, text="-Cancelar-", command=quit)
		
		# Acomodando los objetos en la ventana (dentro del objeto 'self.raiz')
		self.lblWelcome.place(x=200, y=10)
		self.lblUsuario.place(x=30, y=40)
		self.txtUsuario.place(x=120, y=40)
		self.lblPasswd.place(x=30, y=100)
		self.txtPassw.place(x=120, y=100)
		self.btnAceptar.place(x=30, y=170)
		self.btnCancelar.place(x=300, y=170)
		self.lblMensaje.place(x=150, y=140)
		
		self.raiz.mainloop()
	
	# Función que valida el usuario y contraseña, con un simple condicional	
	def aceptar(self):
		if self.usuario.get() == 'Alberto' and self.clave.get() == 'abc123': 
			self.lblMensaje.configure(foreground='blue')
			self.mensaje.set("¡Acceso correcto!")
		else:
			self.lblMensaje.configure(foreground='red')
			self.mensaje.set("Acceso denegado")
		
# Función principal

def main():
    mi_app = Ventana()
    return 0

if __name__ == '__main__':
    main()
