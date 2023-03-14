package poo;
public class Alumno extends Persona{

	protected String curso;
	//constructor
	
		public Alumno(String cedula, String nombre, String fechaNacimiento, String curso) {
			super(cedula,nombre,fechaNacimiento);
			this.curso = curso;
		}
		
		//metodo redefinido
		
		public String identificacion() {
			return super.identificacion() + ", Curso: "+ this.curso;
		}
	
}
