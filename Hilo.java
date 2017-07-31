package julio;

/*Siempre es bueno usar hilos cuando una tarea podría demorar mas tiempo
 * del debido, porque la interfaz de usuario se congelará y eso no se ve bien.
 *Debemos heredar de la clase Thread e implementar el método run(), que es el que se
 *ejecutará cuando mandemos a llamar el método start(). 
 */
public class Hilo extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			//Dormimos el hilo durante 4 segundos.
			Thread.sleep(4000);
			System.out.println("Hola1, soy un hilo que duró 4 segundos...");
		}
		catch(Exception e)
		{
			e.getMessage();
		};
		super.run();
	}

	public static void main(String[] args)throws Exception 
	{
		/*Creamos un objeto Hilo.
		 * Lo iniciamos, y con el método join, hacemos que todo lo demás tenga que esperar
		 * hasta que termine de ejecutarse el método run().
		 * En caso contrario, primero aparecería el mensaje de Hola2, eso no sería
		 * correcto. 
		 */
		Hilo h=new Hilo();
		h.start();
		h.join();
		System.out.println("Hola2, yo me presentaré después del hilo de 4 segundos...");
	}
}
