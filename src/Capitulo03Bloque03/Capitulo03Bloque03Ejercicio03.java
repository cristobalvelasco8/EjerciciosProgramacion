package Capitulo03Bloque03;
import javax.swing.JOptionPane;

public class Capitulo03Bloque03Ejercicio03 {

	public static void main(String[] args) {
		int numero=3, mayor=0, i;
   		for( i=0; numero!=0; i++)  {
   			String str1 = JOptionPane.showInputDialog("Introduzca un número(0-> para terminar:"); // Sacamos ventana en pantalla y obtenemos un String
   	   		numero = Integer.parseInt(str1); // Convierto la variable escrita en un número entero 
   	   	if (i==0) {
   			mayor=numero;
   		}
	   	
	   		if(mayor < numero && numero!=0) {
			mayor = numero;
			}
	}
   		System.out.println("El mayor es: " + mayor);
}
}


	
