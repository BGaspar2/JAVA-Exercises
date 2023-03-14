package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
private int cilindrada;

public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
	super(matricula, marca, modelo);
	this.cilindrada = cilindrada;
	// TODO Auto-generated constructor stub
}

public int getCilindrada() {
	return cilindrada;
}

@Override
public String toString() {
	return super.toString() + " Cilindrada = " + cilindrada;
}






}
