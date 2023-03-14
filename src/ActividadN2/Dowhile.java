package ActividadN2;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		/*int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
*/
		/*int n = 0;
		int cuadrado;
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		n = sc.nextInt();
		while(n >= 0){
			 cuadrado = (int) Math.pow(n, 2);
				System.out.println("El cuadrado es: " + cuadrado );
				System.out.print("Ingrese un numero: ");
				n = sc.nextInt();

		}
		System.out.print("Numero negativo el programa acaba ");
*/

		double  prom;
		int i = 0, acum = 0, n;
		Scanner sc = new Scanner(System.in);

		do{

			System.out.print("Ingrese un numero: ");
			n = sc.nextInt();
			if(n >= 0) {
			i++;
			acum += n;
			}

		}while(n >= 0);
		prom = acum/i;
		System.out.print("El promedio es: " + prom);

	}

}
