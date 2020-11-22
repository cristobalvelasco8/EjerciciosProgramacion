package Bloque06Capitulo5MetodosSobreRaices;

import Utils.Utils;

public class Ejercicio9 {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		System.out.println("La matriz original es:");
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		matriztranspuesta(matriz);

	}
	/**
	 * Crea un método que realice la matriz traspuesta de la que recibe.
	 *  El método recibe una matriz y devuelve otra matriz, la traspuesta
	 * @param matriz
	 */

	public static void matriztranspuesta(int matriz[][]) {

		int matriz2[][] = new int[matriz.length][matriz.length];

		System.out.println("\nLa matriz transpuesta es:");
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz.length; j++) {
				matriz2[i][j] = matriz[j][i];
				System.out.print(matriz2[i][j] + "\t");
				
			}
			System.out.println();

		}
	}
}
