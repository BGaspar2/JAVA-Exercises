package com.cmc.test;

import com.cmc.estaticos.Util;

public class TestValidar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util util = new Util();
		boolean res = util.validarRango(5);
		System.out.println(res);
		boolean pos = Util.validarPositivo(-1);
		System.out.println(pos);
		
		double r = Math.random();
		 System.out.println(r);
		 
		 int valor = Integer.parseInt("8");
		 System.out.println(valor);
	}

}
