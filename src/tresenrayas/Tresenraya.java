package tresenrayas;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Tresenraya extends Canvas {
	
	 static JFrame ventana = new JFrame("3 en raya"); // Nombre de la Ventana
	 
	 // Indicamos alto y ancho del objeto tipo Canvas
	 private static final int JFrame_WIDTH=700;
	 private static final int JFrame_HEIGTH=700;
	 // Variable para establecer la instancia al patrón singleton 
	 private static Tresenraya instance = null;
	 
	 public static int JUGADOR_1 = 1;
	 public static int JUGADOR_2 = 2;
	 private int turnoActual = JUGADOR_1;
	 private int matrizJugadas[][]= new int[][] {{0,0,0},
                                                 {0,0,0},
                                                  {0,0,0}};

	 
	 //Lista con lo objetos de tipo cuadro que se va a representar en el canvas cada uno con sus coordenadas
	 List<Cuadro> cuadros = new ArrayList<Cuadro>();
	 
	 
	 /**
	  * Constructor inicializa y monta la ventana
	  */
	 
	 public Tresenraya() {
		 //Obtengo referencia al panel principal de la ventana
		 JPanel panel = (JPanel) ventana.getContentPane();
		 //Establezco una plantilla en el panel para poder incorporar el canvas
				panel.setLayout(new BorderLayout());
		 //Agrego el canvas al panel
		 panel.add(this, BorderLayout.CENTER);
		 InicializaCuadrosDelTablero();
		 
		 this.addMouseListener(new MouseAdapter() {
			 
		 
		 @Override 
		 public void mouseClicked (MouseEvent e) {
			 super.mouseClicked(e);
			 if(e.getButton() == MouseEvent.BUTTON1) {
				 for (Cuadro cuadro : cuadros ) {
					 if (cuadro.SehahechoclicSobreCuadro(e.getX(), e.getY())) {
						 cuadro.clic(turnoActual);
						 if(turnoActual==JUGADOR_1) {
							 turnoActual = JUGADOR_2;
						 }
						 else {
							 turnoActual = JUGADOR_1;
						 }
					 }
				 }
			 }
		 }});
				 
		 //Dimensiones de la ventana
		 ventana.setBounds(0,0, JFrame_WIDTH, JFrame_HEIGTH);
		 //Desactivo el comportamiento por defecto al pulsar el botón de cierre de la ventana
		 ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		 // Agrego un escuchador a la ventana, para detectar el evento de cierre de la misma
		 ventana.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
				}

				});
		 //Muestro la ventana en la pantalla
		 ventana.setVisible(true);
		 this.requestFocus();
		 
		 
	 }
	 
	// Creamos la instancia del Tres en raya (Singleton)
		public static Tresenraya getInstance() {
			if (instance == null) {
				instance = new Tresenraya();
			}
			return instance;
		}
		
		private void InicializaCuadrosDelTablero() {
			for (int i = 0; i<3; i++) {
				for (int j = 0; j<3; j++) {
					this.cuadros.add(new Cuadro(i,j));
					
				}
			}
		}
private static void cerrarAplicacion() {
	String[] opciones = { "Aceptar", "Cancelar" };
	int eleccion = JOptionPane.showOptionDialog(ventana, "¿Desea cerrar la aplicación?", "Salir de la aplicación",
	JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
	if (eleccion == JOptionPane.YES_OPTION) {
	System.exit(0);
	}
}
@Override
public void paint(Graphics g) {
	super.paint(g);
	g.setColor(Color.WHITE);
	g.fillRect(0, 0,this.getWidth(), this.getHeight());
	
	for (Cuadro cuadro : cuadros) {
		cuadro.paint(g);
	}
}

public int[][] getMatrizJugadas() {
	return matrizJugadas;
	
}
	 public static void main(String[] args) {
		 Tresenraya.getInstance();
		 
	 }


}
