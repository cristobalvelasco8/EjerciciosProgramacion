package Capitulo05Bloque07Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Utils.Utils;

public class Ejercicio1 {

	/**
	 * Escribe un programa editor de textos. Debes utilizar la consola de Java. El
	 * objetivo es que se pueda editar el contenido de un archivo ficticio. Para
	 * hacer esto utilizarás una lista de elementos de tipo String. Cada línea del
	 * texto será representada como un String. Debes mostrar un menú en pantalla,
	 * que contenga todas las opciones siguientes, y que funcionen adecuadamente: a)
	 * "Agregar una línea al texto". Pediras al usuario un String y lo agregarás al
	 * final de la lista que representa tu fichero ficticio. b) "Insertar una línea
	 * en cualquier posición del texto". Pedirás al usuario un String y un número.
	 * Insertarás el String en la línea pedida. c) "Editar una línea (reescribir su
	 * contenido)". Pedirás al usuario un número de línea para sobrescribir,
	 * mostrarás al usuario la línea actual que desea sobrescribir. Pedirás un nuevo
	 * String. Eliminarás el String actual y cambiarás con el nuevo d) "Borrar una
	 * línea". Pedirás un número de línea y la eliminarás de la lista. e) "Cortar un
	 * conjunto de líneas", (marcadas por su posición inicial y final). Pedirás un
	 * número de línea inicial y uno final. "Transportarás todas las líneas del
	 * intervalo a una nueva lista y las borrarás de la lista original. f) "Pegar un
	 * conjunto de líneas cortadas en una determinada posición". Pedirás un número
	 * de línea en la que insertar lo que tienes cortado con la opción anterior. g)
	 * "Imprimir el fichero". Mostrarás cada línea del fichero ficticio, aparecerá
	 * numerada en la consola.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<String> fichero = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();
		List<String> fichero2 = new ArrayList<String>();

		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el
		// programa esté finalizado
		fichero.add("Primera línea");
		fichero.add("Segunda línea");
		fichero.add("Tercera línea");

		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();

			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;
			case 1: // Ha elegido agregar una línea
				agregarlinea(fichero);
				break;
			case 2: // Ha elegido insertar una línea
				insertarlinea(fichero);
				break;
			case 3: // Ha elegido editar una línea
				editarunalinea(fichero);
				break;
			case 4: // Ha elegido eliminar una linea
				eliminarunalinea(fichero);
				break;
			case 5: // Ha elegido cortar lineas
				cortarlineas(fichero, portapapeles);
				break;
			case 6: // Ha elegido pegar lineas
				pegarlineas(fichero2, portapapeles);
				break;
			case 7: // Ha elegido visualizar el fichero
				visualizaLista(fichero);
				break;
			case 8: // Ha elegido visualizar el fichero
				visualizaLista(fichero2);
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

	}

	/**
	 * Muestra un menú en pantalla y pide una opción al usuario
	 * 
	 * @return
	 */
	public static int menu() {
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Agregar una línea"
				+ "\n2.- Insertar una línea en una posición" + "\n3.- Editar una línea" + "\n4.- Eliminar una línea"
				+ "\n5.- Cortar un conjunto de líneas" + "\n6.- Pegar un conjunto de líneas"
				+ "\n7.- Visualizar el fichero" + "\n\nIntroduzca su opción: " + "\n8.- Visualizar el fichero2"
				+ "\n\nIntroduzca su opción: ";
		// Muestro el menú
		System.out.println(strMenu);
		// Pido una opción al usuario
		int opcionUsuario = Utils.obtenerEnteroPorJOptionPane();
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla
	 * y cada una con su número de línea
	 * 
	 * @param lista
	 */
	public static void visualizaLista(List<String> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}

	public static void agregarlinea(List<String> lista) {
		String str = JOptionPane.showInputDialog("Escribe una línea");
		lista.add(str);

	}

	public static void insertarlinea(List<String> lista) {
		String str = JOptionPane.showInputDialog("Escribe una línea a insertar");
		int num = Utils.obtenerEnteroPorJOptionPane();

		lista.add(num, str);
	}

	public static void editarunalinea(List<String> lista) {
		int num = Utils.obtenerEnteroPorJOptionPane();
		lista.remove(num);
		String str = JOptionPane.showInputDialog("Escribe una línea a editar");
		lista.add(num, str);
	}

	public static void eliminarunalinea(List<String> lista) {
		int num = Utils.obtenerEnteroPorJOptionPane();
		lista.remove(num);

	}

	public static void cortarlineas(List<String> lista, List<String> portapapeles) {

		if (!portapapeles.isEmpty()) {
			portapapeles.removeAll(portapapeles);
		}
		System.out.println("Escribe la primera linea a cortar");
		int num = Utils.obtenerEnteroPorJOptionPane();
		System.out.println("Escribe la última linea a cortar");
		int num2 = Utils.obtenerEnteroPorJOptionPane();
		for (int i = num; i <= num2; i++) {
			portapapeles.add(lista.remove(num));
		}

	}

	public static void pegarlineas(List<String> lista, List<String> portapapeles) {
		int num = Utils.obtenerEnteroPorJOptionPane();

		lista.addAll(num, portapapeles);

	}

}
