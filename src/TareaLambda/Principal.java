package TareaLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
	public static double calcularS (double num1, double num2) {
		OperacionesBasicas sum =  ( n1,  n2) -> (n1+n2);
			return sum.Calcular(num1, num2);
	}
	public static double calcularR (double num1, double num2) {
		OperacionesBasicas res =  ( n1,  n2) -> (n1-n2);
			return res.Calcular(num1, num2);
	}
	public static double calcularM (double num1, double num2) {
		OperacionesBasicas mul =  ( n1,  n2) -> (n1*n2);
			return mul.Calcular(num1, num2);
	}
	public static double calcularD (double num1, double num2) {
		OperacionesBasicas div =  ( n1,  n2) -> (n1/n2);
			return div.Calcular(num1, num2);
	}
	public static void ordenar2Num (double num1, double num2) {
		ArrayList<Double> lista = new ArrayList<>();
		lista.add(num1);
		lista.add(num2);
		Collections.sort(lista, (n1,  n2) -> n1.compareTo(n2));
		for(Double elemento:lista) {
			if(lista.get(0)== elemento) {
			System.out.println("Menor: " + elemento);
			}
			if(lista.get(1)== elemento) {
				System.out.println("Mayor: " + elemento);
				}
			}
	}
	public static void main(String[] args) {
		double n1, n2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("N1: ");
		n1 = sc.nextDouble();
		System.out.print("N2: ");
		n2 = sc.nextDouble();
		System.out.println("Suma: " + calcularS(n1,n2));
		System.out.println("Resta: " +  calcularR(n1,n2));
		System.out.println("Multiplicacion: " + calcularM(n1,n2));
		System.out.println("Division: " +  calcularD(n1,n2));
		ordenar2Num(n1,n2);
	}

}
