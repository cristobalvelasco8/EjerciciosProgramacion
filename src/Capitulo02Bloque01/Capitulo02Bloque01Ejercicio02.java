package Capitulo02Bloque01;
import javax.swing.JOptionPane;

public class Capitulo02Bloque01Ejercicio02 {

	public static void main(String[] args) {
		int numEntero1;
		int numEntero2;
		String str = JOptionPane.showInputDialog("Introduzca un número"); // Sacamos ventana en pantalla y obtenemos un String
		numEntero1 = Integer.parseInt(str); // convierto la variable en un número
		String str1 = JOptionPane.showInputDialog("Introduzca otro número"); // Sacamos ventana en pantalla y obtenemos un String
		numEntero2 = Integer.parseInt(str1); // convierto la variable en un número
		
		if(numEntero1<numEntero2) {
		System.out.println("El número menor es: " + numEntero1);
		}
		else {
			System.out.println("El número menor es: " + numEntero2);
		}
	}

}
