package Enacapsulamiento;

public class Persona {
//atributos
	
	private String nombre;
	private String apellido;
	private int edad;
	
	
	// METODO 
	public void SetApellido(String apellido){
		
		this.apellido=apellido;
	}
	
	public void SetNombre(String nombre) {
		
		this.nombre= nombre;
	}
	
	
	
	//metodo getters
	
	public String GetApellido() {
		return apellido;
	}
	public String GetNombre() {
		return nombre;
	}
	
	//generar edad
public void SetEdad(int edad) {
		
		this.edad= edad;
	}
	
	
	
	//metodo getters
	
	public int GetEdad() {
		return edad;
	
	
	}
	
	
}
