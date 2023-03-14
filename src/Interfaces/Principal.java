package Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Empleados> emp = new ArrayList<Empleados>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cedula, apellidos, nombres, direccion, area;
		int hE, tipoE;
		System.out.println("Cedula = ");
		cedula = sc.nextLine();
		System.out.println("Apellidos = ");
		apellidos = sc.nextLine();
		System.out.println("Nombres = ");
		nombres = sc.nextLine();
		System.out.println("Direccion = ");
		direccion = sc.nextLine();
		System.out.println("Area = ");
		area = sc.nextLine();
		System.out.println("Horas Extras = ");
		hE = sc.nextInt();
		System.out.println("Tipo de empleado: (1. Tiempo Completo) (2. Medio Tiempo) ");
		tipoE = sc.nextInt();
		
		if(tipoE == 1) {
			Empleado_TC emp = new Empleado_TC(cedula, apellidos, nombres, direccion, hE, area);
			System.out.println(emp.toString());
			System.out.println("Su salario es: " + emp.calcular_salario());
		}
		else if(tipoE == 2) {
			Empleado_MT emp = new Empleado_MT(cedula, apellidos, nombres, direccion, hE, area);
			System.out.println(emp.toString());
			System.out.println("Su salario es: " + emp.calcular_salario());
			
		}
	}

}
