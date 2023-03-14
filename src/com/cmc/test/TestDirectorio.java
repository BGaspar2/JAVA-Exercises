package com.cmc.test;

import com.cmc.colecciones.Directorio;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestDirectorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto c = new Contacto("123456789", "Juan", "Perez");
		Telefono telf = new Telefono("Claro", "123486488");
		c.agregarTelefono(telf);
		//System.out.println(c);
		Directorio d = new Directorio();
		d.imprimir();
		d.agregarContacto(c);
		
		Contacto recuperado = d.buscarContacto("123456789");
		
			System.out.println(recuperado);
	
		Contacto eliminado = d.eliminarContacto("123456789");

			System.out.println(eliminado);
		
		
	}

}
