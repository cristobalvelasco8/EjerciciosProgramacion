package SimulacionExamen;

import Utils.Utils;

public class Examen_B_Tragaperras {

	public static void main(String[] args) {
		/*
		 * a. (1.5 puntos) El programa debe poder presentar usn men� al usuario en el que
		 * se pueda escoger una opci�n de las siguientes: 1-Mora; 2-Naranja; 3-Campana;
		 * 4-D�lar. b. (1.5 puntos) El programa debe ejecutar el men� del ejercicio
		 * anterior tres veces (debes utilizar un bucle). Cada una de las opciones que
		 * elegir� el usuario se deben guardar en un array de 3 elementos de longitud.
		 * c. (1.5 puntos) Debes crear una variable �acumulador� cuyo valor inicial sea
		 * cero. En caso de que las tres opciones de los men�s anteriores sean iguales,
		 * al valor de acumulador se le sumar� un total de 1000 puntos. Adem�s de esos
		 * 1000 puntos, si las tres opciones son �D�lares�, se le sumar� a la jugada
		 * 3000 puntos m�s. El acumulador debe poderse visualizar en todo momento. d. (1
		 * punto) Modifica el ejercicio anterior para que mediante un bucle se repita el
		 * proceso de los pasos a-d hasta que el usuario desee. Por ejemplo puedes hacer
		 * que el programa termine cuando el usuario introduzca el valor �0�. e. (1
		 * punto) Modifica el apartado �a� para que no sea el usuario el que elija las
		 * jugadas, sino que se generen al azar. f. (1 punto) Modifica el programa para
		 * que cualquier combinaci�n de los elementos (Mora, Naranja, Campana y D�lar) y
		 * que no tenga sus tres elementos iguales penalice al usuario quit�ndole 100
		 * puntos al acumulador. g. (1.5 puntos) Crea y utiliza al menos tres m�todos en
		 * el programa. h. (1 punto) El ejercicio que presentes como examen resuelto
		 * debe compilar perfectamente, tener indentaci�n perfecta y suficientes
		 * comentarios.
		 */

		int opcionUsuario;
		int acumulador = 0;
		

		int array[] = new int[3];

		for (int j = 0; j < 3; j++) {
			String strMenu = "\n\nMEN�\n" + "\n1.- MORA." + "\n2.- NARANJA." + "\n3.- CAMPANA." + "\n4.- D�LAR."
					+ "\n\n INTRODUZCA LA OPCI�N QUE QUIERA: ";
			// Muestro el men�
			System.out.println(strMenu);
			// Pido una opci�n al usuario
			opcionUsuario = Utils.obtenerNumeroAzar(1, 4);

			// Devuelvo la opci�n seleccionada
			array[j] = opcionUsuario;
		}

		acumulador(acumulador, array);

		mostrarArray(array);

	}

	public static void mostrarArray(int[] array) {
		System.out.println("\nOpciones elegidas: \n");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + "\t");
		}
		System.out.println(" ");
	}

	public static int acumulador(int acumulador, int[] array) {
		if (array[0] != 4 && array[0] == array[1] && array[0] == array[2]) {
			acumulador += 1000;
			System.out.println("Puntos: " + acumulador);

		}

		if (array[0] == 4 && array[1] == 4 && array[2] == 4) {
			acumulador += 4000;
			System.out.println("Puntos: " + acumulador);

		}
		if (array[0] != array[1] && array[0] != array[2]) {
			acumulador -= 100;
			System.out.println("Puntos: " + acumulador);
		}
		return acumulador;
	}

	public static int obtenerNumeroAzar(int min, int max) {
		return (int) Math.round(Math.random() * (max - min)) + min;
	}

}
