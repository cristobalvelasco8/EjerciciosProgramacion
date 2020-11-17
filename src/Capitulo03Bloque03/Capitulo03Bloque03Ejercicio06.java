package Capitulo03Bloque03;
import javax.swing.JOptionPane;

public class Capitulo03Bloque03Ejercicio06 {

	public static void main(String[] args) {
     
      for (int i = 1; i<10000000; i++) {
    	  int factor = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número (0 para terminar)"));;
    	  if (factor==0) {
    		  break;
    	  }
		for (int j = 1; j<11; j++) {
			System.out.println(j + " x " + factor + " = " + (j * factor));
		}
		}
		
}
}

