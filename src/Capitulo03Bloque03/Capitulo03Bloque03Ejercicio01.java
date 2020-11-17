package Capitulo03Bloque03;
import javax.swing.JOptionPane;

public class Capitulo03Bloque03Ejercicio01 {

	public static void main(String[] args) {
		int suma=0;
		int numero;
		for(int i=1; i<=1000000000; i++) {
		String str = JOptionPane.showInputDialog("Introduzca número (0 -> Terminar)\""); // Sacamos ventana en pantalla y obtenemos un String
	   	numero = Integer.parseInt(str);
	   	if(numero!=0) {
	   	suma= suma + numero;
	   	}
	   	else {
	   		break;
	   	}
		}
		System.out.println("La suma es: " + suma);
	}
}
	

