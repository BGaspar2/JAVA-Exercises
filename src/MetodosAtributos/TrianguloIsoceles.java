package MetodosAtributos;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class TrianguloIsoceles {

	public double perimetroTriangulo(double ladosIguales, double base) {
		double perimetro = 2*ladosIguales + base;
		return perimetro;
	}
	public double areaTriangulo(double ladosIguales, double base) {
		double altura, area;
		double b1 = base/2;
		altura = Math.sqrt(Math.pow(ladosIguales, 2) - Math.pow(b1, 2));

		area = base* altura / 2;
		return area;
	}
	public void mostrarResultado(double area, double perimetro) {
		BigDecimal resultado = new BigDecimal(area).setScale(2, RoundingMode.HALF_UP);
		System.out.println("Area: " + resultado);
		System.out.println("Perimetro: " + perimetro);
	}
	public static void main(String[] args) {
		TrianguloIsoceles triangulo = new TrianguloIsoceles();
		double base = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
		double lados = Double.parseDouble(JOptionPane.showInputDialog("Valor Lados: "));
		double a = triangulo.areaTriangulo(lados, base);
		double p = triangulo.perimetroTriangulo(lados, base);
		triangulo.mostrarResultado(a, p);
	}


}
