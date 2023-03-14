package ActividadN2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ActividadN2Parte2 {

	public static void main(String[] args) {
		/*2. Elaborar un programa que calcule e imprima el área de las siguientes figuras
		 * geométricas según la opción seleccionada:

		a.- Área del triángulo (Ingresar base y altura)
		b.- Área del Cuadrado (Ingresar lado)
		c.- Área del Círculo (Ingresar radio)
		d.- Área del Rectángulo (Ingresar base y altura)
	*/
		Scanner sc = new Scanner(System.in);
		double b, h, l, r;
		final double PI = 3.141516;
		char op;

		System.out.print("Menu: "
				+ "\na.Área del triángulo "
				+ "\nb.Área del Cuadrado "
				+ "\nc.Área del Círculo "
				+ "\nd.Área del Rectángulo "
				+ "\nIngrese una opcion: ");

		op = sc.next().charAt(0);
		switch(op) {
		case 'a':
		case 'A':
			System.out.println("Selecciono Área del triángulo");
			System.out.print("Ingrese la base: ");
			b = sc.nextDouble();
			System.out.print("Ingrese la altura: ");
			h = sc.nextDouble();
			double calculo = (b * h)/2;
			BigDecimal resultado = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
			System.out.print("El Área del triangulo es: " + resultado);
		break;
		case 'b':
		case 'B':
			System.out.println("Selecciono Área del cuadrado");
			System.out.print("Ingrese el valor de los lados: ");
			l = sc.nextDouble();
			double areaCuadrado = Math.pow(l, 2);
			System.out.print("El Área del cuadrado es: " + areaCuadrado);
		break;
		case 'c':
		case 'C':
			System.out.println("Selecciono Área del circulo");
			System.out.print("Ingrese el radio: ");
			r = sc.nextDouble();
			double areaCirculo = PI * Math.pow(r, 2);
			BigDecimal resultado1 = new BigDecimal(areaCirculo).setScale(2, RoundingMode.HALF_UP);
			System.out.print("El Área del circulo es: " + resultado1);
		break;
		case 'd':
		case 'D':
			System.out.println("Selecciono Área del rectándulo");
			System.out.print("Ingrese la base: ");
			b = sc.nextDouble();
			System.out.print("Ingrese la altura: ");
			h = sc.nextDouble();
			double areaRectangulo = b * h ;
			System.out.print("El Área del rectangulo es: " + areaRectangulo);
		break;
		default:
			System.out.print("Ingrese Una Opcion Correcta ");
			break;

		}



	}

}
