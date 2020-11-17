package Capitulo03Bloque02;
import javax.swing.JOptionPane;

public class Capitulo03Bloque02Ejercicio03 {

	public static void main(String[] args) {
		int n;
		String str = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
   		n = Integer.parseInt(str); // Convierto la variable escrita en un número entero
   		System.out.println("Los múltiplos son:");
   		for(int i=n; i<=100; i=i+n) {
		System.out.println(i);

	}

}
}
