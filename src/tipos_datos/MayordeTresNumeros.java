package tipos_datos;

import java.util.Scanner;

public class MayordeTresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;

		Scanner sc = new Scanner(System.in);


		System.out.println("Ingrese el primer numero: ");
		n1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2 = sc.nextInt();
		System.out.println("Ingrese el tercer numero: ");
		n3 = sc.nextInt();
		if(n1 > n2) {
			if(n1 > n3) {
			System.out.println("El mayor es: " + n1);
			if(n2 < n3) {
				System.out.println("El menor es: " + n2);
			} else {
				System.out.println("El menor es: " + n3);
			}

		} else {
			System.out.println("El mayor es: " + n3);
			System.out.println("El menor es: " + n2);
		}

		} else {

			if(n2 > n3) {
				System.out.println("El mayor es: " + n2);
				if(n1 < n3) {
					System.out.println("El menor es: " + n1);
				} else {
					System.out.println("El menor es: " + n3);
				}

			} else {
				System.out.println("El mayor es: " + n3);
				System.out.println("El menor es: " + n1);
			}

			}





	}


}
