package pucese.edu.unidad1;

public class TareaBuclesGasparPrt3 {

	public static void main(String[] args) {
		//Ejercicio 12
		/* Escriba un programa FunctionGrowth.java que imprima una tabla de los valores de ln n, n, n ln n, n 2, n3, y 2n para n = 16, 32, 64
		 * , ..., 2048. Utilice tabulaciones (caracteres'\t') para alinear columnas.
		 */
		 System.out.println(" Ejercicio 12 ");
		 System.out.println("log n \tn \tn log n\tn^2 \tn^3");
	        for (long i = 2; i <= 2048; i *= 2) {
	            System.out.print((int) Math.log(i));
	            System.out.print('\t');             // tab character
	            System.out.print(i);
	            System.out.print('\t');             
	            System.out.print((int) (i * Math.log(i)));
	            System.out.print('\t');             
	            System.out.print(i * i);
	            System.out.print('\t');             
	            System.out.print(i * i * i);
	            System.out.println();
	        }
	        
	        
	  //Ejercicio 13
	        
	        // ¿Cuál es el valor de m y n después de ejecutar el código siguiente?
	        System.out.println(" Ejercicio 13 ");
	        int n = Integer.parseInt("123456789");        // original integer

	        // Inversa usando aritmética
	        int m = 0;
	        while (n != 0) {
	            m = (10 * m) + (n % 10);
	            n = n / 10;
	        }
	        System.out.println("Valor de m: " + m);
	        System.out.println("valor de n: " + n);

	        	//opcional
	        // invertir de nuevo usando la concatenación de cadenas
	        String s = "";
	        while (m != 0) {
	            int digit = m % 10;
	            s = s + digit;
	            m = m / 10;
	        }
	        System.out.println(s);


	}

}
