package Capitulo05Bloque01;
import Utils.Utils;

public class Capitulo05Bloque01Ejercicio01{
	public static void main(String[] args) {
		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[150];
		
		int limiteInf = Utils.obtenerEntero();
		int limiteSup = Utils.obtenerEntero();
		// Inicializo el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar(limiteInf, limiteSup);
		}
		
		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
	
	}
	
}
		






        

	


