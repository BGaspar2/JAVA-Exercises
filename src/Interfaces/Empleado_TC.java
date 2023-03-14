package Interfaces;

public class Empleado_TC extends Empleados implements Saldo {
	private int horas_extras;
	private String area;
	public Empleado_TC(String cedula, String apellidos, String nombres, String direccion, int horas_extras, String area) {
		super(cedula, apellidos, nombres, direccion);
		this.horas_extras = horas_extras;
		this.area = area;
		// TODO Auto-generated constructor stub
	}
	public int getHoras_extras() {
		return horas_extras;
	}
	
	public String getArea() {
		return area;
	}
	
	public double calcular_salario() {
		return SALARIO_BASETC + horas_extras * 10;
	}
	@Override
	public String toString() {
		return super.toString() + " Empleado Tiempo Completo: Horas Extras = " + horas_extras + ", Area=" + area ;
	}
	
	
	
	
	
	
	
}
