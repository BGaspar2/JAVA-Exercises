package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
 private int carga;

public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
	super(matricula, marca, modelo);
	this.carga = carga;
	// TODO Auto-generated constructor stub
}

public int getCarga() {
	return carga;
}

@Override
public String toString() {
	return super.toString() + " Carga = " + carga;
}




 
}
