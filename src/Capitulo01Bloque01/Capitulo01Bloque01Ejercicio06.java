package Capitulo01Bloque01;
import javax.swing.JOptionPane;

public class Capitulo01Bloque01Ejercicio06 {

	public static void main(String[] args) {
	
		float Euribor;
		float Diferencial; 
		float Capital;	
		int N;
		float InteresAnual;
		float Im;
		float CuotaMensual;
		
		String str = JOptionPane.showInputDialog("Introduzca Euribor:"); // Sacamos ventana en pantalla y obtenemos un String
   		Euribor = Float.parseFloat(str); // Convierto la variable escrita en un número flotante
   		
   		String str1 = JOptionPane.showInputDialog("Introduzca Diferencial:"); // Sacamos ventana en pantalla y obtenemos un String
   		Diferencial = Float.parseFloat(str1); // Convierto la variable escrita en un número flotante
   		
   		String str2 = JOptionPane.showInputDialog("Introduzca Capital:"); // Sacamos ventana en pantalla y obtenemos un String
   		Capital = Float.parseFloat(str2); // Convierto la variable escrita en un número flotante
   		
   		String str3 = JOptionPane.showInputDialog("Introduzca N:"); // Sacamos ventana en pantalla y obtenemos un String
   		N = Integer.parseInt(str3); // Convierto la variable escrita en un número entero
		
		InteresAnual= Euribor + Diferencial;
		Im= (InteresAnual/12)/100;
		CuotaMensual= (float) (Capital * ((Im*Math.pow(1+Im,N)) / (Math.pow(1+Im,N)-1)));
		
		System.out.println(CuotaMensual); // Muestro Cuota Mensual en la pantalla
		

	}

}
