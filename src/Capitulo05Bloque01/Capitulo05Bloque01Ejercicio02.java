package Capitulo05Bloque01;
import Utils.Utils;

public class Capitulo05Bloque01Ejercicio02 {

	public static void main(String[] args) {
		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[150];
		int limiteSup= 100;
		int limiteInf= 0;
		// Inicializo el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar(limiteSup,limiteInf);
		}
		
		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println();
		
		// Muestro el array inverso en pantalla
		for (int i = numeros.length-1; i >=0 ; i--) {
			System.out.print(numeros[i] + " ");
		}

	}

}
