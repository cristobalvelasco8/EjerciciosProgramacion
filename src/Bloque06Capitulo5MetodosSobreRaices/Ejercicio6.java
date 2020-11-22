package Bloque06Capitulo5MetodosSobreRaices;

public class Ejercicio6 {

	

	public static void main(String[] args) {

		int matriz[][] = new int[][] { { 0, 1, 1 },
			                           { 1, 0, 1 },
			                           { 1, 1, 0 } };
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("La matriz dispersa es = " + matrizdispersa(matriz));
	}
	/*
	 * Crea un método que compruebe si la matriz es dispersa. (Todos las filas y
	 * todas las columnas contienen al menos un elemento nulo).
	 */

	public static boolean matrizdispersa(int matriz[][]) {

		

		for (int i = 0; i < matriz.length; i++) {
			boolean sin0 = true;
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0) {
					sin0 = false;

				}
			}
			if (sin0) {
				return false;
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			boolean sin0 = true;
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0) {
					sin0 = false;

				}
			}
			if (sin0) {
				return false;
			}
		}
		return true;
	}


}


