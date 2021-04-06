package examenBaseDatos;

public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String localidad;
	private String dniNie;
	private String email;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getDniNie() {
		return dniNie;
	}


	public void setDniNie(String DniNie) {
		this.dniNie = DniNie;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", localidad=" + localidad
				+ ", dniNie=" + dniNie + ", email=" + email + "]";
	}


	public Cliente(int id, String nombre, String apellidos, String localidad, String dniNie, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.dniNie = dniNie;
		this.email = email;
	}
	
	
}

	

