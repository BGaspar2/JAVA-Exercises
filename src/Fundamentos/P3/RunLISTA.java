package Fundamentos.P3;

import java.util.Scanner;

public class RunLISTA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MetodosLista<Persona> listaEnlazada = new MetodosLista<Persona>();

		Scanner entrada = new Scanner(System.in);
		int opSwitch = 0;
		int opSalir = 0;
		do {
		System.out.println("Eliga que quiere hacer:");
		System.out.println("1.Insertar al frente");
		System.out.println("2.Insertar al final");
		System.out.println("3.Eliminar al frente");
		System.out.println("4.Eliminar al final");
		System.out.println("5.Imprimir datos de la lista");
		System.out.print("Opcion: ");
		opSwitch = entrada.nextInt();
		System.out.println("Procesando...");
        Thread.sleep(500);
		switch(opSwitch) {
		case 1:
			ingresarPersonaalFrente(listaEnlazada);
			System.out.println("Guardando al frente de la lista...");
	           Thread.sleep(500);

			break;
		case 2:
			ingresarPersonaalFinal(listaEnlazada);
			System.out.println("Guardando al final de la lista...");
	           Thread.sleep(500);
			break;
		case 3:
			if(listaEnlazada.isEmpty()) {
				  System.out.println("No se encuentran personas al frente de la lista");
			}
			else
			{
			listaEnlazada.removeFirst();
			System.out.println("Eliminando al frente de la lista...");
	           Thread.sleep(500);
			}
			break;
		case 4:
			if(listaEnlazada.isEmpty()) {
				  System.out.println("No se encuentran personas al final de la lista");
			}
			else
			{
			listaEnlazada.removeLast();
			System.out.println("Eliminando al final de la lista...");
	           Thread.sleep(500);
			}
			break;
		case 5:
			if(listaEnlazada.isEmpty()) {
				  System.out.println("No se encuentran personas en la lista");
			}
			else
			{
				listaEnlazada.getAllPersonas();
			}
			break;
		}
		System.out.println("Desea Salir? 1.Si 2.No para volver al menu");
		opSalir = entrada.nextInt();
		System.out.println("Procesando...");
        Thread.sleep(500);
		}while(opSalir != 1);
		 System.out.println("Salida Exitosa");
	}
	public static void ingresarPersonaalFrente(MetodosLista<Persona> listaEnlazada) {
		Persona tmp = datos();
		listaEnlazada.addFirst(tmp);
	}
	public static void ingresarPersonaalFinal(MetodosLista<Persona> listaEnlazada) {
		Persona tmp = datos();
		listaEnlazada.addLast(tmp);
	}
	public static Persona datos() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Cedula: ");
		String cedula = entrada.next();
		System.out.print("Nombre: ");
		String nom = entrada.next();
		System.out.print("Apellido: ");
		String app = entrada.next();
		System.out.print("Fecha de Nacimiento(dd/MM/yyyy): ");
		String fechaNac = entrada.next();
		Persona agregarPersona = new Persona(cedula, nom, app, fechaNac);
		return agregarPersona;
	}
}
