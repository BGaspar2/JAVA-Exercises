package Herencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		double notaFinal;
		int edad, codigoEstudiante;
		String nombres, apellidos;
		
		
		System.out.println("Nombres: ");
		nombres = sc1.next();
		System.out.println("Apellidos: ");
		apellidos = sc2.next();
		
		System.out.println("Codigo Estudiante: ");
		codigoEstudiante = sc.nextInt();
		System.out.println("Edad: ");
		edad = sc.nextInt();

		System.out.println("Nota Final: ");
		
		notaFinal = sc.nextDouble();
		
		
		
		Estudiante est = new Estudiante(nombres,apellidos, edad, codigoEstudiante, notaFinal);
		System.out.println(est.toString());
	}

}
