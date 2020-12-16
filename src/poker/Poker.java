package poker;

public class Poker {

	Jugador jugadores[] = new Jugador[5];

	Baraja baraja;

	public Poker(Jugador[] jugadores, Baraja baraja) {
		this.baraja = baraja;
		jugadores[0] = new Jugador("Ruano");
		jugadores[1] = new Jugador("Adrian");
		jugadores[2] = new Jugador("Alvaro");
		jugadores[3] = new Jugador("Pedro");
		jugadores[4] = new Jugador("Cristobal");

		for (int i = 0; i < jugadores.length; i++) {
			baraja.darMano(jugadores[i]);
			System.out.println("Jugador/a: " + jugadores[i].getNombreJugador());
			for (int j = 0; j < jugadores[i].getMano().length; j++) {
				System.out.println("\t " + jugadores[i].getMano()[j].toString());
			}
		}

	}
}
