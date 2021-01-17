package Capitulo04Bloque01.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Antiguedad {
	int anioFabricacion;
	String origen;
	float precioVenta;
	
	
	public Antiguedad() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Antiguedad(int anioFabricacion, String origen, float precioVenta) {
		super();
		this.anioFabricacion = anioFabricacion;
		this.origen = origen;
		this.precioVenta = precioVenta;
	}


	public int getAnioFabricacion() {
		return anioFabricacion;
	}


	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}


	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public float getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}


	@Override
	public String toString() {
		return "Antiguedades [añoFabricacion=" + anioFabricacion + ", origen=" + origen + ", precioVenta=" + precioVenta
				+ "]";
	}
	
	
	

}
