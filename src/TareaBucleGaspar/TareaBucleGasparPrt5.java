package pucese.edu.unidad1;

public class TareaBucleGasparPrt5 {

	public static void main(String[] args) {
		//Ejercicio 21
		/*Modificar binario.java para obtener un programa Modificar Kary.java que toma un segundo argumento de línea de comandos
		 *  K y convierte el primer argumento a la base K. 
		 * Supongamos que la base está entre 2 y 16. Para bases mayores que 10, utilice las letras de la A a la F para representar los dígitos del 11 al 16, 
		 * respectivamente.
		 */
	
		 // Print base-k representation of i.
		 System.out.println(" Ejercicio 21 ");
        long i = Long.parseLong("10");
        int k = Integer.parseInt("16");
        
        int v = 1;
        
        while (v <= i/k)
            v = k*v;
        
        // Now v is the largest power of k <= i.
        
        long n = i;

        while (v > 0)
        {
            // Cast out powers of k in decreasing order.
            if (n < v)
            {
                System.out.print("0");
            }
            else
            {
                int digit = (int)(n / v);
                if (digit > 9)
                {
                    char charDigit = (char)('A' + (digit - 10));
                    System.out.print(charDigit);
                }
                else
                    System.out.print(digit);
                n -= v*digit;
            }
            
            v = v/k;
        }
        
        System.out.println();

	}

}
