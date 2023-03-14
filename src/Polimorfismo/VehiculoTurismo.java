package Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
	
	private int nPuertas;

	public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
		super(matricula, marca, modelo);
		this.nPuertas = nPuertas;
		// TODO Auto-generated constructor stub
	}

	public int getnPuertas() {
		return nPuertas;
	}

	@Override
	public String toString() {
		return super.toString() + " Numero de Puerta s= " + nPuertas;
	}

	
	
	
	
	
	
	
}
