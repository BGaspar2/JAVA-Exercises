package com.cmc.test;

import com.cmc.colecciones.DirectorioLista;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestDirectorioLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectorioLista d = new DirectorioLista();
		Contacto c = new Contacto("123456789", "Juan", "Perez");
		Telefono telf = new Telefono("Claro", "123486488");
		c.agregarTelefono(telf);
		d.agregarContacto(c);
		
		Contacto c2 = new Contacto("123456789", "Juan", "Perez");
		Telefono telf2 = new Telefono("Claro", "123486488");
		c2.agregarTelefono(telf2);
		d.agregarContacto(c2);
		d.imprimir();
		
	}

}
