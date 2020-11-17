package Capitulo02Bloque02;
import javax.swing.JOptionPane;

public class Capitulo02Bloque02Ejercicio02 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		int cont1=0;
		int cont2=0;
		int cont3=0;
		String str1 = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
		num1 = Integer.parseInt(str1); // Convierto la variable escrita en un número entero 
		String str2 = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
		num2 = Integer.parseInt(str2); // Convierto la variable escrita en un número entero 
		String str3 = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
		num3 = Integer.parseInt(str3); // Convierto la variable escrita en un número entero 
		String str4 = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
		num4 = Integer.parseInt(str4); // Convierto la variable escrita en un número entero 
		String str5 = JOptionPane.showInputDialog("Introduzca un número entero:"); // Sacamos ventana en pantalla y obtenemos un String
		num5 = Integer.parseInt(str5); // Convierto la variable escrita en un número entero 
		
			if (num1 >= 0 & num1 <= 25) { 
				cont1++;
				}
			if (num2 >= 0 & num2 <= 25) { 
				cont1++;
				}
			if (num3 >= 0 & num3 <= 25) { 
				cont1++;
				}
			if (num4 >= 0 & num4 <= 25) { 
				cont1++;
				}
			if (num5 >= 0 & num5 <= 25) { 
				cont1++;
				}
			System.out.println("la cantidad de números del 2º bloque es: " + cont1);
			
				if (num1 >= 26 & num1 <= 250) { 
					cont2++;
					}
				if (num2 >= 26 & num2 <= 250) { 
					cont2++;
					}
				if (num3 >= 26 & num3 <= 250) { 
					cont2++;

					}
				if (num4 >= 26 & num4 <= 250) { 
					cont2++;
					}
				if (num5 >= 26 & num5 <= 250) { 
					cont2++;
					}
				System.out.println("La cantidad de números del 3º bloque es: " + cont2);
				
				    if (num1 > 250) { 
					    cont3++;
					}
					if (num2 > 250) { 
						cont3++;
						}
					if (num3 > 250) { 
						cont3++;
						}
					if (num4 > 250) { 
						cont3++;
						}
					if (num5 > 250) { 
						cont3++;
						}
					System.out.println("La cantidad de números del 4º bloque es: " + cont3);
		
		}
		
	}




		


