package Capitulo01Bloque01;
import javax.swing.JOptionPane;

public class Capitulo01Bloque01Ejercicio08 {

	public static void main(String[] args) {
		int numero1;
		String str1 = JOptionPane.showInputDialog("Introduzca un número entero:");
		numero1 = Integer.parseInt(str1);
		
		if (numero1%2==0) {
		System.out.println("El número par es: " + numero1);
		}
		else {
			System.out.println("El número impar es: " + numero1);	
			}

	}

}
