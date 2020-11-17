package Capitulo03Bloque01;
import javax.swing.JOptionPane;

public class Capitulo03Bloque01Ejercicio01 {

	public static void main(String[] args) {
		int suma=0;
		for(int i=1; i<=4; i++) {
			int numero;
			String str = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
	   		numero = Integer.parseInt(str); // Convierto la variable escrita en un número entero 
			if(numero >= 10) {
			suma = suma + numero;
			
			}	
	}
		System.out.println("la suma de los números mayores de 10 es: " + suma);
	}
}

	