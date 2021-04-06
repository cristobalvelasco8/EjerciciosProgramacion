package examen16022021;

public class CromoBaloncesto {
	
	private int id;
	private String Nombre;
	private int puntostemporadapasada;
	private int rebotestemporadapasada;
	
	
	public CromoBaloncesto(int id, String nombre, int puntostemporadapasada, int rebotestemporadapasada) {
		super();
		this.id = id;
		Nombre = nombre;
		this.puntostemporadapasada = puntostemporadapasada;
		this.rebotestemporadapasada = rebotestemporadapasada;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public float getPuntostemporadapasada() {
		return puntostemporadapasada;
	}


	public void setPuntostemporadapasada(int puntostemporadapasada) {
		this.puntostemporadapasada = puntostemporadapasada;
	}


	public float getRebotestemporadapasada() {
		return rebotestemporadapasada;
	}


	public void setRebotestemporadapasada(int rebotestemporadapasada) {
		this.rebotestemporadapasada = rebotestemporadapasada;
	}


	@Override
	public String toString() {
		return "CromoBaloncesto [Id=" + id + ", Nombre=" + Nombre + ", puntostemporadapasada=" + puntostemporadapasada + ", rebotestemporadapasada=" + rebotestemporadapasada + "]";
	}

	}



	
	
	
	
	

