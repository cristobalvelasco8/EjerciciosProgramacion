package capitulo06_Recursos.Math;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce la A dentro de la ecuación");
		double a = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce la B dentro de la ecuación");
		double b = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce la C dentro de la ecuación");
		double c = Integer.parseInt(str);
		
		double x1= ((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
		
		double x2= ((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
		
		System.out.println("La primera solucion es " + x1);
		System.out.println("La segunda solución es " + x2);
	}
	
	

}
