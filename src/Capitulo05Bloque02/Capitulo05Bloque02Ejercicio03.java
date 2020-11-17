package Capitulo05Bloque02;

import Utils.Utils;

public class Capitulo05Bloque02Ejercicio03 {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int limiteSup= 100;
		int limiteInf= 0;
		int numero = Utils.obtenerEntero();
		// Inicializo el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar(limiteSup,limiteInf);
		}
		
		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]  + " ");
			
		}
		System.out.println();
		System.out.println("Muestro números multiplicados por usuario");
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i]*(numero)  + " ");
		}
		

	}

}
