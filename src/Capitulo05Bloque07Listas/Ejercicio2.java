package Capitulo05Bloque07Listas;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

import Utils.Utils;

public class Ejercicio2 {
	/**
	 * Realiza un programa que trabaje con una Lista de elementos Integer. Debes
	 * mostrar un menú en pantalla y ofrecer al usuario las siguientes opciones a
	 * realizar sobre la lista: a) "Abandonar el programa". b) "Crear aleatoriamente
	 * la lista de valores". Pedirás al usuario los siguientes datos: longitud de la
	 * lista, valor mínimo y valor máximo. A continuación limpiarás la lista (por si
	 * contenía valores), y agregarás tantos elementos enteros como se haya
	 * indicado, con valores que deben oscilar entre el mínimo y el máximo señalado.
	 * c) "Calcular suma, media, mayor y menor". Mostrarás en pantalla esos cuatro
	 * valores. d) "Agregar una cantidad de nuevos valores". Pedirás al usuario los
	 * siguientes datos: cuántos datos nuevos quiere agregar, posición a partir de
	 * la que se deben introducir, valor mínimo y valor máximo. Incluirás tantos
	 * valores como indique el usuario, en la posición indicada, con valores entre
	 * mínimo y máximo. e) "Eliminar elementos cuyo valor esté en un intervalo".
	 * Pedirás dos valores al usuario (mínimo y máximo), que conforman un intervalo.
	 * Eliminarás los valores de la lista de elementos que se encuentren dentro de
	 * ese intervalo (incluyendo los límites) e informarás de cuantos elementos has
	 * eliminado de la lista. f) "Imprimir la lista". Mostrarás la lista en pantalla
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<Integer> listanum = new ArrayList<Integer>();

		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el
		// programa esté finalizado
		listanum.add(1);
		listanum.add(2);
		listanum.add(3);

		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();

			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;
			case 1:
				inicializarListaAletoriamente(listanum);
				break;
			case 2:
				operacionesMatematicas(listanum);
				break;
			case 3:
				agregarNumAzar(listanum);
				break;
			case 4:
				eliminaValores(listanum);
				break;
			case 5:
				visualizaLista(listanum);
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
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Crear aleatoriamente la lista de valores"
				+ "\n2.- Calcular suma, media, mayor y menor" + "\n3.- Agregar una cantidad de nuevos valores"
				+ "\n4.- Eliminar elementos cuyo valor esté en un intervalo" + "\n5.- Imprimir la lista de valores"
				+ "\n\nIntroduzca su opción: ";
		// Pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla
	 * y cada una con su número de línea
	 * 
	 * @param lista
	 */
	public static void visualizaLista(List<Integer> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}

	public static void inicializarListaAletoriamente(List<Integer> lista) {
		if (!lista.isEmpty())
			lista.removeAll(lista);
		System.out.println("Escribe la longitud de la lista");
		int longitud = Utils.obtenerEntero();
		System.out.println("Valor minimo");
		int min = Utils.obtenerEntero();
		System.out.println("Valor máximo");
		int max = Utils.obtenerEntero();
		for (int i = 0; i < longitud; i++) {
			lista.add(i, Utils.obtenerNumeroAzar(min, max));
		}
	}

	public static void operacionesMatematicas(List<Integer> lista) {
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Suma" + "\n2.- Media" + "\n3.- Mayor" + "\n4.- Menor"
				+ "\n\nIntroduzca su opción: ";
		// Pido una opción al usuario
		int opcionOperacion = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		switch (opcionOperacion) {
		case 0:
			System.out.println("Adios!");
			break;
		case 1:
			opcionSuma(lista);
			break;
		case 2:
			opcionMedia(lista);
			break;
		case 3:
			opcionMayor(lista);
			break;
		case 4:
			opcionMenor(lista);
			break;
		}

	}

	public static void opcionSuma(List<Integer> lista) {
		int total = 0;
		for (int i = 0; i < lista.size(); i++) {
			total += lista.get(i);
		}
		System.out.println("Suma total: " + total);
	}

	public static void opcionMedia(List<Integer> lista) {
		int total = 0;
		for (int i = 0; i < lista.size(); i++) {
			total += lista.get(i);
		}
		System.out.println("La media es " + (total / lista.size()));
	}

	public static void opcionMayor(List<Integer> lista) {
		int numMax = lista.get(0);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > numMax) {
				numMax = lista.get(i);
			}
		}
		System.out.println("El mayor es: " + numMax);
	}

	public static void opcionMenor(List<Integer> lista) {
		int numMen = lista.get(0);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < numMen) {
				numMen = lista.get(i);
			}
		}
		System.out.println("El menor es: " + numMen);
	}

	public static void agregarNumAzar(List<Integer> lista) {
		System.out.println("Escribe cuantos valores deseas agregar");
		int numvalores = Utils.obtenerEntero();
		System.out.println("Escribe la posicion donde deseas agregarlos");
		int posicion = Utils.obtenerEntero();
		System.out.println("Valor minimo");
		int min = Utils.obtenerEntero();
		System.out.println("Valor máximo");
		int max = Utils.obtenerEntero();
		for (int i = 0; i < numvalores; i++) {
			lista.add(posicion, Utils.obtenerNumeroAzar(min, max));
		}
	}

	public static void eliminaValores(List<Integer> lista) {
		System.out.println("Escribe el inicio del intervalo a eliminar");
		int num = Utils.obtenerEntero();
		System.out.println("Escribe el final del intervalo a eliminar");
		int num1 = Utils.obtenerEntero();
		for (int i = num; i <= num1; i++) {
			lista.remove(num);
		}
	}
}