package capitulo06_Recursos.wrapper;

import javax.swing.JOptionPane;

public class Act2 {

	public static void main(String[] args) {
		boolean noalfanumerico = false;
		boolean digito = false;
		boolean minuscula = false;
		boolean mayuscula = false;
		int i;
		
		do {

			String contr = JOptionPane.showInputDialog(
					"Introduce una contraseña que tenga:\n" + "Al menos una mayúscula\n" + "Al menos una min�scula\n"
							+ "Al menos un dígito\n" + "Al menos un carácter no alfanumérico");

			char cad[];
			cad = contr.toCharArray();
			
			for (i = 0; i < cad.length; i++) {

					if (digito == false) {
						digito = Character.isDigit(cad[i]);
					}
					if (mayuscula== false) {
						mayuscula = Character.isUpperCase(cad[i]);
					}
					if (minuscula==false) {
						minuscula = Character.isLowerCase(cad[i]);
					}
					if (noalfanumerico== false) {
						noalfanumerico = Character.isLetterOrDigit(cad[i]);
					}
				}
			System.out.println("Contraseña incorrecta.");

		} while (digito == false || minuscula == false || mayuscula == false || noalfanumerico == false);
		System.out.println("Contraseña válida.");

	}


}

