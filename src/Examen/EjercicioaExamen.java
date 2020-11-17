package Examen;

import Utils.Utils;

public class EjercicioaExamen {

	public static void main(String[] args) {
	int array1[]=new int[100];
	int limiteInf=0;
	int limiteSup=1000;
	int mayor;
	int menor;
	int suma;
	for(int i=0; i<array1.length; i++) {
    array1[i] = Utils.obtenerNumeroAzar(limiteSup,limiteInf);
	}
	for(int i=0; i<array1.length; i++) {
	     System.out.print(array1[i] + " ");
		}
	mayor=array1[0];
	menor=array1[0];
	suma=array1[0];
	for (int i = 1; i < array1.length; i++) {
		suma += array1[i];
		if (array1[i] > mayor) {
			mayor = array1[i];
		}
		if (array1[i] < menor) {
			menor = array1[i];
		}
		
	}
	System.out.println();
	System.out.print("mayor " + mayor + " " + "menor " + menor + " " + "media " + (suma/(float)array1.length));

}
}
