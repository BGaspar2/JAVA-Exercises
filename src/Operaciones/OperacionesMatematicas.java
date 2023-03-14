package Operaciones;
/**
 * Esta es la clase OperacionesMatematicas, donde se encuentran cuatro metodos que retornan un valor.
 * Los metodos son:  suma, resta, multiplicacion y division
 * @author bryan
 *
 */

public class OperacionesMatematicas {
	/**
	 * Este metodo permite realizar la suma de dos numeros dobles previamente ingresador por teclado
	 * @param n1 primer numero ingresado por usuario. Debe ser doble
	 * @param n2 segundo numero ingresado por usuario. Debe ser doble
	 * @return sum Retorna la suma de dos numeros
	 */
	public double suma(double n1, double n2) {
		double sum;
		sum = n1+n2;
		return sum;
	}
	/**
	 * Este metodo permite realizar la resta de dos numeros dobles previamente ingresador por teclado
	 * @param n1 primer numero ingresado por usuario. Debe ser doble
	 * @param n2 segundo numero ingresado por usuario. Debe ser doble
	 * @return res Retorna la resta de dos numeros
	 */
	public double resta(double n1, double n2) {
		double res;
		res = n1-n2;
		return res;
	}
	/**
	 * Este metodo permite realizar el producto de dos numeros dobles previamente ingresador por teclado
	 * @param n1 primer numero ingresado por usuario. Debe ser doble
	 * @param n2 segundo numero ingresado por usuario. Debe ser doble
	 * @return mult Retorna el producto de dos numeros
	 */
	public double multiplicacion(double n1, double n2) {
		double mult;
		mult = n1*n2;
		return mult;
	}
	/**
	 * Este metodo permite realizar la division de dos numeros dobles previamente ingresador por teclado
	 * @param n1 primer numero ingresado por usuario. Debe ser doble
	 * @param n2 segundo numero ingresado por usuario. Debe ser doble
	 * @return div Retorna la division de dos numeros
	 */
	public double division(double n1, double n2) {
		double div;
		div = n1/n2;
		return div;
	}
}
