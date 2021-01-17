package Capitulo04Bloque01.ejerciciosSobreHerencia.ventanaConCanvas;



import javax.swing.JFrame;



public class Rectangulo extends JFrame {
	
	public Rectangulo() {
		setSize(300,200);
		add(new Dibujo());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	
	

}
