package EjercicioGasparPOO;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Esfera esfera;
		double r ;
		r = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio: "));
		esfera = new Esfera(r);
		double res = esfera.getVolumen();
		
		BigDecimal bd = new BigDecimal(res);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		System.out.println("El volumen es: " + bd) ;
		
		
	}

}
