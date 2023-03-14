package Enumeraciones;

public enum Transporte1 {
	COCHE(60), CAMION(50), TREN(70), AVION(600), BARCO(20);
	private int velocidad;
	
	//metodo constructor
	Transporte1(int vel){
		 velocidad = vel;
	}
	
	//Añadir un meodo de retorno 
	int getVelocidad() {
		return velocidad;
	}
}
