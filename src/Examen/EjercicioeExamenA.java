package Examen;
import Utils.Utils;

public class EjercicioeExamenA {

	public static void main(String[] args) {
		int array[]=new int[100];
		 int numero= Utils.obtenerEntero();
		 //Inicalizo el array
		 for(int i=0; i<array.length; i++) {
	       array[i]=Utils.obtenerNumeroAzar();
		}
		 //Muestro el array
		 for(int i=0; i<array.length; i++) {
			 System.out.print(array[i] + " ");
	}
		 System.out.println();
		 for(int i=0; i<array.length; i++) {
		    if (numero==array[i]) {
		    	System.out.print("El número encontrado por el usuario es: " + numero + " ");
		    }
		 }
		 
		 
		

}
}
