package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioLista extends Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();;

	public void agregarContacto(Contacto c) {
		
		Contacto encontrado = buscarContacto(c.getCedula());
		if(encontrado == c){
			System.out.println("El contacto ya existe");
		}else
		{
			contactos.add(c);
		}
	}
	public Contacto buscarContacto(String cedula){
		for(Contacto c: contactos){
			if(c.getCedula().equals(cedula)){
				return c;
			}
		}
		return null;
		
	}
	public void imprimir(){
		for(Contacto c: contactos){
			System.out.println(c);
		}
	}

	

}
