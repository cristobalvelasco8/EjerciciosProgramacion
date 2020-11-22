package Bloque06Capitulo5MetodosSobreRaices;

import Utils.Utils;

public class Ejercicio10 {

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
		matrizopuesta(matriz);
	}

	/**
	 * Crea un método que realice la matriz opuesta de la que recibe. El método
	 * recibe una matriz y devuelve otra, la opuesta.
	 */

	public static void matrizopuesta(int matriz[][]) {
		int matrizOpuesta[][] = new int[matriz.length][matriz.length];
		System.out.println("La matriz opuesta es:");
		System.out.println();
		for (int i = 0; i < matrizOpuesta.length; i++) {
			for (int j = 0; j < matrizOpuesta.length; j++) {
				matrizOpuesta[i][j] = (matriz[i][j]) * -1;
				System.out.print(matrizOpuesta[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
