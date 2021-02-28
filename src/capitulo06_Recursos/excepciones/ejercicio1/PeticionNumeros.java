package capitulo06_Recursos.excepciones.ejercicio1;

import javax.swing.JOptionPane;



public class PeticionNumeros {
	/*
	 * 1º.- Implementa un programa que contenga una clase llamada "PeticionNumeros", con un método "pideNumeroPar()".
	 *  Desde un método "main()" llama al método anterior.
	 *   Dentro del método "pideNumeroPar()" debes crear todo lo necesario para disparar una Exception, creada por ti, cuando el número introducido no sea un número par.
	 */

	public static void main(String[] args) {
		pideNumeroPar();

	}
	public static void pideNumeroPar() {
		int numero2;
		String str;
		try {
		str = JOptionPane.showInputDialog("Introduzca un número par");
		numero2 = Integer.parseInt(str);	
		
			if (numero2 % 2==0) {
			    System.out.println("El número es par");
			}
			else {
			    System.out.println("El número es impar");
			    throw new Excepcion ("El número introducido es impar");
			}
			System.out.println("El numero introducido es: " + numero2);
		}catch (Excepcion e) {
			System.out.println(e);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}


