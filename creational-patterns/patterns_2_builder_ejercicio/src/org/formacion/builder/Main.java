package org.formacion.builder;

public class Main {

	public static void main (String[] args) {
		//Este código debe compilar
		/*
		Persona madre = new Persona.Builder("Maria")
                .setMunicipio("Selva")
                .setMayor(37)
                .setLugarTrabajo("Google")
                .build();

		Persona hijo = new Persona.Builder("Pedro")
                .setMenor(4)
                .setColegio("Colegio de Selva")
                .build();

		System.out.println(madre);
		System.out.println(hijo);

		*/

		//Este código NO debe compilar
		/*
		Persona mal = new Persona.Builder("Luisa")
				    .setMayor(20)
				    .setColegio("Colegio de Villa Arriba")
				    .build();

		System.out.println(mal);
		
		 */
	}
}
