package TareaN7;

public class Comercial extends Empleados{
	private double comision;

	public Comercial(String nombre, int edad, double salario,double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	@Override
	public double Mplus() {

		if(edad > 30 && comision > 200)
		  salario += super.PLUS + comision;
		else
			salario += comision;

			return salario;

	}
	@Override
	public String toString() {
		return super.toString() + ", tipo: Comercial comision = " + comision;
	}





}
