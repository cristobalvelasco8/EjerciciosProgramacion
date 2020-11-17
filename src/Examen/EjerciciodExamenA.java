package Examen;
import Utils.Utils;

public class EjerciciodExamenA {

	public static void main(String[] args) {
	int array[]=new int[20];
	 int limiteSup=100;
	 int limiteInf=0;
	 //Inicalizo el array
	 for(int i=0; i<array.length; i++) {
       array[i]=Utils.obtenerNumeroAzar(limiteSup,limiteInf);
	}
	 //Muestro el array
	 for(int i=0; i<array.length; i++) {
		 System.out.print(array[i] + " ");
	 }
	 
				
	}
}
