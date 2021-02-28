package capitulo06_Recursos.excepciones.ejercicio2;

public class Menosde3palabras extends Exception {

	private int minimoNumeroPalabras;
		
		public Menosde3palabras(int minimoNumeroPalabras) {
			this.minimoNumeroPalabras = minimoNumeroPalabras;
			// TODO Auto-generated constructor stub
		}
	
		public Menosde3palabras(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
	
		public Menosde3palabras(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}
	
		public Menosde3palabras(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}
}
