package windowsBuilder;

public class Fabricante {

	private int id;
	private String cif;
	private String nombre;
	
	public Fabricante() {
		// TODO Auto-generated constructor stub
	}

	public Fabricante(int id, String cif, String nombre) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", cif=" + cif + ", nombre=" + nombre + "]";
	}


}
