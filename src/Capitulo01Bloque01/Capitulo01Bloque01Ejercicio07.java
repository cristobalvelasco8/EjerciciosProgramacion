package Capitulo01Bloque01;
import javax.swing.JOptionPane;

public class Capitulo01Bloque01Ejercicio07 {

	public static void main(String[] args) {
		int numentero;
		 String str = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
		numentero = Integer.parseInt(str); // Convierto la variable escrita en un número entero 
		System.out.println("\nOperación lógica NOT: " + ~numentero + 1);
		
		
		
		
	}

}
