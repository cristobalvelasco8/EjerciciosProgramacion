package Bloque06Capitulo5MetodosSobreRaices;

import Utils.Utils;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaraci�n de una matriz
		int matriz[][] = new int[5][5];
		matrizazar(matriz);
     /**Crea un método que rellena la matriz con valores creados al azar.
      *  El método recibirá la matriz y devolverá "void"
      * 
      */
	}
	public static void matrizazar(int matriz[][]) {
		
	// Asignaci�n de valores al azar en las posiciones de la matriz
	for (int i = 0; i < matriz.length; i++) { // Con la variable "i" recorro todas las filas
      for (int j = 0; j < matriz[i].length; j++) { // Con la variable "j" recorro las columnas de cada fila
		// Asigno n�mero al azar
		matriz[i][j] = Utils.obtenerNumeroAzar(-100, 100);
					}
				}
	}
	

}
