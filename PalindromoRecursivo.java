package julio;
public class PalindromoRecursivo
{
	private boolean esPalindromo(String palabra)
	{
		//Hacemos la palabra en minuscula y quitamos espacios para que no existan problemas.
		palabra=palabra.toLowerCase().trim();
		if(palabra.length() <= 1)
			return true;
		else
		{
			/*Dado que los caracteres tienen un valor numérico dentro de la tabla ASCII,
			 * no hay problema que usemos el operador == para comparar.
			 * Si son iguales, podemos volver a llamar el método, pero quitando el primer
			 * y úlitmo caracter. 
			 */
	        if(palabra.charAt(0)==palabra.charAt(palabra.length()-1))
	            return esPalindromo(palabra.substring(1,palabra.length()-1));
	        else
	        	return false;
	    }
	}

	public static void main(String[] args) 
	{
		PalindromoRecursivo p=new PalindromoRecursivo();
		System.out.println(p.esPalindromo("AniT  a L a V ALATIN    A"));
	}
}
