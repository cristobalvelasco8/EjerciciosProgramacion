package Capitulo05Bloque02;

import Utils.Utils;

public class Capitulo05Bloque02Ejercicio02 {

	public static void main(String[] args) {
	int array1[]= new int[150];
	int array2[]= new int[150];
	int array3[]= new int[150];
	int limiteSup=100;
	int limiteInf=0;
	
	//Array 1
	for (int i=0; i<array1.length; i++) {
	array1[i] = Utils.obtenerNumeroAzar(limiteSup,limiteInf);
	}
	
	for (int i = 0; i < array1.length; i++) {
		System.out.print(array1[i]  + " ");	
	}
	
	System.out.println();
	
	//Array 2
	for (int i=0; i<array2.length; i++) {
	array2[i] = Utils.obtenerNumeroAzar(limiteSup,limiteInf);
	}
	
	for (int i = 0; i < array2.length; i++) {
		System.out.print(array2[i]  + " ");
	}
	
	System.out.println();
	
	//Array 3
	for (int i=0; i<array3.length; i++) {
		if(i%2==0) {
			array3[i] = array1[i];
			System.out.print(array3[i] + " ");
		}
		if(i%2!=0) {
			array3[i] = array2[i];
			System.out.print(array3[i] + " ");
		}
		}
	
	
}
}
