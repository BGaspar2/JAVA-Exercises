package poo2;

import java.util.Scanner;

public class AppAlumno {
	final static int cantidad=1;
	static Alumno [] alumnado =  new Alumno[cantidad];
	
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		for (int i=0; i<alumnado.length; i++)
			alumnado[i] = new Alumno();
		cargaTotal();
		mostrarTotal();
		mostrar_marca();
	}
	
	static void cargaTotal() {
		for (int i=0; i<alumnado.length; i++) {
		    System.out.println("posicion:"+ i + "-->");
			alumnado[i].cargar();
		}
	}
	
	static void mostrarTotal() {
		for (int i=0; i<alumnado.length; i++) {
		    System.out.println("posicion:"+ i + "-->");
			alumnado[i].mostrar();
		}
	}
	static void mostrar_marca() {
		for (int i=0; i<alumnado.length; i++) {
		    System.out.println("posicion:"+ i + "-->");
			alumnado[i].mostrar_marca();
		}
	}
}
