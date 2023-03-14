package Arreglo;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[], c[];
		a = new int [10];
		b = new int [10];
		c = new int [20];

		for(int i = 0; i < a.length; i++) {

			System.out.println("Vector A[" + (i+1) + "] = " );
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < b.length; i++) {

			System.out.println("Vector A[" + (i+1) + "] = " );
			b[i] = sc.nextInt();
		}
		int j = 0;
		for (int i = 0; i < 10; i++) {
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
		}

		for(int x:c)
			System.out.println(x);

	}

}
