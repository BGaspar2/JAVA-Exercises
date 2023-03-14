package Arreglo;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*int [] numeros = new int[3];

		numeros[0] = 7;
		numeros[1] = 10;
		numeros[2] = 13;


		for(int i = 0; i < 3; i++) {
			System.out.println("Vector [" + (i+1) + "] = " + numeros[i]);
		}*/
		Scanner sc = new Scanner(System.in);
		//int [] numeros = {5,10,40,65,32,2};
		//int nElementos;

		//nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos: "));

		int [] numerosa = new int[10];
		//System.out.println("Ingrese los elementos del verctor: ");
		int [] numerosb = new int[10];

		int [] numerosc = new int[20];
		for(int i = 0; i < numerosa.length; i++) {

			System.out.println("Vector A[" + (i+1) + "] = " );
			numerosa[i] = sc.nextInt();
		}
		for(int i = 0; i < numerosb.length; i++) {

			System.out.println("Vector B[" + (i+1) + "] = " );
			numerosb[i] = sc.nextInt();
		}

		for(int i = 0; i < numerosc.length; i++) {

			System.out.println("Vector B[" + (i+1) + "] = " );
			numerosb[i] = sc.nextInt();
		}


		int cont = 0;
		double prom = 0;

		/*for(double j: numeros) {
			cont++;
			prom+=j;
		}
*/
		System.out.println("El promedio de los numeros es: " + prom/5 );

		/*for(int i = 0; i < 4; i++) {
			System.out.println("Vector [" + (i+1) + "] = " + numeros[i] );
		}*/





	}

}
