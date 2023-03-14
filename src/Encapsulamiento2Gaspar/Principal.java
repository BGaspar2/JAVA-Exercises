package Encapsulamiento2Gaspar;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrilatero c;
		double l1, l2;
		
		l1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 1: "));
		l2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 2: "));
		if(l1 == l2) {
			System.out.println("Es un cuadrado");
		
			c = new Cuadrilatero(l1);
			c.getPerimetro();
			 c.getArea();
			System.out.println(c.toString());
		}else {
			System.out.println("Es un rectangulo");
			c = new Cuadrilatero(l1,l2);
			 c.getPerimetro();
			 c.getArea();
			System.out.println(c.toString());
		}
	}

}
