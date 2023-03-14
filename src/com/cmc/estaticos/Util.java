package com.cmc.estaticos;

public class Util {

	public boolean validarRango(int valor){
		if(valor > 0 && valor < 10){
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean validarPositivo(int valor){
		if(valor > 0){
			return true;
		}else {
			return false;
		}
		
	}

}
