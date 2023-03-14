/*Elaborar un programa que calcule e imprima el área de las siguientes
 *  figuras geométricas según la opción seleccionada:
a.- Área del triángulo (Ingresar base y altura)
b.- Área del Cuadrado (Ingresar lado)
c.- Área del Círculo (Ingresar radio)
d.- Área del Rectángulo (Ingresar base y altura)
 */

package Actividad2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		int op =0;
		String menu = JOptionPane.showInputDialog("Menu: \n" + "1.Area del Triangulo \n" + "2. Area del Cuadrado: \n"
				+ "3. Area del circulo \n" + "4. Area del rectangulo \n" + "Ingresa una opcion", op);
		op = Integer.parseInt(menu);
		switch (op) {
		case 1:
		       double altura, areaT, base;
		        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de altura"));
		        base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de base"));
		        areaT=base*altura/2; JOptionPane.showMessageDialog(null, "El area del triangulo es: " + areaT); break;
		case 2:
			double area, lado;
	        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de lado"));
	        area=lado*lado;
	        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + area); break;
		case 3:
			double areaC, radio;
	        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de radio"));
	        areaC=Math.PI*radio*radio;
	        JOptionPane.showMessageDialog(null, "El area del circulo es: " + areaC); break;
		case 4:
			double h, a, b, perimetro;
	        h = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de altura"));
	        b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de base"));
	        a=b*h;
	        perimetro=h+b+h+b;
	        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + a); break;

		default:
			 JOptionPane.showMessageDialog(null, "Ingrese una opcion valida "); break;
		}

	}

}
