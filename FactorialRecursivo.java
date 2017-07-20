//Programa que calcula el factorial de un número, de manera recursiva.
package julio;
import java.util.Scanner;

public class FactorialRecursivo
{
	/*Siempre hay que cuidar la visibilidad de nuestras variables, 
	 * no es recomendable que puedan ser accedidas desde fuera de la clase que 
	 * las contiene. Siempre hay que crear getters y setters.
	*/ 
	private int numero;
	private Scanner scanner;
	
	//El método constructor, siempre debería ser usado para inicializar variables y objetos.
	public FactorialRecursivo()
	{
		scanner=new Scanner(System.in);
	}
	
	/*Método recursivo para obtener el factorial.
	 * Con números muy grandes se desborda. Es preferible usar BigInteger.
	 */
	public long factorial(int n)
	{
		long factorial=0;
		if(n==0)
			return 1;
		else//si no se ha llegado al tope(0), al factorial le asignamos n*volver a llamar a la función, pero restandole en uno.
			factorial=n*(factorial(n-1));
		return factorial;
	}
	
	//Asignamos el valor a número.
	public int setNumero() 
	{
		System.out.println("Dame un número: ");
		this.numero=scanner.nextInt();
		return this.numero;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	public static void main(String[] args) 
	{
		FactorialRecursivo f=new FactorialRecursivo();
		f.setNumero();
		System.out.println("El factorial "+f.getNumero()+" es: "+f.factorial(f.getNumero()));
	}
}
