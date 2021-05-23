package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		Espanol espanol = new Espanol();
		
		assertEquals("¿qué hora es?", espanol.preguntas().preguntaHora() );
		assertEquals("¿qué tiempo hace?", espanol.preguntas().preguntaTiempo() );
		
		assertEquals("buenos días", espanol.saludos().buenosDias());
		assertEquals("buenas tardes", espanol.saludos().buenasTardes());
	}
	
	@Test
	public void test_en() {
		English english = new English();

		assertEquals("what time is it?", english.preguntas().preguntaHora() );
		assertEquals("how is the weather?", english.preguntas().preguntaTiempo() );
		
		assertEquals("good morning", english.saludos().buenosDias());
		assertEquals("good afternoon", english.saludos().buenasTardes());
	}

}
