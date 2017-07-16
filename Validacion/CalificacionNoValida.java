
class CalificacionNoValida extends Exception
{
     public CalificacionNoValida(){} 
  
     public CalificacionNoValida(String mensaje)
     {
	 super(mensaje);
     }

     // Acesso a Validacion : aav
     public CalificacionNoValida(boolean aav, String calificacion) throws CalificacionNoValida
     {
	 if(aav) this.validarCalificacion(calificacion);
     }

     // Calificacion a validar: cav
     private void validarCalificacion(String cav) throws CalificacionNoValida
     {  
          try
          {   
       		if(this.eddr(Integer.valueOf(cav)))
          	throw new CalificacionNoValida("Validación: La calificación no valida entre 70 y 100."); 
          } 
        
          catch(NumberFormatException excepcion)
          {
	        throw new CalificacionNoValida("Validación: La calificación no es un dato " 
                                               + " numérico entero o el dato no es numérico."); 
	  }	
     }

     // Esta dentro del rango: eddr
     private boolean eddr(int calificacion)
     {
     	 return (!(calificacion >= 70 && calificacion <= 100));
     }
}
