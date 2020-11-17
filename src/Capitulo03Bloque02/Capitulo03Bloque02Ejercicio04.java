package Capitulo03Bloque02;
import javax.swing.JOptionPane;

public class Capitulo03Bloque02Ejercicio04 {

	public static void main(String[] args) {
		int n;
		int limite;
		String str = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
   		n = Integer.parseInt(str); // Convierto la variable escrita en un número entero
   		String str1 = JOptionPane.showInputDialog("Introduzca cuál es el límite:"); // Sacamos ventana en pantalla y obtenemos un String
   		limite = Integer.parseInt(str1); // Convierto la variable escrita en un número entero 
   		System.out.println("Los múltiplos son:");
   		for(int i=n; i<=limite; i=i+n) {
		System.out.println(i);

	}

}
}
