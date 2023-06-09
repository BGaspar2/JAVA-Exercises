package com.cmc.entidades;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Telefono> telefonos;
	public Contacto(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void agregarTelefono(Telefono telf){
		telefonos = new ArrayList<Telefono>();
		telefonos.add(telf);
	}
	
	@Override
	public String toString() {
		return "Contacto [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefonos="
				+ telefonos + "]";
	}
	
}
