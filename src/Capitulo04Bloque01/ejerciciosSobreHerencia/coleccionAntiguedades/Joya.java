package Capitulo04Bloque01.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Joya extends Antiguedad {
	String materialFabricacion;

	public Joya() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joya(int anio, String origen, float precioVenta, String materialFabricacion) {
		super(anio, origen, precioVenta);
		this.materialFabricacion = materialFabricacion;
	}

	public String getMaterialFabricacion() {
		return materialFabricacion;
	}

	public void setMaterialFabricacion(String materialFabricacion) {
		this.materialFabricacion = materialFabricacion;
	}

	@Override
	public String toString() {
		return "Joyas [materialFabricacion=" + materialFabricacion + ", anioFabricacion=" + anioFabricacion + ", origen="
				+ origen + ", precioVenta=" + precioVenta + "]";
	}
	
	
	

}
