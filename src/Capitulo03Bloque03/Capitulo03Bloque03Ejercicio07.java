package Capitulo03Bloque03;
import javax.swing.JOptionPane;

public class Capitulo03Bloque03Ejercicio07 {

	public static void main(String[] args) {
		int cont1 = 0;
		int cont2 = 0;
		for(int i=1; i<=1000000000; i++) {
		int numero;
			String str = JOptionPane.showInputDialog("Introduzca un número entero(0-> pra terminar):"); // Sacamos ventana en pantalla y obtenemos un String
	   		numero = Integer.parseInt(str); // Convierto la variable escrita en un número entero 
			if(numero < 0) {
				cont1++;
			}

			else if(numero > 0) {
				cont2++;
			}
			else {break;
			
			}
			
		}
		
			
		System.out.println("la cantidad de numeros positivos: " + cont1);
		System.out.println("la cantidad de numeros negativos: " + cont2);
}
}


