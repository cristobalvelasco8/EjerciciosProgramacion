package Capitulo03Bloque03;
import javax.swing.JOptionPane;

public class Capitulo03Bloque03Ejercicio05 {

	public static void main(String[] args) {
		int mayor=0;
		int menor=0;
		int numero=1;
		int i;
		for( i=0; numero!=0; i++) {
			String str = JOptionPane.showInputDialog("Introduzca un número entero(0->para terminar):"); // Sacamos ventana en pantalla y obtenemos un String
	   		numero = Integer.parseInt(str); // Convierto la variable escrita en un número entero 
	   		if (i==0) {
	   			mayor=numero;
	   		}
		   	
		   		if(mayor < numero && numero!=0) {
				mayor = numero;
				}
	   
		   		if (i==0) {
		   			menor=numero;
		   		}
			   	
			   		if(menor > numero && numero!=0) {
					menor = numero;
					}	
	
		}
		
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);
	}
	}





