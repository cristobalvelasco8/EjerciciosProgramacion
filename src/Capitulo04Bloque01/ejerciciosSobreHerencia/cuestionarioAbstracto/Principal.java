package Capitulo04Bloque01.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

static List<Pregunta>preguntas = new ArrayList <Pregunta>();
	
	
	public static void main(String[] args) {
		

		PreguntaVF capitalEspaña = new PreguntaVF("Madrid es la capital de España", "V");
		
		PreguntaVF velocidadmaxima = new PreguntaVF("La velocidad maxima es 110km/h","F");
		
		PreguntaVF micallees = new PreguntaVF("Mi  calle es antequera ","V");
		
		PreguntaOpcionUnica nombrePerro = new PreguntaOpcionUnica("¿Como se llama mi perro?", 2, new String[] {"Leon","Lobo","Toby","Yaki","Bola"});
		
		PreguntaOpcionUnica edad = new PreguntaOpcionUnica("Cuantos Años Tengo", 3, new String[] {"20","21","30","19","25"});
		
		preguntas.add(capitalEspaña);
		preguntas.add(velocidadmaxima);
		preguntas.add(micallees);
		preguntas.add(nombrePerro);
		preguntas.add(edad);
		
		int aciertos =0;
		for (Pregunta p : preguntas) {
			p.muestraEnPantalla();
			Scanner sc = new Scanner(System.in);
			String respuestaUsuario = sc.nextLine();
			boolean correcta = p.esCorecta(respuestaUsuario);
			if(correcta) {
				aciertos++;
			}
			
		}
		float porcentaje = aciertos / (float)preguntas.size()  * 100;
		
		System.out.println(porcentaje);
		
	}

}
