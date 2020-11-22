package Bloque06Capitulo5MetodosSobreRaices;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Declaracion de una matriz
		int matriz[][] = new int[][] {{1,2,3},
			                          {8,6,7},
			                          {9,5,4}};
			                           
	    matrizazarimprimida(matriz,2);                          
		}
		
   /**Crea un método que imprima la matriz en consola.
    * El método recibirá la matriz y devolverá "void"
    * 
    */

	public static void matrizazarimprimida(int matriz[][], int numerofila) {
		// Asignacion de valores al azar en las posiciones de la matriz
		  for (int i = 0; i < matriz.length; i++) { // Con la variable "i" recorro todas las filas
			for (int j = 0; j < matriz[i].length; j++) { // Con la variable "j" recorro las columnas de cada fila
					}
				}
				
		// Recorrido de los valores de la matriz
		  for (int i = 0; i < matriz.length; i++) { // Recorro todas las filas
			  
			  if(i==numerofila-1 && i!=matriz.length-1) {
				  i++;
			  }
			  if(i==numerofila-1 && i==matriz.length-1) {
				  break;
			  }
		
			  
			for (int j = 0; j < matriz[i].length; j++) {// Recorro las columnas de la fila "i"
				
			  System.out.print(matriz[i][j] + "\t"); // Imprimo el valor, con un tabulador y sin \n
	}
			System.out.println(); // Al finalizar una fila, incluyo un salto de línea

}
	}
}


