package Capitulo05Bloque05EjerciciosSobreMetodos;

public class RemoveInteger {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5,6,7,8,7,9,7,2} ;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
     int[] nuevoarray= removeInteger(array, 7);
     for (int i = 0; i < nuevoarray.length; i++) {
	System.out.print(nuevoarray[i] + " " );
     }	
     /**Realiza un método llamado "removeInteger", que reciba:
   - Un array de números enteros.
   - Un valor entero.
     Si el valor entero recibido como segundo parámetro existe dentro del array recibido como primer parámetro, debes conseguir que ese valor desaparezca del array. Puedes seguir la siguiente guía:
   - Utiliza el método del ejercicio 4 para saber cuántas veces aparece el valor entero (segundo parámetro) dentro del array (primer parámetro).
   - Crea un nuevo array, que tenga la dimensión del array recibido como primer parámetro menos la cantidad de veces que el valor entero del segundo parámetro aparezca en dicho array.
   - Copia todos los elementos del array recibido como primer parámetro, dentro del nuevo array creado por ti en el método. Lógicamente no debes copiar en el array los valores del primer array que coincidan con el valor introducido como segundo parámetro.
   - Devuelve el nuevo array.
El método debe devolver "int[]". El método main debe recoger el nuevo array creado e imprimir en consola
	 * 
	 */	

	}


    public static int[] removeInteger (int[] array, int entero) {
    int cont=0;
     for (int i = 0; i < array.length; i++) {
    	 if(array[i]==entero) {
    		 cont++;
    	 }
}
     System.out.println(" ");
     int[] arraynuevo= new int[array.length-cont];
     int j=0;
     for(int i=0; i<array.length; i++) {
    	 if(array[i]!=entero) {
    		arraynuevo[j]=array[i];
    		j++;
    	 }
     }
     return arraynuevo;

}
}
