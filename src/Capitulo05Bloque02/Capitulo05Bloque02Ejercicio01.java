package Capitulo05Bloque02;

import Utils.Utils;

public class Capitulo05Bloque02Ejercicio01 {

	public static void main(String[] args) {
		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[150];
		int limiteSup= 100;
		int limiteInf= -100;
		// Inicializo el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar(limiteSup, limiteInf);
		}
		
		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i] + " ");	
		}
		System.out.println();
		System.out.println("Números pares cambiados de signo:");
		for (int i = 0; i< numeros.length; i++) {
			if (numeros[i]%2==0) {
				
				System.out.print(numeros[i]*(-1) + " ");	
			}
			
			
	}
	}
}
