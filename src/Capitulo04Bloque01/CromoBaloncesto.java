package Capitulo04Bloque01;

public class CromoBaloncesto {


	// Propiedades de cada cromo
    String nombreJugador; // Nombre del jugador
    int alturaCm; // alturra en cm
    int pesoKg; // Peso en kg
    float puntosMediosPorpartido; // Puntos medios por partido
    /**
	 * Constructor sin argumentos de entrada
	 */
	public CromoBaloncesto() {
		System.out.println("Han construido un cromo de baloncesto");
	}
	
	public CromoBaloncesto(String nombreJugador, int alturaCm, int pesokg, float puntosMediosPorpartido) {
	this.nombreJugador = nombreJugador;	
	this.alturaCm = alturaCm;
	this.pesoKg = pesokg;
	this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
	/**
	 * Metodo que devuelve un String con todos los valores de este objeto.
	 */
	public String toString() {
		return "Nombre [nombre=" + nombreJugador + ", altura en cm =" + alturaCm + ", peso en kg =" + pesoKg
				+ ", puntos medios por partido =" +puntosMediosPorpartido;
	
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
	public int pesoKg() {
		return pesoKg;
	}

	/**
	 * @param alturaencm the pesoKg to set
	 */
	public void setPesokg(int pesoKg) {
		this.pesoKg = pesoKg;
	}

}






