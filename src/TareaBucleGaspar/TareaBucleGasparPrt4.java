package pucese.edu.unidad1;

public class TareaBucleGasparPrt4 {

	public static void main(String[] args) {
		//Ejericicio 14
		//¿Qué imprime el código siguiente?
		 System.out.println(" Ejercicio 14 ");
		//Muestra la sucesion Fibonacci que consiste en la sucesion infinita de numeros naturales, pero en este caso la detendremos hasta n numero determinado
		//en el programa
		int n = Integer.parseInt("10");
        int f = 0, g = 1;

        for (int i = 1; i <= n; i++) {
            f = f + g;
            g = f - g;
            System.out.println(f); 
        }
        
        //Ejercicio 18
        
        /* A diferencia de los números armónicos, la suma 1/1 + 1/4 + 1/9 + 1/16 + ... + 1/n2 converge a una constante a medida que n crece hasta el infinito.
         *  (De hecho, la constante es π2 / 6, por lo que esta fórmula se puede utilizar para estimar el valor de π.) 
         * ¿Cuál de los siguientes bucles for calcula esta suma? Supongamos que n es un int inicializado en 1000000 y sum es un valor double inicializado en 0.
         */
        System.out.println(" Ejercicio 18 ");
        int y = Integer.parseInt("1000000");

        double sum = 0.0;
        for (int i = 1; i <= y; i++) {      
            sum += 1 / (1.0 * i * i);     // Buena - multiplicar por 1.0 para lanzar al doble
            // sum += 1.0 / (i * i);      // Mala  - Desbordamiento si n > 65,535
            // sum += 1 / (i * i);        // Mala  - División enteros
            // sum += 1.0 / i * i;        // Mala  - calcula (1.0 / i) * i
        }
        System.out.println(sum);
        System.out.println(Math.sqrt(6.0 * sum));
	}

}
