package pruebaexamen;

public class Ciudad {

	private int ID;
	private String Name;
	private String Population;
	
	public Ciudad() {
		// TODO Auto-generated constructor stub
	}

	public Ciudad(int ID, String Name, String Population) {
		super();
		this.ID = ID;
		this.Name = Name;
		this.Population = Population;
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + ID + ", Name=" + Name + ", Population=" + Population + "]";
	}

	/**
	 * @return the id
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param id the id to set
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	/**
	 * @return the cif
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setName(String Name) {
		this.Name = Name;
	}

	/**
	 * @return the nombre
	 */
	public String getPopulation() {
		return Population;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setPopulation(String Population) {
		this.Population = Population;
	}

	
}
