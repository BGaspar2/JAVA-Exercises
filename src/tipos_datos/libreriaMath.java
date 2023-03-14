package tipos_datos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class libreriaMath {

	public static void main(String[] args) {
		// raiz cuadrada

		//int raiz = (int)Math.sqrt(18);
		//System.out.print("Resultado: " + raiz);
		//potencia
		/*double base = 5 , exponente = 2;
		double res = Math.pow(base, exponente);
		System.out.print("Resultado: " + res);*/


		double raiz = Math.pow(128,(double) 1/5);
		//double resultado = Math.round(raiz*100.0)/100.0;
		BigDecimal resultado = new BigDecimal(raiz).setScale(2, RoundingMode.HALF_UP);
		System.out.print("Resultado: " + resultado);
	}

}
