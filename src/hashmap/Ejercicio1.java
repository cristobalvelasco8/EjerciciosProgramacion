package hashmap;

import java.util.HashMap;


public class Ejercicio1 {

	public static void crearHashMap() {
		HashMap hm = new HashMap();	
		
		hm.put("1", new Articulo("Fanta", 7583074, 7, 9));
		hm.put("2", new Articulo("Cocacola", 789535, 7, 20));
		hm.put("3", new Articulo("Lima", 567483, 6, 4));
		
		System.out.println("Mostramos el producto 1 " + hm.get("1"));
		
		hm.put(new Integer("3"), new Articulo("Whisky", 23123, 6, 10));
		
		
		hm.remove("2");
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println("Identificador tipo: " + claves[i].getClass().getName() + " - valor: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}
		hm.get(789535);
	}
	
	
	
	public static void main(String[] args) {
		crearHashMap();

	}

}
