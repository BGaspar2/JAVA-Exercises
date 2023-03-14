package Herencia;


public class Estudiante extends Persona {

	//Atributos
	private int codigoEstudiante;
	private double notaFinal;
	
	//metodo constructor
	
	public Estudiante(String nombres, String apellidos, int edad, int codigoEstudiante, double notaFinal) {
		super(nombres, apellidos, edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
//Metodo ToString
	@Override
	public String toString() {
		return "Estudiante: "+ getNombres() + " " + getApellidos() +", Edad: " + getEdad() + ", Codigo Estudiante=" + codigoEstudiante + ", nota final=" + notaFinal;
	}
	
	
	
	
	
	
	
}
