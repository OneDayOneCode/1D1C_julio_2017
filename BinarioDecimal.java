package binario;

//Programa que convierte de binario a decimal.
public class BinarioDecimal {

    public static void main(String[] args) {
     
        int[][] arrayBinario = 
                          {{0,0,0,0,1},
                          {1,0,1,0,0},
                          {0,1,1,1,0},
                          {1,0,1,1,1},
                          {0,0,1,0,0}};
        
        for(int i=0;i<arrayBinario.length;i++)
        {
			String s="";
			int numDec=0;
			for(int j=0;j<arrayBinario[i].length;j++)
            {
				s=s+Integer.toString(arrayBinario[i][j]);	
			}
                        
            numDec=Integer.parseInt(s,2);//Aquí está la magia ;).
                        
			System.out.println(s+" = "+numDec);
		}
		
	}
        
        
}