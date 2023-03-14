package ActividadEnClase;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Ejercicio2Gaspar {

	public static void main(String[] args) {
		/*2. La calificación final de un estudiante de TI se calcula con base a las calificaciones de
		cuatro aspectos de su rendimiento académico: participación, primer examen, segundo examen y examen final.
		Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 4%, 28%, 28% y 40%.
		Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante (redondeo a 2 decimales).
		*/


		double participacion , pExamen , sExamen, examenF ;
		double ponderacionP, ponderacionE1, ponderacionE2, ponderacionEf;

		JOptionPane.showMessageDialog(null, "BIENVENIDO AL EJERCICIO 2 (Calificación Final) :) \n" );
		String nombre;
		nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");

		//ENTREDAS
		participacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su puntaje en participacion: "));
		pExamen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su puntaje en el primer examen: "));
		sExamen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su puntaje en el segundo examen: "));
		examenF = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su puntaje en el examen final: "));


		//CALCULOS
		ponderacionP = participacion * 0.04;
		ponderacionE1 = pExamen * 0.28;
		ponderacionE2 = sExamen * 0.28;
		ponderacionEf = examenF * 0.40;
		double notaFinal = ponderacionP + ponderacionE1 + ponderacionE2 + ponderacionEf;

		//REDONDEO
		BigDecimal resultado = new BigDecimal(notaFinal).setScale(2, RoundingMode.HALF_UP);

		//SALIDA
		JOptionPane.showMessageDialog(null, "La nota final del estudiante " + nombre + " es: " + resultado);

		JOptionPane.showMessageDialog(null, "GRACIAS POR REVISAR EL EJERCICIO :) \n" );



	}

}
