package tipos_datos;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//programa que ingrese los lados de un rectangulo y calcule el area y perimetro
		/*
		double base = 5;
		double altura = 10;
		double area = (base*altura);
		double perimetro = 2 * (base + altura);
		System.out.println("El area es: " + area);
		System.out.println("El perimetro  es: " + perimetro);*/
		int edad;
		//creando entrada por teclado
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese la edad: ");//escribiendo mensaje
		edad = entrada.nextInt(); //guardar el valor ingresado en la variable edad.
		System.out.println("La edad ingresada es: " + edad + " años");
		float nota;

		System.out.print("Ingrese la nota: ");//escribiendo mensaje
		nota = entrada.nextFloat(); //guardar el valor ingresado en la variable nota.
		System.out.println("La nota ingresada es: " + nota + "/50");

		String cadena;

		System.out.print("Ingrese el texto: ");//escribiendo mensaje
		cadena = entrada.nextLine(); //guardar el valor ingresado en la variable cadena hasta que encuentre un espacio.
		System.out.println("El texto ingresado es: " + cadena);

		char op;

		System.out.print("Ingrese opcion (A o B ): ");//escribiendo mensaje
		op = entrada.next().charAt(0); //guardar el valor ingresado en la variable cadena hasta que encuentre un espacio.
		System.out.println("La opcion es: " + op);
	}

}
