package tipos_datos;

import javax.swing.JOptionPane;

public class segundaParte {

	public static void main(String[] args) {
		int suma, resta, producto, residuo;
		double a, b, division;
		a = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));

		suma = (int)(a + b);
		resta = (int)(a - b);
		producto = (int)(a * b);
		division = (a / b);
		residuo = (int)(a % b);

		System.out.println("Suma: " + suma);
		System.out.println("resta: " + resta);
		System.out.println("producto: " + producto);
		System.out.println("division: " + division);
		System.out.println("residuo: " + residuo);

		JOptionPane.showMessageDialog(null, "Los resultados son: "
				+ "\nSuma:" + suma
				+ "\nResta: " + resta
				+ "\nProducto: " + producto
				+ "\nDivision: " + division
				+ "\nResiduo: " + residuo);
		int c;
		c = Integer.parseInt(JOptionPane.showInputDialog("Numero 3: "));
		c += 5 ;
		JOptionPane.showMessageDialog(null, "El resultado es: \n" + c);
	}

}
