package Capitulo03Bloque03;
import javax.swing.JOptionPane;

public class Capitulo03Bloque03Ejercicio04 {

	public static void main(String[] args) {
	int menor=1000000000;
		for(int i=1; i<=1000000000; i++) {
			int numero;
			String str = JOptionPane.showInputDialog("Introduzca un número(0-> para terminar:"); // Sacamos ventana en pantalla y obtenemos un String
	   		numero = Integer.parseInt(str); // Convierto la variable escrita en un número entero 
	   	
	   		if(menor > numero && numero!=0) {
			menor = numero;
			}
	   		if (numero==0) {
	   			break;
	   		}
		}
		System.out.println("El menor es: " + menor);
		
	}
}


