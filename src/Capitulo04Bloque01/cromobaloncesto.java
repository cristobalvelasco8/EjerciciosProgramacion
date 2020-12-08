package Capitulo04Bloque01;

import java.util.Arrays;
import java.util.List;

public class cromobaloncesto {

	static class CromoBaloncesto implements Comparable<CromoBaloncesto> {

		public String nombreJugador, equipoJugador;
		public int alturaCm, pesoKg, puntosMediosPorpartido;

		public CromoBaloncesto(String nombreJugador, int alturaCm, int pesokg, int puntosMediosPorpartido,
				String equipoJugador) {
			this.nombreJugador = nombreJugador;
			this.alturaCm = alturaCm;
			this.pesoKg = pesokg;
			this.puntosMediosPorpartido = puntosMediosPorpartido;
			this.equipoJugador = equipoJugador;

		}

		/**
		 * Constructor sin argumentos de entrada
		 */
		public CromoBaloncesto() {
			System.out.println("Han construido un cromo de baloncesto");
		}

		/**
		 * Metodo que devuelve un String con todos los valores de este objeto.
		 */
		public String toString() {
			return "Nombre [nombre=" + nombreJugador + ", altura en cm =" + alturaCm + ", peso en kg =" + pesoKg
					+ ", puntos medios por partido =" + puntosMediosPorpartido;

		}
		// Getters y Setters

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombreJugador;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombreJugador = nombre;
		}

		/**
		 * @return the alturaencm
		 */
		public int getalturaenccm() {
			return alturaCm;
		}

		/**
		 * @param alturaencm the pesoKg to set
		 */
		public void setalturaencm(int alturaCm) {
			this.alturaCm = alturaCm;
		}

		/**
		 * @return the pesoKg
		 */
		public int getpesoKg() {
			return pesoKg;
		}

		/**
		 * @param alturaencm the pesoKg to set
		 */
		public void setPesokg(int pesoKg) {
			this.pesoKg = pesoKg;
		}

		public int getppuntosMediosPorpartido() {
			return pesoKg;
		}

		/**
		 * @param alturaencm the pesoKg to set
		 */
		public void setpuntosMediosPorpartido(int puntosMediosPorpartido) {
			this.puntosMediosPorpartido = puntosMediosPorpartido;
		}

		public static void visualizaLista(List<String> lista) {
			System.out.println("\n\nContenido del fichero");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("\t" + i + " - " + lista.get(i));
			}
		}

		@Override
		public int compareTo(CromoBaloncesto o) {
			if (puntosMediosPorpartido < o.puntosMediosPorpartido) {
				return -1;
			}
			if (puntosMediosPorpartido > o.puntosMediosPorpartido) {
				return 1;
			}
			return 0;
		}
	}

	static void imprimeArrayCromoBaloncesto(CromoBaloncesto[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + ". " + array[i].nombreJugador + " - Altura(cm): " + array[i].alturaCm
					+ " - Peso(kg): " + array[i].pesoKg + " - Puntos medios por partido: "
					+ array[i].puntosMediosPorpartido + " - Equipo: " + array[i].equipoJugador);
		}
	}

	public static void main(String[] args) {
		CromoBaloncesto[] arrayCromoBaloncesto = new CromoBaloncesto[5];
		arrayCromoBaloncesto[0] = new CromoBaloncesto("Cristobal", 178, 78, 50, "Boston Celtic");
		arrayCromoBaloncesto[1] = new CromoBaloncesto("Gustavo", 200, 80, 40, "Boston Celtic");
		arrayCromoBaloncesto[2] = new CromoBaloncesto("Maik", 202, 76, 45, "Red Sox");
		arrayCromoBaloncesto[3] = new CromoBaloncesto("Brayan", 199, 73, 47, "Real Madrid");
		arrayCromoBaloncesto[4] = new CromoBaloncesto("Gasol", 203, 76, 49, "Lakers");

		System.out.println("Array sin ordenar por puntos medios por partido");
		imprimeArrayCromoBaloncesto(arrayCromoBaloncesto);
		// Ordeno por punto medios por partido (de menor a mayor).
		Arrays.sort(arrayCromoBaloncesto);
		System.out.println("Array ordenado por puntos medios por partido");
		imprimeArrayCromoBaloncesto(arrayCromoBaloncesto);
	}
}

