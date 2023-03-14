package com.cmc.util;

public class Dado {
	
	public static int lanzar(){
		double d = Math.random();
		int valor = (int)(d*6);
		return valor+1;
	}
}
