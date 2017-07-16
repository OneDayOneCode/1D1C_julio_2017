
public class Principal
{
     public static void main(String[] args) throws CalificacionNoValida
     {
	  Alumno alumno = new Alumno();
	
	   alumno.sumarCalificaciones();
	   System.out.println("El promedio es:" + alumno.calcularPromedio());
     }
}
