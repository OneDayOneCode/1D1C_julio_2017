package julio;
import java.util.Scanner;
//Programa que encuentra una subcadena dentro de una cadena dada.
public class Busca 
{
	public static void main(String[] args)
	{
		//Creamos e inicializamos un objeto de Scanner, para leer los datos.
		Scanner scanner = new Scanner(System.in);
		//Creamos nuestras variables y objetos de String.
		String cadena, subcadena;	
		int posicion=0, apariciones=0;
	
		//Pedimos y leemos los datos.
		System.out.println("Dame la cadena en la que buscaré...");
		cadena = scanner.nextLine();
		System.out.println("Dame la cadena que quieres que busque...");
		subcadena = scanner.nextLine();
		//Es una buena práctica cerrar el Scanner siempre.
		scanner.close();
		
		//Mientras que la posición sea válida, seguiremos dentro del while.
		while (posicion>=0)
		{				
			//Buscamos la palabra dentro de la cadena con este método.
			posicion = cadena.indexOf(subcadena, posicion);
			//Guardamos la posición y las apariciones.
			if (posicion >= 0)
			{
				posicion++;
				apariciones++;
			}
		}		
		if(apariciones == 1)
			System.out.println("Encontré " +subcadena+" "+ apariciones + " vez");
		else
			System.out.println("Encontré " +subcadena+" "+ apariciones + " veces");
	}
}