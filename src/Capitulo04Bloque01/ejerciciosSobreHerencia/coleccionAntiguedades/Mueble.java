package Capitulo04Bloque01.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Mueble extends Antiguedad {

	String material;
	String color;

	public Mueble() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mueble(int anio, String origen, float precioVenta, String material, String color) {
		super(anio, origen, precioVenta);
			this.material = material;
			this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mueble [material=" + material + ", color=" + color + ", anio=" + anioFabricacion + ", origen=" + origen
				+ ", precioVenta=" + precioVenta + "]";
	}

}
