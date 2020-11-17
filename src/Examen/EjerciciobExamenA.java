package Examen;
import Utils.Utils;

public class EjerciciobExamenA {

	public static void main(String[] args) {
		int array[]=new int[100];
		int limiteSup= Utils.obtenerEntero();
		int limiteInf= Utils.obtenerEntero();
		for(int i=0; i<array.length; i++) {
		array[i]= Utils.obtenerNumeroAzar(limiteSup,limiteInf);
	}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
	}
		System.out.println();
		for (int i = array.length-1; i >=0 ; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
