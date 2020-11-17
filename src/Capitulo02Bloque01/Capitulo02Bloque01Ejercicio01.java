package Capitulo02Bloque01;
import javax.swing.JOptionPane;

public class Capitulo02Bloque01Ejercicio01 {

	public static void main(String[] args) {
		int numero;
		int numero1;
		String str = JOptionPane.showInputDialog("Introduzca un número:"); // Sacamos ventana en pantalla y obtenemos un String
		numero = Integer.parseInt(str); // Convierto la variable escrita en un número 
		String str1 = JOptionPane.showInputDialog("Introduzca otro número:"); // Sacamos ventana en pantalla y obtenemos un String
		numero1 = Integer.parseInt(str1); // Convierto la variable escrita en un número 
		
		if (numero>numero1) {
			System.out.println("El número mayor es: " + numero);
		}
		else {
			System.out.println("El número mayor es: " + numero1);
			
		}
		
		
		
			
			
		}
		

	}


