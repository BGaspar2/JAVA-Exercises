package ExamenG;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			@SuppressWarnings("rawtypes")
			ArrayList lista = new ArrayList();
			Estudiante est;
			String matricula, apellidos, nombres, carrera;
			int edad, nivel;
			char sexo;
			Double creditos;
			int cont = 0;
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			do {
				
				System.out.println("Estudiante #" + cont);
			System.out.println("Digite la matricula: ");
			matricula = sc.next();
			System.out.println("Digite los apellidos: ");
			apellidos = sc.next();
			System.out.println("Digite los nombres: ");
			nombres = sc.next();
			System.out.println("Digite la carrera: ");
			carrera = sc.next();
			System.out.println("Digite la edad: ");
			edad = sc.nextInt();
			System.out.println("Digite el nivel: ");
			nivel = sc.nextInt();
			System.out.println("Digite el sexo(H hombre, M mujer): ");
			sexo = sc.next().charAt(0);		
			System.out.println("Digite los creditos: ");
			creditos = sc.nextDouble();
			est = new Estudiante(matricula, apellidos, nombres, edad, sexo, carrera, nivel, creditos);
			Thread.sleep(500);
			System.out.println("El total a pagar de " + apellidos+ " son: " + est.calcularValorpagar());
			Thread.sleep(500);
			if(est.esMayorDeEdad() == true) {
				System.out.println( apellidos + " es mayor de Edad");
			} else {
				System.out.println( apellidos + " es menor de Edad");
			}
			Thread.sleep(500);
			if(est.comrpobarHorario() == 0) {
				System.out.println("Su horario será de 07:00 a 12:00 de lunes a viernes");
				
			}
			else if (est.comrpobarHorario() == 1) {
				System.out.println("Su horario será de 16:00 a 21:00 de lunes a viernes");
			}
			Thread.sleep(500);
			System.out.println("Guardado");
			Thread.sleep(500);
			
			lista.add(est.toString());
			cont++;
			} while(cont != 4);
			
			System.out.println("LISTADO DE ESTUDIANTES");
			for (Object object : lista) {
				System.out.println(object.toString() + "");
				Thread.sleep(500);

			}
			
			
	}

}
