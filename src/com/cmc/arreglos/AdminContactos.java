package com.cmc.arreglos;

import com.cmc.entidades.Contaco;

public class AdminContactos {
	private Contaco[] contactos;
	private int elementosAgregados;
	public AdminContactos(){
		contactos = new Contaco[10];
	}
	public void agregar(Contaco contacto){
		if(elementosAgregados < contactos.length){
		contactos[elementosAgregados]=contacto;
		elementosAgregados+=1;
		}
	}
	public Contaco recuperar(String codigo){
		if (codigo != null){
			Contaco c = null;
			for (int i = 0; i < contactos.length; i++) {
				c = contactos[i];
				if(c.getCodigo().equals(codigo)){
					return c;
				}
			}
		}
		return null;	
	
	}
}
