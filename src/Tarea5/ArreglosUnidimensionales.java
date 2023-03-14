package Tarea5;

import java.util.Scanner;

public class ArreglosUnidimensionales {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner (System.in);
		// Un programa que permita ingresar un vector de N elementos e imprima la posición y el número menor.
		int nElementos ;
		System.out.print("Ingrese la cantidad de elementos: ");
		nElementos = sc.nextInt();
		int numeros[] = new int[nElementos];
		System.out.print("Ingrese los elementos del vector: \n");
		for(int i = 0; i < numeros.length; i++) {

			System.out.print("Vector [" + (i+1) + "]: " );
			numeros[i] = sc.nextInt();
			System.out.println("Guardando...");
			  Thread.sleep(500);
		}
		int menor = numeros[0];
		int cont = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] < menor) {
				menor = numeros[i];
				cont = i + 1;
			}
		}
		  Thread.sleep(500);
		System.out.println("El valor menor es: " + menor + " y se encuentra en la posicion: " + cont);


	}

}
