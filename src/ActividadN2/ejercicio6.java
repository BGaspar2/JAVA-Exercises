package ActividadN2;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {

		int i = 0, fin;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique el limite de numeros pares a mostrar: ");
		fin = sc.nextInt();

		while( i < fin ) {
			i++;
			if( i % 8 == 0) {
				continue;
			}
			if( i % 2 == 0) {
				System.out.println(i);

			}


		}


	}

}
