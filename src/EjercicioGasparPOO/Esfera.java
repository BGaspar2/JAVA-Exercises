package EjercicioGasparPOO;


public class Esfera {
	private double radio;
	private double volumen;
	private final double PI = 3.141592;
	
	public Esfera(double radio) {
		this.radio = radio;
	}
	public double getVolumen() {
		volumen = (4* Math.pow(radio, 3)/3)*PI;
		
		return volumen;
	}

	
	
}
