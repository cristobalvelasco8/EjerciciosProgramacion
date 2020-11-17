package Examen;
import Utils.Utils;

public class EjerciciocExamenA {

	public static void main(String[] args) {
	int array[]= new int [20];
	 int limiteSup=100;
	 int limiteInf=25;
	 //Inicializo el array
	 for(int i=0; i<array.length; i++) {
		 array[i]= Utils.obtenerNumeroAzar(limiteSup,limiteInf);
	 }
	//Muestro el array en pantalla
	 for(int i=0; i<array.length; i++) {
       System.out.print(array[i] + " ");
	}
	 System.out.println();
	 System.out.print("Números pares:");
		for (int i = 0; i< array.length; i++) {
			if (array[i]%2==0) {
				
				System.out.print(array[i] + " ");	
			}

}
}
}
