import java.util.Scanner;

/*
    Pequeño programa en java que hace una validacion, si la persona digita: 3.12 o Hola mundo,
    saldra un error, aparte el programa calculara el promedio de las 5 calificaciones del alumno.
*/

public class Alumno
{   
     private Scanner entrada;
     private int sumaDeCalificaciones;     

     public Alumno(){}

     public void sumarCalificaciones() throws CalificacionNoValida
     {
	  for(int i = 1; i <= 5; i++)
          {
 	      this.sumaDeCalificaciones += this.validarCalificacion(i);
          }
	  this.entrada.close(); 	
     }
		
     public double calcularPromedio()
     {
	  return (double) this.sumaDeCalificaciones/5; 
     }

     // Numero de la calificacion: ndlc
     private int validarCalificacion(int ndlc) throws CalificacionNoValida
     {
	  String calificacion = null;
          String error = null;
         
          do
          {
 	      try
              {
	         calificacion = this.capturarCalificacion(ndlc);
                 throw new CalificacionNoValida(true, calificacion); 
              } 
    
             catch(CalificacionNoValida excepcion) 
             { 
		 // En esta parte si el metodo getMessage() regresa un null, se le asignara un "" y por ende la calificacion sera valida.
                 error = (excepcion.getMessage() != null) ? excepcion.getMessage() + "\n" : "";
	         System.out.print(error);   
             }
 
           } while(!error.equals(""));
	 
          return Integer.valueOf(calificacion);	
     }
	
     private String capturarCalificacion(int ndlc)
     {
          this.entrada = new Scanner(System.in);                 

          System.out.printf("Captura la calificación #%d:", ndlc);       
    	  return entrada.nextLine();
     }
}
