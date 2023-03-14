package com.cmc.test;

import com.cmc.estaticos.Contador;

public class TestContador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador  contador = new Contador("Objeto1");
		contador.incrementar();
		contador.imprimir();
		
		Contador c1 = new Contador("objeto2");
		c1.incrementar();
		c1.imprimir();
		
		
	}

}
