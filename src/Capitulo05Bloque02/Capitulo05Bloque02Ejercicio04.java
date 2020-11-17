package Capitulo05Bloque02;

import Utils.Utils;

public class Capitulo05Bloque02Ejercicio04 {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		int limiteSup= 100;
		int limiteInf= 0;
		int ultimo;
		int lista[] = new int[5];
		ultimo=lista[lista.length-1];
		
		// Muestro el array en pantalla
		for (int i = lista.length-1; i > 0; i--) {
			lista[i]=lista[i-1];
	     }
		lista[0]=ultimo;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar(limiteSup,limiteInf);
		System.out.print(numeros[i]+ " ");
		//Desplazar de izquierda a derecha
		System.out.print(numeros[i]+ " ");
		}
	}

	}
	
		
	



