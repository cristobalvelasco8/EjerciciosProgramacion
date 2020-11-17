package Capitulo05Bloque02;

import javax.swing.JOptionPane;

import Utils.Utils;

public class Capitulo05Bloque02Ejercicio044 {

	public static void main(String[] args) {
		int b[] = new int[5];
		int n[] = new int[5];
		int limiteSup=100;
		int limiteInf=0;
		String str = JOptionPane.showInputDialog("Posiciones a desplazar: ");
		int posiciones= Integer.parseInt(str);
		for (int i = 0;  i< b.length; i++) {
		b[i] = Utils.obtenerNumeroAzar(limiteSup,limiteInf);
		System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		if(posiciones==1) {
		n[0]=b[4];
		System.out.print(n[0] + " ");
		for (int i = 1;  i< n.length; i++) {
			n[i]=b[i-1];	
			System.out.print(n[i] + " ");
			}
		}
		
		if(posiciones==2) {
		n[1]=b[4];
		n[0]=b[3];
		System.out.print(n[0] + " ");
		System.out.print(n[1] + " ");
		for (int i = 2;  i< n.length; i++) {
			n[i]=b[i-2];	
			System.out.print(n[i] + " ");
			}
		}
		
		if(posiciones==3) {
			n[2]=b[4];
			n[1]=b[3];
			n[0]=b[2];
			System.out.print(n[0] + " ");
			System.out.print(n[1] + " ");
			System.out.print(n[2] + " ");
			for (int i = 3;  i< n.length; i++) {
				n[i]=b[i-3];	
				System.out.print(n[i] + " ");
				}
			}

		if(posiciones==4) {
			n[3]=b[4];
			n[2]=b[3];
			n[1]=b[2];
			n[0]=b[1];
			System.out.print(n[0] + " ");
			System.out.print(n[1] + " ");
			System.out.print(n[2] + " ");
			System.out.print(n[3] + " ");
			for (int i = 4;  i< n.length; i++) {
				n[i]=b[i-4];	
				System.out.print(n[i] + " ");
				}
			}
	}

}
