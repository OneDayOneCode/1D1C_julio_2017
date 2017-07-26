
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// Cuantos Numeros Positivos y Negativos hay: CNumerosPN
public class CNumerosPN
{
	/*
		Pequeño programa que lee en un archivo de texto los numeros y despues
		te dice la cantidad de numeros negativos y positivos.
		
		Este programa fue hecho en Programación Orientada a Objetos.
	*/
	
	private DataInputStream archivo;
	private int numerosP;
	private int numerosN;
		
	public CNumerosPN() throws IOException
	{
		this.archivo = new DataInputStream( new FileInputStream("numeros.dat"));
	}
	
	// Numero de Numeros Positivos y Negativos: NPN	
	/*
		Deprecated significa que sólo está ahí para que las aplicaciones antiguas funcionen, 
		pero no se debería usar en ningún caso en aplicaciones nuevas, 		
		porque ya hay formas mejores o más estables de hacer lo mismo. 
		De hecho, los métodos "deprecated" es más que probable que desaparezcan 
		en próximas versiones.
	*/
	@Deprecated
	public void numeroDeNPN()
	{
		String linea = null;
		Scanner sc = null;
		
		try
		{
			while((linea = this.archivo.readLine()) != null)
			{
				sc = new Scanner(linea);
			
				while(sc.hasNext())
				{
					int numero  = Integer.valueOf(sc.next());
				
					if(numero > 0)
					{
						this.numerosP++;
					}
				
					else
					{
						this.numerosN++;
					}
				
				}
			}
		}
		
		catch(IOException e)
		{
			System.err.println("[Error]A ocurrido un error.");
		}
		
		finally
		{
			sc.close();
		}
	}
	
	//Cuantos numeros positivos y negativos hay : cnpynhy
	public void cnpynhy()
	{
		System.out.printf("Hay %d numeros positivos.\nHay %d numeros negativos.\n", this.numerosP, this.numerosN);
	}
}
