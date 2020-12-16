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
	
	public int verificarPuntosMano () {
		int maximoPuntos = 1;
		for (int i = 0; i < mano.length-1; i++) {
			int contador = 1;
			for (int j = i+1; j < mano.length; j++) {
				if(mano[i].getValor() == mano[j].getValor())
					contador++;
			}
			if(contador > maximoPuntos)
				maximoPuntos = contador;
		}
		return maximoPuntos;
	}
	
	public void jugada() {
		switch (verificarPuntosMano()) {
		case 1:
			System.out.println("Soy el " + this.nombreJugador + " y tengo solo carta alta");
			break;
		case 2:
			System.out.println("Soy el " + this.nombreJugador + " y tengo"
					+ " una pareja");
			break;
		case 3:
			System.out.println("Soy el " + this.nombreJugador + " y tengo "
					+ "un trio");
			break;
		case 4:
			System.out.println("Soy el " + this.nombreJugador + " y tengo"
					+ " un poker");
			break;
		default:
			System.out.println("no tengo nada");
			break;
		}
	}
}

	