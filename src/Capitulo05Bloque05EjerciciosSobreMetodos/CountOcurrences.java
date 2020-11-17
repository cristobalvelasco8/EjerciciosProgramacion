package Capitulo05Bloque05EjerciciosSobreMetodos;

public class CountOcurrences {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,9,7,4,9,2,9};
		countOcurrences(arr,9);
   /**Realiza un método llamado "countOccurrences", que reciba:
   - Un array de números enteros.
   - Un valor entero.
    El método debe devolver un valor entero,
     que corresponda con el número de veces que el valor entero 
     recibido como segundo parámetro exista dentro del array recibido como primer parámetro.
    * 
    */
	}
	public static void countOcurrences(int[] array, int entero) {
	 int arr[]= new int[array.length];
	 int cont=0;
	 for(int i=0; i<array.length; i++) {
		 arr[i]=array[i];
		 if(arr[i]==entero) {
			 cont++;
		 }
		System.out.print(arr[i]+ " ");
	 }
	 System.out.println();
	 System.out.print("Se repite " + cont + " veces");
			 
	}

}
