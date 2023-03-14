/**
 * Este es el package Operaciones, donde estan almacenadas la clase OperacionesMatematicas y la clase principal
 * @author bryan
 * @version 1.0 17/01/2022
 */
package Operaciones;

import javax.swing.JOptionPane;

public class Principal {
	/**
	 * Clase principal donde se ingresan dos numeros enteros y se llama a cada uno de los metodos que posee la clase operacionesMatematicas
	 * Al final se imprimen los resultados de las cuatro operaciones
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacionesMatematicas op = new OperacionesMatematicas();
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Numero 1: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Numero 2: "));
		System.out.println("La suma es: " + op.suma(n1, n2));
		System.out.println("La resta es: " + op.resta(n1, n2));
		System.out.println("La multiplicacion es: " + op.multiplicacion(n1, n2));
		System.out.println("La division es: " + op.division(n1, n2));
		
	}

}
