package pucese.edu.unidad1;

public class TareaBucleGasparPrt1 {

	public static void main(String[] args) {
		//Ejercicio 1
		/*Escriba un programa AllEqual.java que toma tres argumentos enteros de la línea de comandos e imprime igual si los
		 *  tres son iguales y no iguales en caso contrario.
		 */
	      System.out.println(" Ejercicio 1 ");
		 int a = Integer.parseInt("2");
	        int b = Integer.parseInt("2");
	        int c = Integer.parseInt("2");

	        if (a == b && a == c) {
	            System.out.println("all equal");
	        }
	        else {
	            System.out.println("not all equal");
	        }
	     
	        
	     //Ejercicio 6
	      /* Escriba un programa RollLoadedDie.java que imprima el resultado de rodar un dado cargado de tal manera que la probabilidad de obtener 
	       * un 1, 2, 3, 4 o 5 sea 1/8 y la probabilidad de obtener un 6 sea 3/8
	       */
	        
	        System.out.println(" Ejercicio 6 ");
	        
	        // double in the range [0.0, 1.0)
	        double r = Math.random();

	        // integer in the range 1 to 6 with desired probabilities
	        int roll;
	        if      (r < 1.0/8.0) roll = 1;
	        else if (r < 2.0/8.0) roll = 2;
	        else if (r < 3.0/8.0) roll = 3;
	        else if (r < 4.0/8.0) roll = 4;
	        else if (r < 5.0/8.0) roll = 5;
	        else                  roll = 6;

	        // print result
	        System.out.println(roll);
	}

}
