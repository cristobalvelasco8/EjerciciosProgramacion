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
						 compruebaResultado();
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
	 private static int getGanadorDelTablero (int tablero[][]) {
			// Busco si existe un ganador mirando las filas
			for (int i = 0; i < tablero.length; i++) {
				if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) { 
					return tablero[i][0]; // Si todos los valores de una fila son iguales, devuelvo cualquiera de los elementos de esa fila
				}
			}
			// Busco si existe un ganador en las columnas
			for (int i = 0; i < tablero[0].length; i++) {
				if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) { 
					return tablero[0][i]; // Si todos los valores de una columna son iguales, devuelvo cualquiera de los elementos de esa columna
				}
			}
			// Busco un ganador en la diagonal principal
			if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) { 
				return tablero[0][0]; // Devuelvo cualquier elemento de la diagonal principal
			}
			// Busco un ganador en la diagonal secundaria
			if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
				return tablero[0][2]; // Devuelvo cualquier elemento de la diagonal secundaria
			}
			
			// Si llegó hasta aquí no hay ganador, pero aún quedan dos posibilidades: puede que queden casillas vacías o puede que no
			// Voy a suponer que no hay casillas vacías y voy a recorrer el tablero buscando alguna casilla vacía
			boolean hayCasillasVacias = false;
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[0].length; j++) {
					if (tablero[i][j] == 0) {
						hayCasillasVacias = true;
					}
				}
			}

			// Devuelvo valores diferentes dependiendo de si existen casillas vacías o no
			if (hayCasillasVacias == true) {
				return 0; // Indica que el juego continúa.
			}
			else {
				return -1; // Indica que no quedan casillas vacías, hay empate
			}
		}
	 public void compruebaResultado() {
			int resultado = getGanadorDelTablero(matrizJugadas);

			if (resultado == -1) {
				JOptionPane.showMessageDialog(instance, "No quedan mas cuadros libres");
			}
			if (resultado == 1) {
				JOptionPane.showMessageDialog(instance, "Ha ganado el JUGADOR 1");
			}
			if (resultado == 2) {
				JOptionPane.showMessageDialog(instance, "Ha ganado el JUGADOR 2");
			}
		}

}
