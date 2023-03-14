package com.cmc.test;

import com.cmc.entidades.Cliente;
import com.cmc.mapas.AdminClientes;

public class TestMapaAdminClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente("0850594573", "Bryan");
		AdminClientes admin = new AdminClientes();
		admin.agregarCliente(cliente);
		Cliente recuperado = admin.recuperar("0850594573");
		if (recuperado != null)
			System.out.println(recuperado);
		else
			System.out.println("no existe");

	}

}
