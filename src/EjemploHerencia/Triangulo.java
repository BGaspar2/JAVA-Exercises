package EjemploHerencia;

public class Triangulo extends Poligno {
	private double lado1;
	private double lado2;
	private double lado3;
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		// TODO Auto-generated constructor stub
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	public double getLado1() {
		return lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public double getLado3() {
		return lado3;
	}
	
	public double area() {
		double p = (lado1+ lado2 + lado3) / 2.0;
		double a = Math.sqrt(p * (p-lado1) * (p-lado2) * (p-lado3));
		return a;
	}
	@Override
	public String toString() {
		return super.toString() + " Triangulo lado 1 =" + lado1 + ", lado 2 =" + lado2 + ", lado 3 =" + lado3;
	}
	
	
	

	
	
	
	
}
