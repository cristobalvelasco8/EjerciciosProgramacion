package Capitulo03Bloque01;
import javax.swing.JOptionPane;

public class Capitulo03Bloque01Ejercicio02 {

	public static void main(String[] args) {
		int suma=0;
		int n;
		String str1 = JOptionPane.showInputDialog("Introduzca cuantos números quiere introducir:"); // Sacamos ventana en pantalla y obtenemos un String
   		 n = Integer.parseInt(str1);
		for(int i=1; i<=n; i++) {
			int numero;
			String str = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
	   		numero = Integer.parseInt(str);
			if(numero >= 10) {
			suma = suma + numero;
			
			}	
	}
		
		System.out.println("la suma de los números mayores de 10 es: " + suma);
	}
}
