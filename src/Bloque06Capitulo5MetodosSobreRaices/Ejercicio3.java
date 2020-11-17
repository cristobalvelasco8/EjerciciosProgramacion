package Bloque06Capitulo5MetodosSobreRaices;



public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaraci�n de una matriz
				int matriz[][] = new int[][] {{1,2,3},
                                               {8,6,7},
                                               {9,5,4}};
             boolean siono =matrizpositiva(matriz);
             if (siono==true) {
            	 System.out.println("La matriz es positiva");
             }
             else {
            	 System.out.println("La matriz es negativa");
             }
          

	}
	public static boolean matrizpositiva (int matriz[][]) {
		
           boolean positiva=true;
		 for(int i=0; i<matriz.length; i++) { //Recorro todas las filas
			 for(int j=0; j<matriz.length; j++) { //Recorro las columnas de la fila "i"
				 if(matriz[i][j]<0) {
					 positiva = false;
					 
				 }
			 }
		 }
		 return positiva;
	}
	

}
