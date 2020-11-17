package Capitulo02Bloque01;
import javax.swing.JOptionPane;

public class Capitulo02Bloque01Ejercicio04 {

	public static void main(String[] args) {
		   int a;
		   int b;
		   int c;
		   int d;
		   int e;
		     String str1 = JOptionPane.showInputDialog("Introduzca un número");
		     String str2 = JOptionPane.showInputDialog("Introduzca un número");
		     String str3 = JOptionPane.showInputDialog("Introduzca un número");
		     String str4 = JOptionPane.showInputDialog("Introduzca un número");
		     String str5 = JOptionPane.showInputDialog("Introduzca un número");
		       a = Integer.parseInt(str1); // Convierto el número en una variable
		       b = Integer.parseInt(str2); // Convierto el número en una variable
		       c = Integer.parseInt(str3); // Convierto el número en una variable
		       d = Integer.parseInt(str4); // Convierto el número en una variable
		       e = Integer.parseInt(str5); // Convierto el número en una variable
		       if ((a<b&&a<c)&&(a<d&&a<e)){
		    	   System.out.printf("%d\t Es el menor",a );

		    	   }else if ((b<a&&b<c)&&(b<d&&b<e)){
		    	   System.out.printf("%d\t Es el menor", b);

		    	   } else if((c<a&&c<b)&& (c<d&&c<e)){
		    	   System.out.printf("%d\t Es el menor\n",c);

		    	   }else if ((e<a&&e<b)&&(e<c&&e<d)){
		    	   System.out.printf("%d\t Es el menor\n",e);

		    	   }else if ((d<a&&d<b)&& (d<c&&d<e)){
		    	   System.out.printf("%d\t Es el menor\n",d);
		    	   }

	}

}
