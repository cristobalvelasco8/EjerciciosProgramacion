package Capitulo05Bloque05EjerciciosSobreMetodos;

public class AddInteger {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		addInteger(arr, 7);
    /**Realiza un método llamado "addInteger", que reciba:
   - Un array de números enteros.
   - Un valor entero.
     Dentro del método debes:
   - Crear un nuevo array, cuya longitud sea la del array recibido como primer parámetro + 1.
   - Copiar el array del primer parámetro en el array creado dentro del método, elemento tras elemento.
   - Agregar el nuevo elemento al final del nuevo array.
   - Asignar, al array recibido mediante el primer parámetro, el puntero al nuevo array creado en el interior del método.
   - El método debe devolver un array de tipo entero. Main debe recoger el array devuelto e imprimirlo en consola.
     * 
     */
	}
	public static void addInteger (int[] array, int entero) {
	int arr[] = new int [array.length+1];
	for (int i = 0; i < array.length; i++) {
		arr[i]=array[i];
		System.out.print(arr[i]+ " ");
	}
	arr[array.length]=entero;
	System.out.print(arr[array.length] + " ");
	
}
}
