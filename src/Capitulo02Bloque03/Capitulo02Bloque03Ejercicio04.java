package Capitulo02Bloque03;
import javax.swing.JOptionPane;

public class Capitulo02Bloque03Ejercicio04 {

	public static void main(String[] args) {
	String str = JOptionPane.showInputDialog("Escribe el importe");
	int importe = Integer.parseInt(str);
	String str1 = JOptionPane.showInputDialog("Escribe la cantidad");
	int cantidad = Integer.parseInt(str1);
	int monedasde100 = (cantidad-importe)/100;
	int monedasde50 = ((cantidad-importe)%100)/50;
	int monedasde25 = (((cantidad-importe)%100)%50)/25;
	int monedasde5 = ((((cantidad-importe)%100)%50)%25)/5;
	int monedasde1 = (((((cantidad-importe)%100)%50)%25)%5)/1;
	
	if(monedasde100 != 0) {
		System.out.println("Monedas de 100: " + monedasde100);
	}
	if(monedasde50 != 0) {
		System.out.println("Monedas de 50: " + monedasde50);
	}
	if(monedasde25 != 0) {
		System.out.println("Monedas de 25: " + monedasde25);
	}
	if(monedasde5 != 0) {
		System.out.println("Monedas de 5: " + monedasde5);
	}
	if(monedasde1 != 0) {
		System.out.println("Monedas de 1: " + monedasde1);
	}
	}

}
