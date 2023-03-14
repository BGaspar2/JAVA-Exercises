package Interfaces;

public class Empleado_MT extends Empleados implements Saldo{
	private int horas_extras;
	private String area;
	public Empleado_MT(String cedula, String apellidos, String nombres, String direccion, int horas_extras, String area) {
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
		return SALARIO_BASEMT + horas_extras * 7.50;
	}
	@Override
	public String toString() {
		return super.toString() + " Empleado Medio Tiempo: Horas Extras = " + horas_extras + ", Area=" + area ;
	}
	
}
