package Bloque06Capitulo5MetodosSobreRaices;

public class Ejercicio5 {

	public static void main(String[] args) {

		int matriz[][] = new int[][] { { 1, 5, 7 },
			                           { 0, 6, 8 },
			                           { 0, 0, 9 } };
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La triangular de la matriz es superior = " + triangularsuperior(matriz));

	}
	/*
	 * Crea un método que compruebe si la matriz es triangular superior. (Todos los
	 * elementos que están por debajo de la diagonal principal son nulos).
	 */

	public static boolean triangularsuperior(int matriz[][]) {

		boolean superior = true;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] != 0) {
					superior = false;
					break;
				} else {
					superior = true;
				}

			}
		}
		return superior;

	}
}
