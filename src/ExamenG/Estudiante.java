package ExamenG;

public class Estudiante {
	String matricula;
	String apellidos;
	String nombres;
	int edad;
	char sexo;
	String carrera;
	int nivel;
	Double creditos;
	public Estudiante(String matricula, String apellidos, String nombres, int edad, char sexo, String carrera,
			int nivel, Double creditos) {
		super();
		this.matricula = matricula;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.carrera = carrera;
		this.nivel = nivel;
		this.creditos = creditos;
	}
	public String getMatricula() {
		return matricula;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public Double getCreditos() {
		return creditos;
	}
	public void setCreditos(Double creditos) {
		this.creditos = creditos;
	}
	
	protected double calcularValorpagar() {
		double totalPagar = 0.00;
		if(getCreditos()<= 10) {
			totalPagar = creditos * 60.00;
		}
		else {
			totalPagar = creditos * 55.00;
		}
		
		return totalPagar;
	}
	protected int comrpobarHorario() {
		if(getNivel() == 1 || getNivel() == 2 || getNivel() == 3 ) 
			return 0;
		else if(getNivel() == 4 || getNivel() == 5 || getNivel() == 6 || getNivel() == 7 || getNivel() == 8)
			return 1;
		else 
			return 0;
		
		
	}
	protected boolean esMayorDeEdad() {
		if(getEdad() >= 18)
			return true;
		else
			return false;
	}
	protected char comprobarSexo() {
		if(getSexo() == 'h' || getSexo() == 'm' || getSexo() == 'H'
				|| getSexo() == 'M')
		return getSexo();
		else 
			return 'H';	
	}
	@Override
	public String toString() {
		return "Estudiante [matricula=" + matricula + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + comprobarSexo() + ", carrera=" + carrera + ", nivel=" + nivel + ", creditos=" + creditos
				+ ", Horario =" + comrpobarHorario() +", valor a pagar=" + calcularValorpagar()+", es mayor de edad?="+ esMayorDeEdad()+ "]";
	}
	
	
	
	
	
	

}
