package Capitulo05Bloque01;
import Utils.Utils;

public class Capitulo05Bloque01Ejercicio03 {

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
		
		int num = Utils.obtenerEntero();
		int cont=0;
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]==num) {
			cont=i;
			}
		}
		if(cont != 0) {
			System.out.println("Sí, se encuentra en la posición: " + cont);
		}
		else {
			System.out.println("No, no se encuentra");
		}
	}

}
