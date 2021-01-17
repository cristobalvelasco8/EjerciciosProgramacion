package Capitulo04Bloque01.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Libro extends Antiguedad {
	String autor;
	String titulo;
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(int anio, String origen, float precioVenta, String autor, String titulo) {
		super(anio, origen, precioVenta);
		this.autor = autor;
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Libros [autor=" + autor + ", titulo=" + titulo + ", anioFabricacion=" + anioFabricacion + ", origen="
				+ origen + ", precioVenta=" + precioVenta + "]";
	}
	
	
	
	

}
