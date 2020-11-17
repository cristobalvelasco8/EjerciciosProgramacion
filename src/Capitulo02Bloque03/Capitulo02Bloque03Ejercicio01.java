package Capitulo02Bloque03;
import javax.swing.JOptionPane;

public class Capitulo02Bloque03Ejercicio01 {

	public static void main(String[] args) {
	String str = JOptionPane.showInputDialog("Escribe la nota");
    int nota = Integer.parseInt(str);
    // Introducimos el switch para que compare la variable y muestre el resultado
    switch (nota) {
    case 0:
    case 1:
    case 2:
    	System.out.println("Muy decifiente");
    	break;
    case 3:
    case 4:
    	System.out.println("Decifiente");
    	break;
    case 5:
    	System.out.println("Suficiente");
    	break;
    case 6:
    	System.out.println("Bien");
    	break;
    case 7:
    case 8:
    System.out.println("Notable");
    break;
    case 9:
    case 10:
    	System.out.println("Sobresaliente");
    	break;
    default:
		System.out.println("Error, el valor no pertenece a ninguna nota");
    	
    }
	}

}

		    		
		