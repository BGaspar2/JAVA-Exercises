package TareaN7;

public abstract class Empleados {
	protected String nombre;
	protected int edad;
	protected double salario;
	protected final double PLUS = 300;
	public Empleados(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getSalario() {
		return salario;
	}
	public abstract double Mplus();

	@Override
	public String toString() {
		return "Empleados: nombre = " + nombre + ", edad = " + edad + ", salario = " + salario;
	}







}
