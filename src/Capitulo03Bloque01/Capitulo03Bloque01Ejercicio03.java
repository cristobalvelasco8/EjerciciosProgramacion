package Capitulo03Bloque01;
import javax.swing.JOptionPane;

public class Capitulo03Bloque01Ejercicio03 {

	public static void main(String[] args) {
		int n;
		int cont1 = 0;
		int cont2 = 0;
		String str1 = JOptionPane.showInputDialog("Introduzca cuantos números quiere introducir:"); // Sacamos ventana en pantalla y obtenemos un String
   		n = Integer.parseInt(str1); // Convierto la variable escrita en un número entero 
		for(int i=1; i<=n; i++) {
			int numero;
			String str = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
	   		numero = Integer.parseInt(str); // Convierto la variable escrita en un número entero 
			if(numero < 0) {
				cont1++;
			}
			else {
				cont2++;
			}
	}
		System.out.println("La cantidad de números negativos es: " + cont1);
		System.out.println("La cantidad de números positivos es: " + cont2);
}
}
