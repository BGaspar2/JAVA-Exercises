package pucese.edu.unidad1;

import java.util.Scanner;

public class ExamenGaspar {

	public static void main(String[] args) {
	int a, n;
//ejercicio 2
	Scanner entrada = new Scanner(System.in);
	System.out.print("Ingrese el valor de a:");
	a = entrada.nextInt();
	System.out.print("Ingrese el valor de n:");
	n = entrada.nextInt();
   System.out.println("El resultado es:" + mod(a,n));
   
  
	
	}
	//Ejercicio 2
	public static int mod(int a, int n) {
	
		int res = (int)Math.round(a%n);
		return res;	
	}

}
