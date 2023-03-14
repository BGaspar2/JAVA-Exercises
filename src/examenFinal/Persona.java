package examenFinal;

public class Persona {
	String cedula, nombre, apellido, fechaNacimeinto;
	
	public Persona() {
		
	}
	public Persona(String cedula, String nombre, String apellido, String fechaNacimiento) {
		this.cedula=cedula;
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimeinto=fechaNacimiento;
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
	public String getFechaNacimeinto() {
		return fechaNacimeinto;
	}
	public void setFechaNacimeinto(String fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimeinto="
				+ fechaNacimeinto + "]";
	}
	

	
}
