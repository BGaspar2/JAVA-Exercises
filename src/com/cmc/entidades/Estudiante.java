package com.cmc.entidades;

public class Estudiante {
	
	private String Cedula;
	private String nombre;
	private int edad;
	public Estudiante(String cedula, String nombre, int edad) {
		super();
		Cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Estudiante [Cedula=" + Cedula + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
