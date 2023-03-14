package ActividadEnClase;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Ejercicio1Gaspar {

	public static void main(String[] args) throws InterruptedException {
		//1. Que ingrese el radio (r) y la altura(h) de un cono
		//y calcule su volumen. Sabiendo que:  V = 1/3 hπr2. El resultado del volumen debe redondearlo a 2 decimales.

		double r , h ;
		double PI = Math.PI;

		JOptionPane.showMessageDialog(null, "BIENVENIDO AL EJERCICIO 1 (Volumen de un Cono) :) \n" );


		//ENTRADAS
		r = Double.parseDouble(JOptionPane.showInputDialog("Por favor, ingrese el radio: "));
		h = Double.parseDouble(JOptionPane.showInputDialog("Por favor, ingrese la altura: "));
		//CALCULO
		double V = h*PI*Math.pow(r, 2) / 3;
		//REDONDEO
		BigDecimal resultado = new BigDecimal(V).setScale(2, RoundingMode.HALF_UP);

		//SALIDA
		JOptionPane.showMessageDialog(null, "El valor del volumen es: " + resultado);

		JOptionPane.showMessageDialog(null, "GRACIAS POR REVISAR EL EJERCICIO :) \n" );

	}

}
