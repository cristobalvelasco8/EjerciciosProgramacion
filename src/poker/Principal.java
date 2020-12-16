package poker;

public class Principal {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();

		baraja.barajarArribaAbajo();
		System.out.println();
		baraja.mostrar();
		System.out.println();
		baraja.barajarAbajoArriba();
		System.out.println();
		baraja.mostrar();
		System.out.println();
		baraja.mezclar();
		baraja.mostrar();
		System.out.println();
		baraja.ordenar();
		baraja.mostrar();

		Poker poker = new Poker(baraja);
	}

}
