package Capitulo01Bloque01;
import javax.swing.JOptionPane;

public class Capitulo01Bloque01Ejercicio02 {

	public static void main(String[] args) {
	int numEntero;        //Declaración de una variable entera
     float numFlotante;   //Declaración de una variable flotante
	 double numDouble;  //Declaración de una variable double
	
	 String str = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
	numEntero = Integer.parseInt(str); // Convierto la variable escrita en un número entero 
	System.out.println("Número introducido:" + numEntero ); // Muestro el número en pantalla 
	
	String str1 = JOptionPane.showInputDialog("Introduzca un número flotante:"); // Sacamos ventana en pantalla y obtenemos un String
		numFlotante = Float.parseFloat(str1); // Convierto la variable escrita en un número flotante
		System.out.println("Número introducido:" + numFlotante ); // Muestro el número en pantalla 
		
		String str2 = JOptionPane.showInputDialog("Introduzca un número double:"); // Sacamos ventana en pantalla y obtenemos un String
   		numDouble = Double.parseDouble(str2); // Convierto la variable escrita en un número Double 
   		System.out.println("Número introducido:" + numDouble ); // Muestro el número en pantalla
		
		


	}

}
