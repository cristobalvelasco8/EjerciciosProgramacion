import javax.swing.JOptionPane;

public class TresEnRayasConMatrices {

	public static void main(String[] args) {

		// Declaracion de una matriz
		int matriz1[][] = new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

		matrizazarimprimida(matriz1);
	}

	public static void matrizazarimprimida(int matriz[][]) {
		// Asignacion de valores al azar en las posiciones de la matriz
		for (int i = 0; i < matriz.length; i++) { // Con la variable "i" recorro todas las filas
			for (int j = 0; j < matriz[i].length; j++) { // Con la variable "j" recorro las columnas de cada fila
			}
		}

		// Recorrido de los valores de la matriz
		for (int i = 0; i < matriz.length; i++) { // Recorro todas las filas
			for (int j = 0; j < matriz[i].length; j++) { // Recorro las columnas de la fila "i"
				System.out.print(matriz[i][j] + "\t"); // Imprimo el valor, con un tabulador y sin \n
			}
			System.out.println(); // Al finalizar una fila, incluyo un salto de línea

		}
		int opcion;

		do {
			opcion = menu();
			switch (opcion) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1:
				break;
			case 2:
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 0);
	}

	public static int menu() {

		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Jugador 1 introduce su jugada"
				+ "\n2.- Jugador 2 introduce su jugada" + "\n\nIntroduzca su opción: ";
		// Muestro el menú
		System.out.println(strMenu);
		// Pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

}
