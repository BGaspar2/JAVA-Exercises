package TareaN7;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	static ArrayList<Empleados> empleados = new ArrayList <Empleados>();
	static Scanner sc = new Scanner(System.in);
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llenarEmpleados();
		mostrarResultados();
	}
	public static void llenarEmpleados() {
		int op;
		do {
			System.out.println("Empleados: ");
			System.out.println("1. Repartidor");
			System.out.println("2. Comercial");
			System.out.println("3. Salir");
			System.out.print("Opcion: ");
			op = sc.nextInt();

			switch(op) {
			case 1:


				llenarRepartidor();


				break;
			case 2:

				llenarComercial();



				break;
			}


		}while(op == 1 || op == 2);
	}



	public static void llenarRepartidor() {
		String nombre, zona;
		int edad;
		double salario;
		System.out.println("Nombre: ");
		nombre = sc.next();
		System.out.println("Edad: ");
		edad = sc.nextInt();
		System.out.println("Salario: ");
		salario = sc.nextDouble();
		System.out.println("Zona: ");
		zona = sc1.nextLine();
		Repartidor repartidor = new Repartidor(nombre,edad,salario,zona);
		empleados.add(repartidor);
		if(edad < 25 && zona.equals("zona 3") ||edad < 25 &&zona.equals("Zona 3") ||
				edad < 25 && zona.equals("ZONA 3" )) {
			System.out.println("Se aplico el PLUS de $300 ");
		}


	}

	public static void llenarComercial() {
		String nombre;
		int edad;
		double salario, comision;
		System.out.println("Nombre: ");
		nombre = sc.next();
		System.out.println("Edad: ");
		edad = sc.nextInt();
		System.out.println("Salario: ");
		salario = sc.nextDouble();
		System.out.println("Comision: ");
		comision = sc.nextDouble();
		Comercial comercial = new Comercial(nombre,edad,salario,comision);
		empleados.add(comercial);
		if(edad > 30 && comision > 200) {
			System.out.println("Se aplico el PLUS de $300 ");
		}

	}
	public static void mostrarResultados() {
		for (Empleados emp: empleados) {
			System.out.println(emp.toString());

			System.out.println("Valor Total: " + emp.Mplus() ) ;
		}
	}
}
