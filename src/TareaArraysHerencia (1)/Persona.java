package poo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	protected String cedula;
	protected String nombre;
	protected String fechaNacimiento;
	
	//constructor
	
	public Persona(String cedula, String nombre, String fechaNacimiento) {
		this.cedula = cedula;
		this.nombre=nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//metodo
	
	public String nombreEdad() {
		return this.cedula+ ", " + this.nombre + ", " + this.fechaNacimiento + ", "+ calcularEdad(this.fechaNacimiento);
	}
	
	public String identificacion() {
		return  this.nombreEdad();
	}
	public String calcularEdad(String edad) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse(edad, fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		return "La edad de es: "+ periodo.getYears() +" años";
		
	}
}
