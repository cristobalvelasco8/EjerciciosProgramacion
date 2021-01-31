package Capitulo04Bloque01;

import java.util.ArrayList;
import java.util.List;

public class CromoBaloncesto {
	// Propiedades de cada Cromo
	String nombreJugador;
	int alturacm;
	int pesokg;
	int puntosMediosPorpartido;

	public CromoBaloncesto() {
		System.out.println("Has creado un cromo");
	}

	public CromoBaloncesto(String nombreJugador, int alturacm, int pesokg, int puntosMediosPorpartido) {
		this.nombreJugador = nombreJugador;
		this.alturacm = alturacm;
		this.pesokg = pesokg;
		this.puntosMediosPorpartido = puntosMediosPorpartido;

	}

	public String toString() {
		return "Nombre: " + nombreJugador + " - alturacm: " + alturacm + " - pesokg: " + pesokg
				+ " - puntos Medios Por Partido: " + puntosMediosPorpartido;
	}

	public String getnombreJugador(String nombreJugador) {
		return nombreJugador;
	}

	public void setnombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getalturacm(int alturacm) {
		return alturacm;
	}

	public void setalturacm(int alturacm) {
		this.alturacm = alturacm;
	}

	public int getpesokg(int pesokg) {
		return pesokg;
	}

	public void setpesokg(int pesokg) {
		this.pesokg = pesokg;
	}

	public int getpuntosMediosPorpartido(int puntosMediosPorpartido) {
		return puntosMediosPorpartido;
	}

	public void setpuntosMediosPorpartido(int puntosMediosPorpartido) {
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}

	public static void main(String[] args) {

		// Voy a crear un cromo de baloncesto con un constructor que asigna propiedades
		CromoBaloncesto c1 = new CromoBaloncesto("Rafael", 181, 90, 75);

		// Creo un nuevo cromo
		CromoBaloncesto c2 = new CromoBaloncesto("Manuela", 170, 70, 50);
		CromoBaloncesto c3 = new CromoBaloncesto("Maria", 175, 74, 68);
		CromoBaloncesto c4 = new CromoBaloncesto("Antonio", 190, 85, 95);
		CromoBaloncesto c5 = new CromoBaloncesto("Nuria", 165, 60, 71);

		// Muestro los cromos de baloncesto
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());

		List<Integer> cromoBaloncesto = new ArrayList<Integer>();
		cromoBaloncesto.add(c1.puntosMediosPorpartido);
		cromoBaloncesto.add(c2.puntosMediosPorpartido);
		cromoBaloncesto.add(c3.puntosMediosPorpartido);
		cromoBaloncesto.add(c4.puntosMediosPorpartido);
		cromoBaloncesto.add(c5.puntosMediosPorpartido);
		System.out.println("");

		ordenaJugadores(cromoBaloncesto);

	}

	public static void ordenaJugadores(List<Integer> lista) {
		System.out.println("Contenido de la lista");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}

		// Convertimos la lista en un array para poder utilizar el metodo de la burbuja
		Integer[] array = new Integer[lista.size()];
		array = lista.toArray(array);

		System.out.println("Contenido del array antes de ordenar");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		int temporal = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length - i); j++) {
				if (array[j - 1] > array[j]) {
					temporal = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temporal;
				}
			}
		}
		System.out.println("");
		System.out.println("Contenido del array ordenado");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
