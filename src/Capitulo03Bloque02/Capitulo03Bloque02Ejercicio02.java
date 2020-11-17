package Capitulo03Bloque02;
import javax.swing.JOptionPane;

public class Capitulo03Bloque02Ejercicio02 {

	public static void main(String[] args) {
		int mayor=0;
		int n;
		int menor=1000000000;
		String str1 = JOptionPane.showInputDialog("Introduzca cuantos números quiere introducir:"); // Sacamos ventana en pantalla y obtenemos un String
   		n = Integer.parseInt(str1); // Convierto la variable escrita en un número entero 
		for(int i=1; i<=n; i++) {
			int numero;
			String str = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
	   		numero = Integer.parseInt(str); // Convierto la variable escrita en un número entero 
			if(mayor < numero) {
			mayor = numero;
			}	
			if(menor > numero) {
				menor = numero;
				}
	}
		
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);
	}
}

