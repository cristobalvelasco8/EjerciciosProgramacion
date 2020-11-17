package Capitulo02Bloque03;
import javax.swing.JOptionPane;

public class Capitulo02Bloque03Ejercicio03 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Escribe la opción");
	    int opcion = Integer.parseInt(str);
	    // Introducimos el switch para que compare la variable y muestre el resultado
	    switch (opcion) {
	    case 0:
	    	break;
	    case 1:
	    	String str1 = JOptionPane.showInputDialog("Introduzca cateto 1: ");
	        float numero1= Float.parseFloat(str1);
	        String str2 = JOptionPane.showInputDialog("Introduzca cateto 2: ");
	        float numero2= Float.parseFloat(str2);
	        System.out.println("la hipotenusa es: " + Math.sqrt(Math.pow(numero1,2) + Math.pow(numero2,2)));
	    	break;
	    case 2:
	    	String str3 = JOptionPane.showInputDialog("Introduzca el radio de la circunferencia: ");
	        float radio = Float.parseFloat(str3);
	        System.out.println("la superficie de una circunferencia es: " + 3.1416*radio*radio);
	    	break;
	    case 3:
	    	String str4 = JOptionPane.showInputDialog("Introduzca el radio de la circunferencia: ");
	        float radio2 = Float.parseFloat(str4);
	        System.out.println("Calculo del perímetro: " + 2*3.1416*radio2);
	    	break;
	    case 4:
	    	String str5 = JOptionPane.showInputDialog("Introduzca base: ");
	        float base= Float.parseFloat(str5);
	        String str6 = JOptionPane.showInputDialog("Introduzca altura: ");
	        float altura= Float.parseFloat(str6);
	        System.out.println("El área del rectángulo es: " + base*altura );
	    	break;
	    case 5:
	    	String str7 = JOptionPane.showInputDialog("Introduzca base: ");
	        float base1= Float.parseFloat(str7);
	        String str8 = JOptionPane.showInputDialog("Introduzca altura: ");
	        float altura1= Float.parseFloat(str8);
	        System.out.println("El área del triángulo es: " + (base1*altura1)/2 );
	        break;
	    default:
    		System.out.println("Opción incorrecta");
	}

}
}
