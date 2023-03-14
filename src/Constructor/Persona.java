package Constructor;

public class Persona {
//Atributos
	String apellidos;
	String nombres;
	String numCedula;
	int edad;


	//metodo constructor
	public Persona(String apellidos, String nombres, String numCedula, int edad) {
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.numCedula = numCedula;
		this.edad = edad;
	}

	public Persona(String apellidos, String nombres, int edad) {
		super();
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
	}

	public void mostrarDatos() {
		System.out.println("El apellido es: "+ apellidos);
		System.out.println("El nombre es: "+ nombres);
		System.out.println("El numero de cedula es: "+ numCedula);
		System.out.println("La edad es "+ edad);
	}
}


