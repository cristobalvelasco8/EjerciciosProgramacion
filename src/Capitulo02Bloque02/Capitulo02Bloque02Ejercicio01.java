package Capitulo02Bloque02;
import javax.swing.JOptionPane;

public class Capitulo02Bloque02Ejercicio01 {

	public static void main(String[] args) {
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int suma1=0;
	int suma2=0;
	int suma3=0;
	int suma4=0;
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
	if (num1 < 0) { 
	suma1=suma1+num1;
	}
	if (num2 < 0) { 
		suma1=suma1+num2;
		}
	if (num3 < 0) { 
		suma1=suma1+num3;
		}
	if (num4 < 0) { 
		suma1=suma1+num4;
		}
	if (num5 < 0) { 
		suma1=suma1+num5;
		}
	System.out.println("la suma de los números del 1º bloque es: " + suma1);
	if (num1 >= 0 & num1 <= 25) { 
		suma2=suma2+num1;
		}
		if (num2 >= 0 & num2 <= 25) { 
			suma2=suma2+num2;
			}
		if (num3 >= 0 & num3 <= 25) { 
			suma2=suma2+num3;
			}
		if (num4 >= 0 & num4 <= 25) { 
			suma2=suma2+num4;
			}
		if (num5 >= 0 & num5 <= 25) { 
			suma2=suma2+num5;
			}
		System.out.println("la suma de los números del 2º bloque es: " + suma2);
		
		if (num1 >= 26 & num1 <= 250) { 
			suma3=suma3+num1;
			}
			if (num2 >= 26 & num2 <= 250) { 
				suma3=suma3+num2;
				}
			if (num3 >= 26 & num3 <= 250) { 
				suma3=suma3+num3;
				}
			if (num4 >= 26 & num4 <= 250) { 
				suma3=suma3+num4;
				}
			if (num5 >= 26 & num5 <= 250) { 
				suma3=suma3+num5;
				}
			System.out.println("la suma de los números del 3º bloque es: " + suma3);
			
			    if (num1 > 250) { 
				suma4=suma4+num1;
				}
				if (num2 > 250) { 
					suma4=suma4+num2;
					}
				if (num3 > 250) { 
					suma4=suma4+num3;
					}
				if (num4 > 250) { 
					suma4=suma4+num4;
					}
				if (num5 > 250) { 
					suma4=suma4+num5;
					}
				System.out.println("la suma de los números del 4º bloque es: " + suma4);
	
	}
	
}




	


