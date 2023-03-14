package tipos_datos;

import javax.swing.JOptionPane;

public class ActividadEnClaseGaspar {

	public static void main(String[] args) {
		//  Programa que permita calcular
		//la altura de un triangulo isosceles, previo ingreso de su base y de sus lados iguales


		double b, l, h, b1;
		b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
		l = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de los dos lados iguales: "));
		b1 = b/2;
		h = Math.sqrt(Math.pow(l, 2) - Math.pow(b1, 2));
		JOptionPane.showMessageDialog(null, "El valor de la altura es: " + h);

		//1. Que ingrese el radio (r) y la altura corazón de un como
		//y calcule su volumen. Sabiendo que:  V = 13hπr2. El resultado del volumen debe redondearlo a 2 decimales.

		double r, V, altura;
		double PI = Math.PI;
		r = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la altura: "));
		V = (1/3)*(altura*PI*Math.pow(r, 2));
		JOptionPane.showMessageDialog(null, "El valor del volumen es: " + V);


	}

}
