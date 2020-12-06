package Bloque06Capitulo5MetodosSobreRaices;

import java.util.Random;

public class Arraymatriz {
	
	public static void llenavector(int []ve ) {
		Random ri= new Random();
		for (int i=0; i<ve.length;i++) {
			ve[i]= ri.nextInt(100);
		}
		
	}
	 public static void mostrarvector (int[] ve) {
    	 for (int i=0; i<ve.length;i++) {
    		 System.out.print(" "+ve[i]);
    	 }
     }
	 public static void  pasarvectoramatriz(int fila, int columna, int[]ve, int[][]matriz) {
	    	int h = 0;
	    	 for (int i=0; i<fila; i++) {
	    		 for (int j=0; j<columna; j++) {
	    			 matriz [i][j]=ve[h];
	    		 h++;
	    		 }
	    	 }
	     }
	public static void  visualiza(int fila, int columna, int[][]matriz) {
    	 for (int i=0; i<fila; i++) {
    		 System.out.println();
    		 for (int j=0; j<columna; j++) {
    			 System.out.print(" "+matriz [i][j]);
    		 }
    	 }
	}
	

     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int filas = 3;
          int columnas = 3;
          int [][]m= new int[filas][columnas];
          int []v = new int [9];
          llenavector(v);
          System.out.println(" ");
          mostrarvector(v);
          System.out.println(" ");
          pasarvectoramatriz(filas,columnas,v,m);
          visualiza(filas,columnas, m);
	}

}
