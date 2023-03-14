package pucese.edu.unidad1;

public class TareaBucleGasparPrt2 {

	public static void main(String[] args) {
		//Ejercicio 8
		
		/* Reescriba TenHellos.java para crear un programa Hellos.java que toma el número de líneas para imprimir como un argumento de línea de comandos. 
		 * Puede suponer que el argumento es menor que 1000. 
		 * Sugerencia: considere usar i % 10 e i % 100 para determinar si se debe usar "st", "nd", "rd" o "th" para imprimir el ith Hello.
		 */
	      System.out.println(" Ejercicio 8 ");
		 int n = Integer.parseInt("100");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(i);

	            // ends in 11 through 20 -> use "th" as suffix
	            if (i % 100 >= 11 && i % 100 <= 20) {
	                System.out.print("th");
	            }

	            // otherwise if ends in { 1, 2, 3 } -> use { "st", "nd", "rd" }  as suffix
	            else if (i % 10 == 1) System.out.print("st");
	            else if (i % 10 == 2) System.out.print("nd");
	            else if (i % 10 == 3) System.out.print("rd");

	            // otherwise use "th" as suffix
	            else                  System.out.print("th");

	            System.out.println(" Hello");
	        }
	        System.out.println(" Ejercicio 9 ");
	        //Ejercicio 9
	        // Escriba un programa FivePerLine.java que, utilizando un bucle for
	        //y una instrucción if, imprime los enteros de 1000 a 2000 con cinco enteros por línea. Sugerencia:utilice el operador %.
	        // print integers from 1000 to 2000, 5 per line
	        int START = 1000;
	        int END   = 2000;
	        int PER_LINE = 5;
	        for (int i = START; i <= END; i++) {
	            System.out.print(i + " ");
	            if ((i + 1) % PER_LINE == 0) System.out.println();
	        }
	        System.out.println();

	}

}
