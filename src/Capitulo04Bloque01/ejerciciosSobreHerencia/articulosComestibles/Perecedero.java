package Capitulo04Bloque01.ejerciciosSobreHerencia.articulosComestibles;

public class Perecedero extends Producto {
	
	String fechaCaducidad;
	
	public Perecedero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perecedero(int codigo, String nombre, float precio, String fechaCaducidad) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Perecedero [fechaCaducidad=" + fechaCaducidad + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", precio=" + precio + "]";
	}
	


}
