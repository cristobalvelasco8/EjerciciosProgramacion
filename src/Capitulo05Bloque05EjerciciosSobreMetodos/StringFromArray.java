package Capitulo05Bloque05EjerciciosSobreMetodos;

public class StringFromArray {

	public static void main(String[] args) {
		int array[] = new int [5];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.Utils.obtenerNumeroAzar();
		}
		System.out.println(stringFromArray(array));
	
	
	/**
	 *Un método llamado "stringFromArray",
	 *que reciba un array de números enteros y devuelva una cadena de caracteres.
	 *El método debe recorrer el array, de la misma forma en la que harías para mostrarlo en consola,
	 *pero en lugar de imprimir en consola debes construir un objeto String.
	 *Finalmente debes devolver el String e imprimirlo en el método "main".
	 */

	}
	public static String stringFromArray(int[] array) {
		String str = " ";
		 for(int i=0; i<array.length; i++) {
			 str += array[i] + " ";
		 }
		 return str ;
			
		
		
	}

	}

