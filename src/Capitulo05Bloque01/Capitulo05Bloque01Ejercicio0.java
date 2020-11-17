package Capitulo05Bloque01;
import Utils.Utils;

public class Capitulo05Bloque01Ejercicio0 {

	public static void main(String[] args) {
		// Declaro las variables implicadas en el programa
				int mayor, menor, suma;

				// Declaración del array, a través de la sentencia "new"
				int numeros[] = new int[150];
				
				// Inicializo el array
				for (int i = 0; i < numeros.length; i++) {
					numeros[i] = Utils.obtenerNumeroAzar();
				}
				
				// Muestro el array en pantalla
				for (int i = 0; i < numeros.length; i++) {
					System.out.print(numeros[i] + " ");
				}
				
				// Comienzo asumiendo que el primer número del array es, al mismo tiempo, el
				// mayor y el menor
				mayor = numeros[0];
				menor = numeros[0];
				suma = numeros[0];
				
				// Una vez he trabajado con el primer elemento del array, recorro a partir de 
				// la posición 1 para descubrir mayores y menores, y calcular la suma
				for (int i = 1; i < numeros.length; i++) {
					suma += numeros[i];
					if (numeros[i] > mayor) {
						mayor = numeros[i];
					}
					if (numeros[i] < menor) {
						menor = numeros[i];
					}
				}
				
				// Muestro los resultados en consola. Para mostrar la media, la calculo
				System.out.println("mayor " + mayor + " menor " + menor + " suma " + suma +
						" media " + (suma / (float) numeros.length));
			}
	

	}


