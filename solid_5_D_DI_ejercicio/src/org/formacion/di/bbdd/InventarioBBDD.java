package org.formacion.di.bbdd;


import org.formacion.di.negocio.InventarioInterface;

public class InventarioBBDD implements InventarioInterface {


	// Metodo de consulta a la base de datos
	@Override
	public int numeroProductos(String tienda, String producto) {
		return BBDD.stocs.get(tienda).get(producto);
	}
}
