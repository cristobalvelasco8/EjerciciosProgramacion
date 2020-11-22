package Bloque06Capitulo5MetodosSobreRaices;

import Utils.Utils;

public class Ejercicio8 {

	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La matriz sim�trica es = " + matrizsimetrica(matriz));
	}
	
	/*
	 * Crea un m�todo que compruebe si la matriz es sim�trica. (Los elementos de la
	 * matriz (i, j) y (j, i), si existen, son iguales). El m�todo recibir� una
	 * matriz y devolver� un boolean.
	 */

	public static boolean matrizsimetrica(int matriz[][]) {
		boolean simetrica = true;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != matriz[j][i]) {
					simetrica = false;
					break;

				}
			}
		}

		return simetrica;

	}
}

