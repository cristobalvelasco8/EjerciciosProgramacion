package Capitulo05Bloque01;
import Utils.Utils;

public class Capitulo05Bloque01Ejercicio04 {

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
	int cont1=0;
	int cont2=0;
	for (int i = 0; i< numeros.length; i++) {
		if (numeros[i]%2==0) {
			cont1= cont1+numeros[i];
		}
		else {
			cont2 = cont2+numeros[i];
		}
	}
	System.out.println();
	System.out.println("la suma de los números pares es: " + cont1);
	System.out.println("la suma de los números impares es: " + cont2);
	}

}
