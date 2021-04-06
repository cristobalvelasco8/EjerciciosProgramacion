package examenBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorCliente {

	private static ControladorCliente instance = null;
	public Connection conn = null;
	
	/**
	 * 
	 * @return
	 */
	public static ControladorCliente getInstance () {
		if (instance == null) {
			instance = new ControladorCliente();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorCliente() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/cliente?serverTimezone=UTC", "java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	
	/**
	 * 
	 * @return
	 */
	public Cliente findPrimero () {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from cliente.cliente order by ID limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("ID"));
				c.setNombre(rs.getString("Nombre"));
				c.setApellidos(rs.getString("Apellidos"));
				c.setLocalidad(rs.getString("Localidad"));
				c.setDniNie(rs.getString("DniNie"));
				c.setEmail(rs.getString("Email"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Cliente findUltimo () {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from cliente order by ID desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("ID"));
				c.setNombre(rs.getString("Nombre"));
				c.setApellidos(rs.getString("Apellidos"));
				c.setLocalidad(rs.getString("Localidad"));
				c.setDniNie(rs.getString("DniNie"));
				c.setEmail(rs.getString("Email"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	/**
	 * 
	 * @return
	 */
	public Cliente findSiguiente (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from cliente where ID > " + idActual + " order by ID limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("ID"));
				c.setNombre(rs.getString("Nombre"));
				c.setApellidos(rs.getString("Apellidos"));
				c.setLocalidad(rs.getString("Localidad"));
				c.setDniNie(rs.getString("DniNie"));
				c.setEmail(rs.getString("Email"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	


	/**
	 * 
	 * @return
	 */
	public Cliente findAnterior (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from cliente where ID < " + idActual + " order by ID desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("ID"));
				c.setNombre(rs.getString("Nombre"));
				c.setApellidos(rs.getString("Apellidos"));
				c.setLocalidad(rs.getString("Localidad"));
				c.setDniNie(rs.getString("DniNie"));
				c.setEmail(rs.getString("Email"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	
	
	public int modificar (Cliente c) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update cliente set Name='" + c.getNombre() + "', " +
					" Nombre='" + c.getApellidos() + "', Apellidos='" + c.getLocalidad() + "', Localidad='" + c.getDniNie() + "'" + c.getEmail() + "' where ID=" + c.getId() );
		   	
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
	public int nuevo (Cliente c) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into cliente values(" + idNuevoRegistro + ", " +
			"'" + c.getNombre() + "', '" + c.getApellidos() + "', '" + c.getLocalidad() +
			"', '" + c.getDniNie() + "'" + c.getEmail() + "' );");
		   	
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

		String sql = "select max(ID) from cliente.cliente";
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

			registrosAfectados = s.executeUpdate ("delete from cliente where ID=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

}







