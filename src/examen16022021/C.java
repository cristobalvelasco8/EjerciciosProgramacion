package examen16022021;

import javax.swing.JOptionPane;

public class C {
	public static void main(String[] args) {
		
		
		String str = JOptionPane.showInputDialog("Introduce algo");
		
		
		System.out.println("Eliminación de los espacios en blanco iniciales: " + new String((str)).trim());
		
		char cadenaTexto[] = new char[] {'H', 'o', 'l', 'a','2'};
		System.out.println ("\nAnalizará el array de caracteres: " + cadenaTexto.toString());
		for (int i = 0; i < cadenaTexto.length; i++) {
			System.out.println("'" + cadenaTexto[i] + "' es dígito: " + Character.isDigit(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es letra: " + Character.isLetter(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es minúscula: " + Character.isLowerCase(cadenaTexto[i]));
			System.out.println("'" + cadenaTexto[i] + "' es mayúscula: " + Character.isUpperCase(cadenaTexto[i]));
		}
				
		}
	}




