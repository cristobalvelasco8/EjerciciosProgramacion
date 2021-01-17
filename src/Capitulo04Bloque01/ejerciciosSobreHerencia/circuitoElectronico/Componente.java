package Capitulo04Bloque01.ejerciciosSobreHerencia.circuitoElectronico;

public class Componente {

	String nombre;
	String componenteAnterior;
	String componenteSiguiente;

	public Componente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Componente(String nombre, String componenteAnterior, String componenteSiguiente) {
		super();
		this.nombre = nombre;
		this.componenteAnterior = componenteAnterior;
		this.componenteSiguiente = componenteSiguiente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getComponenteAnterior() {
		return componenteAnterior;
	}

	public void setComponenteAnterior(String componenteAnterior) {
		this.componenteAnterior = componenteAnterior;
	}

	public String getComponenteSiguiente() {
		return componenteSiguiente;
	}

	public void setComponenteSiguiente(String componenteSiguiente) {
		this.componenteSiguiente = componenteSiguiente;
	}

	@Override
	public String toString() {
		return "Componente [nombre=" + nombre + ", componenteAnterior=" + componenteAnterior + ", componenteSiguiente="
				+ componenteSiguiente + "]";
	}

}
