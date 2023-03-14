package EjemploHerencia;

public class Rectangulo extends Poligno{
	
	
	private double lado1;
	private double lado2;
	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1 = lado1;
		this.lado2 = lado2;
		
		// TODO Auto-generated constructor stub
	}
	public double getLado1() {
		return lado1;
	}
	
	public double getLado2() {
		return lado2;
	}
	
	public double area() {
	
		double a = lado1 * lado2 ;
		return a;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Rectangulo lado 1 =" + lado1 + ", lado 2 =" + lado2;
	}
}
