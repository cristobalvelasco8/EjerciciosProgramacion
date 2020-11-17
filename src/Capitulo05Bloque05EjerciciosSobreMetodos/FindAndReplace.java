package Capitulo05Bloque05EjerciciosSobreMetodos;

public class FindAndReplace {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,12,4,5};
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
				
		}
		int buscar= 12;
		int remplazar= 20;
		System.out.println("");
		findAndReplace(array, buscar, remplazar);
		
		
		
		
	
	/**
	 * Un método llamado "findAndReplace", que reciba: 
   - Un array de números enteros.
   - Un valor entero que debe buscarse en el array.
   - Un valor entero que debe servir para reemplazar.
     El método buscará todas las ocasiones en las que el segundo parámetro aparezca dentro del array y reemplazará ese valor con el valor del tercer parámetro.
     El método main debe crear un array, imprimirlo en consola, llamar al método "findAndReplace" y volver a imprimir el array en consola	
	 */
	

	}
	public static void findAndReplace (int[] array, int buscar, int remplazar) {
		 
		 for(int i=0; i<array.length; i++) {
			if(array[i]==buscar) {
				array[i]=remplazar;
			}
			System.out.print(array[i]+ " ");
		 }
		 
		


}
}
