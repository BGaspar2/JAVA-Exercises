package ActividadN2;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		int i = 0;
		double nota1, nota2, prom;
		Scanner sc = new Scanner(System.in);

		while( i < 10 ) {
			i++;
			System.out.print("Ingrese la nota 1 del estudiante "+ i +" : ");
			nota1 = sc.nextDouble();
			System.out.print("Ingrese la nota 2 del estudiante "+ i +" : ");
			nota2 = sc.nextDouble();
			prom = (nota1 + nota2) / 2;
			if( prom < 20) {
				System.out.println("Su promedio es " + prom +" y es menor a 20 por lo tanto el programa acaba");
				break;

			}
				System.out.println("El promedio del estudiante "+ i +" es de: " + prom);

			}



	}

}
