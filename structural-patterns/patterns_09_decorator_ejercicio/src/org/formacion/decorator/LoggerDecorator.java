package org.formacion.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

	private Logger log = new Logger();
	private final BaseDatos impl;

	public LoggerDecorator(Logger log, BaseDatos impl) {
		this.log = log;
		this.impl = impl;
	}

	@Override
	public void inserta(String registro) {
		log.add("inserta " + registro);
		impl.inserta(registro);
	}

	@Override
	public List<String> registros() {
		log.add("lectura");
		return impl.registros();
	}

	

}
