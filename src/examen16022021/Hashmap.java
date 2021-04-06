package examen16022021;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Hashmap {
	
	
	
	static HashMap <Integer, CromoBaloncesto> hm = new HashMap <Integer, CromoBaloncesto> ();
	
	static String nombre;
	static int id, puntostemporadapasada, rebotestemporadapasada;
	
	private static void HashMap() {
	
		
		hm.put(8, new CromoBaloncesto(8,"Juan",8,9));
		hm.put(10, new CromoBaloncesto(10,"Cristobal", 4, 21));
		hm.put(6, new CromoBaloncesto(6,"Antonio", 8, 30));
				
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
			case 1: // Ver HashMap
				visualizaHashMap();
				
				break;
			case 2: // Añadir artículos
				agregarHashMap();
				
				break;
			case 3: //Actualizar el estante
				eliminarHashMap();
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
				+ "\n1.- Ver lista de artículos"
			    + "\n2.- Agregar un artículo"
				+ "\n3.- actualizar nombre"
			    + "\n4.- Eliminar un cromo"
			    
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
			System.out.println(" id del cromo: " + claves[i].toString() + " - Objeto obtenido: "  + hm.get(claves[i]));
		}
		}
	
	public static void agregarHashMap() {
	
		nombre = JOptionPane.showInputDialog("Inserte el nombre del cromo: ");
		id= Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del cromo: "));
		puntostemporadapasada= Integer.parseInt(JOptionPane.showInputDialog("Inserte los puntos de la temporada pasada: "));
		rebotestemporadapasada= Integer.parseInt(JOptionPane.showInputDialog("Inserte los rebotes de la temporada pasada: "));

		hm.put(id, new CromoBaloncesto(id,nombre,puntostemporadapasada , rebotestemporadapasada));
		
	}
	
	public static void eliminarHashMap() {
		int id;
		id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del cromo para eliminarlo: "));
		hm.remove(id);
	}
	

	}


