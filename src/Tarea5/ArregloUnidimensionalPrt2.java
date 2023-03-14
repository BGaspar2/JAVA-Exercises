package Tarea5;

import java.util.Scanner;

public class ArregloUnidimensionalPrt2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner (System.in);
		//Un programa que ingrese un vector de N elementos y los ordene de mayor a menor.

				int nElementos ;
				System.out.print("Ingrese la cantidad de elementos: ");
				nElementos = sc.nextInt();
				int numeros[] = new int[nElementos];
				System.out.println("Ingrese los elementos del vector: ");
				for(int i = 0; i < numeros.length; i++) {

					System.out.print("Vector [" + (i+1) + "] = " );
					numeros[i] = sc.nextInt();
					System.out.println("Guardando...");
					  Thread.sleep(500);
				}

				System.out.println("Ordenando el vector...");
				  Thread.sleep(500);
				for (int i=0; i<nElementos-1; i++)
				{
				   for (int j=i+1; j<nElementos; j++)
				  {
				    if(numeros[i]<numeros[j])
				    {
				     int aux = numeros[i];
				     numeros[i] = numeros[j];
				     numeros[j] = aux;
				    }
				  }
				}
				 System.out.println("Numeros ordenados de mayor a menor.");
				 Thread.sleep(500);
			        for(int f=0;f<numeros.length;f++) {
			            System.out.println(numeros[f]);
			            Thread.sleep(500);
			        }
	}

}
