package Capitulo04Bloque01.ejerciciosSobreHerencia.articulosComestibles;

import java.util.ArrayList;
import java.util.List;

class Tienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perecedero p1 = new Perecedero(10,"huevos",5,"18/05/21");
		Noperecedero p2 = new Noperecedero(8,"salchichas",4);
		Perecedero p3 = new Perecedero(4,"atun",3, "13/08/21");
		Noperecedero p4 = new Noperecedero(6,"patatas",2);
		
		
		List<Producto>Lista = new ArrayList<Producto>();
		Lista.add(p1);
		Lista.add(p2);
		Lista.add(p3);
		Lista.add(p4);
		
		for (int i = 0; i < Lista.size(); i++) {
			System.out.println(Lista.get(i));
		}
		

		


	}

}
