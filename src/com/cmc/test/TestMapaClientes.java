package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;

public class TestMapaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Cliente> mapa = new HashMap<String, Cliente>();
		
		
		mapa.put("1234567891", new Cliente("1234567891", "Ramiro"));
		mapa.put("1987654321", new Cliente("1987654321", "Teresa"));
		
		Cliente c = mapa.get("1987654321");
		if(c != null)
		System.out.println(c);
		else
		System.out.println("No existe");

	}

}
