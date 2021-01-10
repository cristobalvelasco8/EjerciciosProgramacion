package spaceinvaders;

public class Partida {

	public static void main(String[] args) {
		CampoBatalla campo = new CampoBatalla();
		System.out.println();
		campo.turnoDisparos();
		System.out.println();
		campo.finDeBatalla();
		System.out.println();
		campo.mezclarPersonajes();
		System.out.println();
		campo.comprobarGanador();
		System.out.println();

		Personaje persona = new Personaje();
		persona.comprobarVida();
		System.out.println();
		persona.disparar(persona);
		System.out.println();
		

	}

}
