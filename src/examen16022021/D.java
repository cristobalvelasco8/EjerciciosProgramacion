package examen16022021;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class D {
	private static Properties propiedades = null;

	public D () {
		super();
	}
	
	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {

				// Otra forma de leer el fichero de propiedades
				File file = new File("./src/examen16022021/properties.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		String usuario = D.getProperty("USUARIO");
		String password = D.getProperty("PASSWORD");
		int id = D.getIntProperty("ID_USUARIO");
		float Mediaderemates = D.getFloatProperty("Mediaderemates");
		
		System.out.println("Usuario leído del fichero de propiedades: " + usuario);
		System.out.println("Password leído del fichero de propiedades: " + password);
		System.out.println("Id de usuario leído del fichero de propiedades: " + id);
		System.out.println("Mediaderemates leído del fichero de propiedades: " + Mediaderemates);
	}


}