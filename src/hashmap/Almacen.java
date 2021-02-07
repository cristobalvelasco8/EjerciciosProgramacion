package hashmap;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Almacen {
	
	
	
	static HashMap <Integer, Articulo> hm = new HashMap <Integer, Articulo> ();
	
	static String nombre;
	static int codigo, NumEstante, stock;
	
	private static void HashMap() {
	
		
		hm.put(13456, new Articulo("Whisky", 7, 20));
		hm.put(54567, new Articulo("Ron", 4, 21));
		hm.put(4659, new Articulo("Beefeater", 8, 30));
				
	}
		
	public static void main(String[] args) {
		HashMap();
		
		int opcion;
		do {
			opcion = menu();
			
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("HAS ABANDONADO LA APLICACIÓN.");
				break;
			case 1: //A�adir art�culos
				agregarHashMap();
				
				break;
			case 2: // Borrar art�culos
				eliminarHashMap();
				
				break;
			case 3: //Actualizar el estante
				actualizarEstante();

				break;
			case 4: // Elimino una línea del fichero, pido la posición y elimino
				actualizarNombre();
				
				break;
			case 5: // Cortar un conjunto de líneas
				actualizarStock();
				
				break;

			case 6: // Cortar un conjunto de líneas
				encontrarArticulo();
				
				break;
				
			case 7: // Cortar un conjunto de líneas
				actualizarStock();
				
				break;
			case 8: // Ver HashMap

				visualizaHashMap();
				break;
			default:
				System.out.println("Opción no válida");
			}
			
			// El bucle se repetirá mientras no se pulse la opción de salir.
		} while (opcion != 0);
	}
	
	public static int menu () {
		String strMenu = "\n\nMenú"
				+ "\n0.- Salir"
				+ "\n1.- Agregar un artículo"
				+ "\n2.- Eliminar un artículo"
				+ "\n3.- Actualizar el estante de un artículo"
				+ "\n4.- Añadir nombre a un artículo"
				+ "\n5.- Añadir stock a un artículo"
				+ "\n6.- Encontrar un artículo"
				+ "\n7.- Limitar stock"
				+ "\n8.- Ver lista de artículos"
				+ "\n\nIntroduzca su opción: ";
		// Muestro el menú y pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}
	
	public static void visualizaHashMap () {
		System.out.println("\nTodos los productos dentro del HashMap:");
		Object claves[] = hm.keySet().toArray();
		for (int i = 0; i < claves.length; i++) {
			System.out.println(" C�digo de barras del art�culo: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}
		}
	
	public static void agregarHashMap() {
	
		nombre = JOptionPane.showInputDialog("Inserte el nombre del artículo: ");
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Inserte el código del artículo: "));
		NumEstante = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número de estante del artículo: "));
		stock = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de stock del artículo: "));

		hm.put(codigo, new Articulo(nombre, NumEstante, stock));
		
	}
	
	public static void eliminarHashMap() {
		int eliminar;
		eliminar = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero de art�culo para eliminarlo: "));
		hm.remove(eliminar);
	}
	
	public static void actualizarEstante() {
		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el c�digo de barras del art�culo que desea cambiar: "));
		System.out.println(hm.get(codigo));
				
		int numEs = Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero de estanter�a nuevo: "));
		
		hm.get(codigo).setNumEstante(numEs);
	}
	
	public static void actualizarNombre() {		
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el c�digo de barras del art�culo que desea cambiar: "));
		
		System.out.println(hm.get(codigo));
				
		String nomNuevo = JOptionPane.showInputDialog("Introduce un nombre nuevo: ");
		
		hm.get(codigo).setNombre(nomNuevo);
	}
	
	public static void actualizarStock() {
		String str;
		
		str = JOptionPane.showInputDialog("Introduce el código de barras del artículo que quiere cambiar: ");
		int codigo = Integer.parseInt(str);
		System.out.println(hm.get(codigo));
				
		str = JOptionPane.showInputDialog("Introduce una cantidad de stock nueva: ");
		int stockNuevo = Integer.parseInt(str);
		
		hm.get(codigo).setStock(stockNuevo);
	}
	
	public static void encontrarArticulo() {
		String str;
		
		str = JOptionPane.showInputDialog("Introduce el código de barras del artículo que quieres encontrar: ");
		int codigo = Integer.parseInt(str);
		System.out.println(hm.get(codigo));
	}
	}


