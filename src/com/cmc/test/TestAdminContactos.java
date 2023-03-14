package com.cmc.test;

import com.cmc.arreglos.AdminContactos;
import com.cmc.entidades.Contaco;

public class TestAdminContactos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminContactos admin = new AdminContactos();
		Contaco contacto = new Contaco("456","Rosario");
		admin.agregar(contacto);
		Contaco contacto2 = new Contaco("123","xxx");
		admin.agregar(contacto2);
		Contaco contacto3 = new Contaco("555","aaa");
		admin.agregar(contacto3);
		
		Contaco c = admin.recuperar("456");
		System.out.println(c);
	}

}
