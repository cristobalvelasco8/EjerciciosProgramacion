package EjerciciosdeMetodos;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
	//ejercicio1
	float miresultado =media(3, 4, 5, 6.7f);
	System.out.println(miresultado);
	//ejercicio2
	int miresultado1 = obtenerNumeroDeUsuarioEntreMinimoYMaximo(4,9);
	System.out.println(miresultado1); 
	String str = JOptionPane.showInputDialog("Obtener maximo1");
	int n1 = Integer.parseInt(str); 
	String str1 = JOptionPane.showInputDialog("Obtener maximo2");
	int n2 = Integer.parseInt(str1);
	//ejercicio3
	int miresultado2 =maximo (n1,n2);
	System.out.println(miresultado2);
    //ejercicio4
	int miresultado3 =numeroImparEntreLimites (2,7);
	System.out.println(miresultado3);
	//ejercicio5
	String miresultado4 = getStringFromEntero (2);
	System.out.println(miresultado4);
	//ejercicio6
	imprimeMinimoAMaximo(10,5,8);
	//ejercicio7
	fibonacci(7);
	//ejercicio8
	int arr[]= {2,3,4,5,6,7,8,9,10,11,12};
	imprimeArray(arr);
	//ejercicio9
	recorte(arr,2,7);
	//ejercicio10
	recursividad(1);
	
	
	}
	public static float media (int n1, int n2, int n3, float n4) {
		float resultado = (n1 + n2 + n3 + n4)/ 4;
		return resultado;
	}
	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo (int minimo, int maximo) {
		String str = JOptionPane.showInputDialog("Introducir valor");
		int valor = Integer.parseInt(str);
		for (int i=0; i<10000000; i++) {
		if (valor>=minimo && valor<= maximo) {
			return valor;
		}
		else {
			str = JOptionPane.showInputDialog("Introducir valor");
			valor = Integer.parseInt(str);
		}
		}
		return valor;
			
	}
	public static int maximo (int valor1, int valor2) {
		if(valor1>valor2) {
			return valor1;
		}
		else {
			return valor2;
		}
	}
	public static int numeroImparEntreLimites(int limInf, int limSup) {
		float numero = Math.round(Math.random()*100);
		for (int i=0; i<10000000; i++) {
			if (numero>=limInf && numero<=limSup && numero%2!=0) {
				return (int) numero;
			}
			else {
				numero = Math.round(Math.random()*100);
			}	
	}
		return (int) numero;
	}
	public static String getStringFromEntero(int numero) {
		String n = "cero";
	 if(numero==1) {
		 n = "uno";
	 }
	 if(numero==2) {
		 n = "dos";
	 }
	 if(numero==3) {
		 n = "tres";
	 }
	 if(numero==4) {
		 n = "cuatro";
	 }
	 if(numero==5) {
		 n = "cinco";
	 }
	 if(numero==6) {
		 n = "seis";
	 }
	 if(numero==27) {
		 n = "siete";
	 }
	 if(numero==8) {
		 n = "ocho";
	 }
	 if(numero==9) {
		 n = "nueve";
	 }
	 if(numero==10) {
		 n = "diez";
	 }
	 return (String) n;
	 
	}
	public static void imprimeMinimoAMaximo(int n1, int n2, int n3) {
	int array []= new int [3];
	if (n1<n2 && n1<n3 && n2<n3) {
		array[0] = n1;
		array[1] = n2;
		array[2] = n3;
	}
	if (n1<n2 && n1<n3 && n3<n2) {
		array[0] = n1;
		array[1] = n3;
		array[2] = n2;
	}
	if (n2<n1 && n2<n3 && n1<n3) {
		array[0] = n2;
		array[1] = n1;
		array[2] = n3;
	}
	if (n2<n1 && n2<n3 && n3<n1) {
		array[0] = n2;
		array[1] = n3;
		array[2] = n1;
	}
	if (n3<n1 && n3<n2 && n1<n2) {
		array[0] = n3;
		array[1] = n1;
		array[2] = n2;
	}
	if (n3<n1 && n3<n2 && n2<n1) {
		array[0] = n3;
		array[1] = n2;
		array[2] = n1;
	}	
	for (int i=0; i<3; i++) {
		System.out.print(array[i]+ " ");	
		}
	return;
	
	
	}
	public static void fibonacci (int serie) {
		int num1=1;
		int num2=1;
		int suma=1;
		System.out.println();
		System.out.println(num1);
		for(int i = 1; i<serie; i++) {
			System.out.println(suma);
			suma= num1+num2;
			num1=num2;
			num2=suma;
		}
	}
	public static void imprimeArray(int[] array) {
		int numeros[]= new int[array.length]; 
		 for(int i=0; i<numeros.length; i++) {
			 numeros[i] = array[i];
			System.out.print(numeros[i]+ " "); 
		 }
		System.out.println();
	}
	public static void recorte (int[] array, int primerindice, int segundoindice) {
		int numeros[]= new int[array.length]; 
		 for(int i=primerindice; i<=segundoindice; i++) {
			 numeros[i] = array[i];
			System.out.print(numeros[i]+ " ");
	}
		 System.out.println();
}
	
	public static void recursividad(int numero) {
		System.out.print(numero + " ");
		if (numero<100) {
			recursividad(numero+1);
		}
	}
		}
	


	
	 
		
	
	


