import javax.swing.JOptionPane;

public class TresEnRayaConArrays {

	public static void main(String[] args) {
		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[3];
		int numeros1[] = new int[3];
		int numeros2[] = new int[3];
		// Inicializo el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = 0;
		}

		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");

		}
		// Inicializo el array
		for (int i = 0; i < numeros1.length; i++) {
			numeros1[i] = 0;
		}
		System.out.println();
		// Muestro el array en pantalla
		for (int i = 0; i < numeros1.length; i++) {
			System.out.print(numeros1[i] + " ");

		}
		// Inicializo el array
		for (int i = 0; i < numeros2.length; i++) {
			numeros1[i] = 0;
		}
		System.out.println();
		// Muestro el array en pantalla
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i] + " ");
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
