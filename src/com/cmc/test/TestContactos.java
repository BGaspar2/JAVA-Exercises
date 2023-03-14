package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestContactos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto c = new Contacto("123456789", "Juan", "Perez");
		Telefono telf = new Telefono("Claro", "123486488");
		c.agregarTelefono(telf);
		
		System.out.println(c);
	}

}
