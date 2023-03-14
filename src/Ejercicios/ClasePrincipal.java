package Ejercicios;

import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Persona p = new Persona();
		int PDI;
		double p1, p2, p3, examenFinal, prom;
		String ap, nom;
		System.out.println("Ingrese su PDI: ");
		 PDI = sc.nextInt();
		p.setPDI (PDI);
		System.out.println("Ingrese su apellido: ");
		 ap = sc1.nextLine();
		p.setApellidos(ap);
		System.out.println("Ingrese su nombre: ");
		 nom = sc1.nextLine();
		p.setNombres(nom);
		System.out.println("Ingrese la nota del primer parcial: ");
		 p1 = sc.nextDouble();
		p.setPrimerParcial(p1);
		System.out.println("Ingrese  la nota del segundo parcial: ");
		 p2 = sc.nextDouble();
		p.setSegundoParial(p2);
		System.out.println("Ingrese  la nota del tercer parcial: ");
		 p3 = sc.nextDouble();
		p.setTercerParial(p3);
		System.out.println("Ingrese  la nota del examen final: ");
		 examenFinal = sc.nextDouble();
		p.setExamenFinal(examenFinal);
		
		
		System.out.println("PDI: " + p.getPDI());
		
		System.out.println("Apellidos: " + p.getApellidos());
		
		System.out.println("Nombres: " + p.getNombres());
		System.out.println("Notas: ");
		System.out.println("1er Parcial: " + p.getPrimerParcial());
		System.out.println("2do Parcial: " + p.getSegundoParial());
		System.out.println("3er Parcial: " + p.getTercerParial());
		System.out.println("Examen Final: " + p.getExamenFinal());
		 prom = (p.getPrimerParcial() + p.getSegundoParial() + p.getTercerParial() + p.getExamenFinal()) /4;
		System.out.println("Promedio General: " + prom);
	}

}
