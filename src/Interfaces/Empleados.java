package Interfaces;

public class Empleados {
	private String cedula;
	private String apellidos;
	private String nombres;
	private String direccion;
	
	public Empleados(String cedula, String apellidos, String nombres, String direccion) {
		this.cedula = cedula;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}


	public String getApellidos() {
		return apellidos;
	}

	

	public String getNombres() {
		return nombres;
	}

	

	public String getDireccion() {
		return direccion;
	}

	@Override
	public String toString() {
		return "Cedula = " + cedula + ", Apellidos = " + apellidos + ", Nombres = " + nombres + ", Direccion = "
				+ direccion;
	}

	
	
	
	
	
	
	
	
	
}
