package cifradocesar;
import java.util.Vector;
/**
 *
 * @author token
 * 
 * Programa que cifra los mensajes dependiendo el desplazamiento(Leer el cifrado Cesar).
 * Cifrado básico.
 */
public class CifradoCesar 
{
	//Creamos vectores para hacer más fácil la tarea con los métodos que incluye.
    private Vector <String> alfabetoMinus;
    private Vector <String> alfabetoMayus;
    
    //Creamos un par de arreglos con el abecedario en minúscula y mayúscula.
    private String[] alfabetoMinusBasico;
    private String[] alfabetoMayusBasico;
    
    //Método constructor.
    public CifradoCesar()
    {
    	//Inicializamos.
        alfabetoMinus=new Vector<String>();
        alfabetoMayus=new Vector<String>();
        
    	//Inicializamos.
        alfabetoMinusBasico=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s",
           "t","u","v","w","x","y","z",};
        alfabetoMayusBasico=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S",
           "T","U","V","W","X","Y","Z",};
        
        //Usamos dos ciclos FOR EACH para vaciar los abecedarios en nuestros vectores.
        for(String i:alfabetoMinusBasico)
        {
            alfabetoMinus.add(i);
        }
        for(String i:alfabetoMayusBasico)
        {
            alfabetoMayus.add(i);
        }
    }
    
    //Método cifrar, el cual recibe el mensaje y el desplazamiento.
    public String cifrar(String mensaje, int desplazamiento)
    {
    	//Variable para controlar el ciclo while dependiendo del tamaño del mensaje.
        int contador=0;
        //Variable de retorno del mensaje ya cifrado.
        String mensajeCifrado="";
        
        while(contador<mensaje.length())
        {
        	//Variable que guardará la posición del caracter, mas el desplazamiento dado.
            int aux=0;
            
            //Corroboramos que no sea un espacio en blanco el caracter del mensaje en indice(contador).
            if(!Character.isWhitespace(mensaje.charAt(contador)))
            {
            	//Corroboramos si es una letra minúscula, sino, vamos al siguiente IF.
                if(Character.isLowerCase(mensaje.charAt(contador)))
                {
                	//Guardamos la nueva posición en aux, si se pasa del tamaño del Vector, restamos 27 para regresar al inicio del Vector. 
                    aux=alfabetoMinus.indexOf(Character.toString(mensaje.charAt(contador)))+desplazamiento;
                    if(aux>26)
                    {
                        aux=aux-27;
                    }
                    //Vamos almacenando el mensaje cifrado.
                    mensajeCifrado+=alfabetoMinus.get(aux);
                }
                //Es el mismo proceso en dado caso que sea mayúscula, solo se cambia el Vector a usar.
                else if(Character.isUpperCase(mensaje.charAt(contador)))
                {
                    aux=alfabetoMayus.indexOf(Character.toString(mensaje.charAt(contador)))+desplazamiento;
                    if(aux>26)
                    {
                        aux=aux-27;
                    }
                    mensajeCifrado+=alfabetoMayus.get(aux);
                }
            }
            //En dado caso que sea un caracter que se encuentra fuera de ambos vectores, se agrega un espacio en blanco. 
            else
            {
                mensajeCifrado+=" ";
            }
            //Aumentamos en 1 el valor del contador para pasar al siguiente caracter.
            contador++;
        }
        return mensajeCifrado;
    }
    
    //Para descifrar el mensaje, nótese que es el mismo proceso que cifrar, pero a la inversa.
    public String descifrar(String mensaje, int desplazamiento)
    {
        int contador=0;
        String mensajeDescifrado="";
        
        while(contador<mensaje.length())
        {
            int aux=0;
            if(!Character.isWhitespace(mensaje.charAt(contador)))
            {
                if(Character.isLowerCase(mensaje.charAt(contador)))
                {
                    aux=alfabetoMinus.indexOf(Character.toString(mensaje.charAt(contador)))-desplazamiento;
                    if(aux<0)
                    {
                        aux=aux+27;
                    }
                    mensajeDescifrado+=alfabetoMinus.get(aux);
                }
                else if(Character.isUpperCase(mensaje.charAt(contador)))
                {
                    aux=alfabetoMayus.indexOf(Character.toString(mensaje.charAt(contador)))-desplazamiento;
                    if(aux<0)
                    {
                        aux=aux+27;
                    }
                    mensajeDescifrado+=alfabetoMayus.get(aux);
                }
            }
            else
            {
                mensajeDescifrado+=" ";
            }
            contador++;
        }
        return mensajeDescifrado;
    }
}
class Main
{
	public static void main(String args[])
	{
		/*Test
		CifradoCesar o=new CifradoCesar();
		System.out.println(o.cifrar("Hola Mundo bebe",5));
        System.out.println(o.descifrar("Mtpf Qzrit gjgj",5));*/
	}
}