package circulos;

/*Este es un programa que realicé para la materia de Tópicos avanzados de programación
 * Consiste en la creación de un círculo con círculos dentro, es de lo más sencillo.*/
//Importamos las librerías necesarias para la creación y ejecución de nuestro programa.
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
//Clase
class Circulos extends Frame 
{  
	//Constructor.
    public Circulos()
    {
    	/*Métodos para editar algunos aspectos de nuestra ventana principal, título, tamaño
    	 * visualización.
    	 */
        this.setTitle( "Circulos" );
        this.setSize( 1000,1000 );
        this.setVisible( true );
        this.setLocationRelativeTo(null);
        
        /*Usamos un escuchador de eventos sobre la ventana para que se cierre cada que
         * toquemos el botón de cerrar. 
         */
        this.addWindowListener(
      
            new WindowAdapter() 
            {
        
            @Override
            public void windowClosing( WindowEvent evt ) 
            {
                System.exit( 0 );
            }
            } 
        );
        
    }
    
    //Sobreescribimos el método paint()
    @Override
  public void paint( Graphics circulo )
    {
      
      //Le pasamos al constructor del padre el parámetro de tipo Graphics.
      super.paint(circulo);
      //Creamos un objeto de tipo Random, mas adelante lo usaremos.
      Random aleatorio = new Random();
        
        
        Color miColor;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
      
        int x=50;
        int y=50;
        int z=500;
            
        
        for (int i = 0; i < 100; i++) 
        {
        	//Por cada iteración asignamos un número diferente para que sea usado como color.
        	c1 = (int)(aleatorio.nextDouble()*255);
        	c2 = (int)(aleatorio.nextDouble()*255);
        	c3 = (int)(aleatorio.nextDouble()*255);
        
        	//Pasamos los parámetros para la creación de un color nuevo.
        	miColor = new Color(c1, c2, c3);
        	//Lo asignamos al círuclo, al igual que lo creamos con el método fillOval().
        	circulo.setColor( miColor );
        	circulo.fillOval( x,y,z,z );
        	//Aumentamos en 25 los valores para la creación de un círculo más grande cada vez.
        	x=x+25;
        	y=y+25;
        	z=z-50;
        }
  } 
  
  public static void main(String[] args) 
  {
        new Circulos();    
  }
  
}