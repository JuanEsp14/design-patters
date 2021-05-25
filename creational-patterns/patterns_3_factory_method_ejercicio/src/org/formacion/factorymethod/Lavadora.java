package org.formacion.factorymethod;

public abstract class Lavadora {

	protected boolean tieneTambor;
	protected boolean tieneMandos;
	protected String  tipoCarga;

	public Lavadora(){
		this.tipoCarga = tipoCarga();
		this.ponerMandos();
		this.ponerTambor();
	}
	
	private void ponerTambor() {
		tieneTambor = true;
	}

	private void ponerMandos() {
		tieneMandos = true;
	}

	public abstract String tipoCarga();
}
