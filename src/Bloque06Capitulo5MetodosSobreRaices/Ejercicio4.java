package Bloque06Capitulo5MetodosSobreRaices;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaraci�n de una matriz
		int matriz[][] = new int[][] {{1,0,0},
                                      {0,6,0},
                                      {0,8,9}};
            boolean siono =matrizdiagonal(matriz);
              if (siono==true) {
          	 System.out.println("La matriz no es diagonal");
   }
             else {
                 System.out.println("La matriz es diagonal");
 }

	}
	public static boolean matrizdiagonal (int matriz[][]) {
       boolean diagonal=true;
		 for(int i=0; i<matriz.length; i++) { //Recorro todas las filas
			 for(int j=0; j<matriz.length; j++) { //Recorro las columnas de la fila "i"
               if(i==j) {
               if(matriz[i][j]==0) {
            		  diagonal=true;
               }
            		  
            	  }
            		  
               }
               }

		 return diagonal;
		 }
	
	}

