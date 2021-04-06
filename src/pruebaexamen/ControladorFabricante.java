package pruebaexamen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorFabricante {

	private static ControladorFabricante instance = null;
	public Connection conn = null;
	
	/**
	 * 
	 * @return
	 */
	public static ControladorFabricante getInstance () {
		if (instance == null) {
			instance = new ControladorFabricante();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorFabricante() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/world?serverTimezone=UTC","java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	
	/**
	 * 
	 * @return
	 */
	public Ciudad findPrimero () {
		Ciudad f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city order by id limit 1");
			if (rs.next()) {
				f = new Ciudad();
				f.setID(rs.getInt("ID"));
				f.setName(rs.getString("Name"));
				f.setPopulation(rs.getString("Population"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	

	/**
	 * 
	 * @return
	 */
	public Ciudad findUltimo () {
		Ciudad f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city order by id desc limit 1");
			if (rs.next()) {
				f = new Ciudad();
				f.setID(rs.getInt("ID"));
				f.setName(rs.getString("Name"));
				f.setPopulation(rs.getString("Population"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public Ciudad findSiguiente (int idActual) {
		Ciudad f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				f = new Ciudad();
				f.setID(rs.getInt("ID"));
				f.setName(rs.getString("Name"));
				f.setPopulation(rs.getString("Population"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	


	/**
	 * 
	 * @return
	 */
	public Ciudad findAnterior (int idActual) {
		Ciudad f = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from world.city where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				f = new Ciudad();
				f.setID(rs.getInt("ID"));
				f.setName(rs.getString("Name"));
				f.setPopulation(rs.getString("Population"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public int modificar (Ciudad c) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update c set Name='" + c.getName() + "', " +
					" Population='" + c.getPopulation() + "' where id=" + c.getID() + ";");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Ciudad c) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into city values(" + idNuevoRegistro + ", " +
			"'" + c.getName() + "', '" + c.getPopulation() + "');");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId () throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from world.city";
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int borrar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from city where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

}
