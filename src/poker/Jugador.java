package poker;

import java.util.Arrays;

public class Jugador {

	String nombreJugador;
	Carta mano[] = new Carta[5];

	public Jugador(String nombre) {
		this.nombreJugador = nombre;

	}

	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public Carta[] getMano() {
		return mano;
	}

	public void setMano(Carta[] mano) {
		this.mano = mano;
	}

	@Override
	public String toString() {
		return "Jugador [nombreJugador=" + nombreJugador + ", mano=" + Arrays.toString(mano) + "]";
	}
}

	