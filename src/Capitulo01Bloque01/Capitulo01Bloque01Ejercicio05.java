package Capitulo01Bloque01;
import javax.swing.JOptionPane;

public class Capitulo01Bloque01Ejercicio05 {

	public static void main(String[] args) {
		int numEntero;        //Declaración de una variable entera
	    int numEntero1;       //Declaración de una variable entera
		
		 String str = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
		numEntero = Integer.parseInt(str); // Convierto la variable escrita en un número entero 
		
		
		String str1 = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
		numEntero1 = Integer.parseInt(str1); // Convierto la variable escrita en un número entero 
		
		System.out.println("Los números introducidos son: ");
		System.out.println(numEntero + " " + numEntero1 ); // Muestro los números en pantalla
		System.out.println("Los números intercambiados son: ");
		System.out.println(numEntero1 + " " + numEntero ); // Muestro los números en pantalla intercambiados

	}

}
