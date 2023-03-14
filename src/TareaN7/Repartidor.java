package TareaN7;

public class Repartidor extends Empleados{
	private String zona;

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}
	@Override
	public double Mplus() {

		if(edad < 25 && zona.equals("zona 3") ||edad < 25 &&zona.equals("Zona 3") ||
				edad < 25 && zona.equals("ZONA 3" )) {
		 salario += super.PLUS;
		}
		return salario;
	}

	@Override
	public String toString() {
		return super.toString() + ", tipo: Repartidor zona = " + zona;
	}





}
