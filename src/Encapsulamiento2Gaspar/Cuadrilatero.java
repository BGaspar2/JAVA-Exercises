package Encapsulamiento2Gaspar;

public class Cuadrilatero {
private double lado1;
private double lado2;
private double perimetro;
private double area;


public Cuadrilatero(double lado1, double lado2) {

	this.lado1 = lado1;
	this.lado2 = lado2;
}


public Cuadrilatero(double lado1) {
	this.lado1 = this.lado2 = lado1;
}


public double getPerimetro() {
	perimetro = lado1 + lado2 + lado1 + lado2;
	return perimetro;
}

public double getArea() {
	area = lado1 * lado2;
	return area;

}


@Override
public String toString() {
	return "Lado 1 = "+ lado1 + " Lado 2 = " + lado2 + "\n" + 
			"Perimetro=" + perimetro + ", Area=" + area ;
}

//mostrar 
/*public void mostrarResultados() {
	System.out.println("El perimetro es: " + perimetro);
	System.out.println("El area es: " + area);

}

*/







}
