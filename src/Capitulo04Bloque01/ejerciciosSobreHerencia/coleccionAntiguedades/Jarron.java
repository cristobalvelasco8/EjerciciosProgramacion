package Capitulo04Bloque01.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Jarron extends Antiguedad {

	String tipo;
	String fabricante;

	public String getNombre() {
		return tipo;
	}

	public void setNombre(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Jarron() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jarron(int anio, String origen, float precioVenta, String tipo, String fabricante) {
		super(anio, origen, precioVenta);
		this.tipo = tipo;
		this.fabricante = fabricante;

	}

	@Override
	public String toString() {
		return "Jarron [tipo=" + tipo + ", fabricante=" + fabricante + ", anio=" + anioFabricacion + ", origen=" + origen
				+ ", precioVenta=" + precioVenta + "]";
	}

}
