package Capitulo04Bloque01.ejerciciosSobreHerencia.coleccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joya j = new Joya(1890, "Ásia", 3500, "Oro");
		Libro l = new Libro(1320, "Inglaterra", 11.50f, "La selva", "Tarzán");
		Jarron ja = new Jarron(1310, "Japón", 213.32f, "Gotico", "Soca");
		Mueble m = new Mueble(1999, "Asiático", 3200.12f, "Pino", "Azul");
		
		System.out.println(j.toString());
		System.out.println(l.toString());
		System.out.println(ja.toString());
		System.out.println(m.toString());

	}

}
