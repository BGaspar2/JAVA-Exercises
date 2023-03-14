package EjemploHerencia;

public abstract class Poligno {
	protected int nLados; // Numeros de lados
	
	
	
	
	//Constructor
	public Poligno(int nLados) {
		this.nLados = nLados;
	}




	public int getnLados() {
		return nLados;
	}

	
	
	//metodo abstracto
	
	public abstract double area();




	@Override
	public String toString() {
		return "Numero de lados =" + nLados;
	}


	 
	
	
	
	
	
	
	
}
