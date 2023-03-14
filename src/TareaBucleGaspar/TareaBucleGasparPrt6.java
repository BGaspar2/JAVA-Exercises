package pucese.edu.unidad1;

public class TareaBucleGasparPrt6 {

	public static void main(String[] args) {
		//Ejericio 22
		
		/* Escriba un fragmento de código de programa que ponga la representación 
		 * binaria de un entero positivo n en una 
		 * variable String s.
		 */
		 System.out.println(" Ejercicio 22 ");
		 int n = Integer.parseInt("5");

	        // dividir repetidamente por dos, y formar el resto al revés
	        String s = "";
	        for (int i = n; i > 0; i /= 2) {
	            s = (i % 2) + s;
	        }
	        System.out.println(s);

	}

}
