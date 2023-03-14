package ActividadN2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ActividadN2 {

	public static void main(String[] args) {
		/*1. Construir un programa que simule el funcionamiento de una calculadora
		 * que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división)
		 * con valores numéricos. El usuario debe especificar la operación con el primer carácter: S o s para
		 * la suma, R o r para la resta, P o p para el producto y D o d para la división.
		 */
		Scanner sc = new Scanner(System.in);
		double n1, n2 ;

		char op;
		System.out.println("CALCULADORA EN JAVA");
		System.out.print("Ingrese el primer numero: ");
		n1 = sc.nextDouble();
		System.out.print("Ingrese el segundo numero: ");
		n2 = sc.nextDouble();

		System.out.print("Operaciones que se pueden realizar: \n1.Suma \n2.Resta \n3.Producto \n4.Division "
				+ "\nIngrese la incial de la operacion que desea realizar: ");
		op = sc.next().charAt(0);
		if(op == 'S' || op == 's' )
		{
			System.out.println("El resultado de la suma entre "+ n1 +" y "+n2 +" es: " + (n1 + n2));
		}else if(op == 'R' || op == 'r') {
			 System.out.println("El resultado de la resta entre "+ n1 +" y "+n2 +" es: " + (n1 - n2));
		} else if(op == 'P' || op == 'p') {
			System.out.println("El resultado del producto entre "+ n1 +" y "+n2 +" es: " + (n1 * n2));
		} else if(op == 'D' || op == 'd') {
			double division = n1 / n2;
			BigDecimal resultado = new BigDecimal(division).setScale(2, RoundingMode.HALF_UP);
			System.out.println("El resultado de la division entre "+ n1 +" y "+n2 +" es: " + resultado);
		} else {
			System.out.println("El caracter ingresado no se encuentra en la lista");
		}



	}

}
