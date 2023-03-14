package tipos_datos;

import javax.swing.JOptionPane;

public class entrada {

	public static void main(String[] args) {
		/*//mostrar en panel una cadena de texto
		String cadena;
		cadena = JOptionPane.showInputDialog("Ingrese la cadena: ");

		JOptionPane.showMessageDialog(null, "La cadena ingresada es: \n" + cadena);
		//mostrar en panel un caracter
				char caracter;
				caracter = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);

				JOptionPane.showMessageDialog(null, "La letra ingresada es: \n" + caracter);
		//mostrar en panel un numero
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
		JOptionPane.showMessageDialog(null, "El numero ingresado es: \n" + numero);
		//mostrar en panel un numero con decimales*/

		/*
		//ejercicio 1
		double radio;
		radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de un circulo: "));
		final double PI = 3.141516;
		double perimetro = 2 * PI * radio;
		double area = PI * (radio * radio);
		JOptionPane.showMessageDialog(null, "El radio ingresado es: \n" + radio);
		JOptionPane.showMessageDialog(null, "El perimetro es: \n" + perimetro);
		JOptionPane.showMessageDialog(null, "El area es: \n" + area);*/

		double archivo;
		archivo =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del archivo en KB: "));
		double conversionBit = archivo*1024*8;
		JOptionPane.showMessageDialog(null, "El tamaño en bits es: \n" + conversionBit);
	}

}
