package Capitulo04Bloque01.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.Arrays;

public class PreguntaOpcionUnica extends Pregunta {

public int respuestaCorrecta;
	
	public String posiblesRespuestas[] = new String[5];
	
	public PreguntaOpcionUnica(String enunciado, int respuestaCorrecta, String[] string) {
		super(enunciado);
		this.respuestaCorrecta = respuestaCorrecta;
		this.posiblesRespuestas= string;

	}


	public int getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(int respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}

	public String[] getPosiblesRespuestas() {
		return posiblesRespuestas;
	}

	public void setPosiblesRespuestas(String[] posiblesRespuestas) {
		this.posiblesRespuestas = posiblesRespuestas;
	}

	@Override
	public String toString() {
		return "PreguntaOpcion [respuestaCorrecta=" + respuestaCorrecta + ", posiblesRespuestas="
				+ Arrays.toString(posiblesRespuestas) + ", enunciado=" + enunciado + ", getRespuestaCorrecta()="
				+ getRespuestaCorrecta() + ", getPosiblesRespuestas()=" + Arrays.toString(getPosiblesRespuestas())
				+ "]";
	}

	@Override
	public boolean esCorecta(String respuestaUsuario) {
		if (Integer.parseInt(respuestaUsuario) == respuestaCorrecta) {
			return true;
		}
		return false;
	}

	@Override
	public void muestraEnPantalla() {
		System.out.println(enunciado);
		for (int i = 0; i <= posiblesRespuestas.length-1; i++) {
			System.out.println(i+"-" + posiblesRespuestas[i]);
		}
		
	}

}
