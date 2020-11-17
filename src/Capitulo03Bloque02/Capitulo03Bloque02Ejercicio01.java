package Capitulo03Bloque02;
import javax.swing.JOptionPane;

public class Capitulo03Bloque02Ejercicio01 {

	public static void main(String[] args) {
	int suma= 0;
	int n;
	String str = JOptionPane.showInputDialog("Introduzca cuántos numeros quiere introducir");
    n = Integer.parseInt(str);
    for(int i=1; i<=n; i++) {
    int numero;
    String str1 = JOptionPane.showInputDialog("Introduzca un número");
    numero = Integer.parseInt(str1);
    suma= suma + numero;	
    }
    System.out.println("La media es : " + suma/n);
	}

}
