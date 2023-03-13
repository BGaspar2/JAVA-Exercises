package Fundamentos.P2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExamenGaspar2 {
	public static int num, edad ;
	public static String nom, ap;
	public static double m2001, m2002, m2000;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		menus();
	}
	public static void menus() throws InterruptedException {
		int op2 = 0;
		int opSwitch = 0;
		int cont = 1;
		Stack<Participante> arrayParticipantes = new Stack<Participante>(); // Ejercicio 2
		Stack<Participante> arrayParticipantes2 = new Stack<Participante>(); // Ejercicio 2
		Scanner reader = new Scanner(System.in);
		do {
		System.out.println("-----MENU PRINCIPAL-----");
		System.out.println("1.Inscribir un participante");
		System.out.println("2.Mostrar listado de datos(Por numero)");
		System.out.println("3.Mostrar listado por marcas(2002)");
		System.out.println("4.Finalizar el programa");
		System.out.print("Opcion: ");
		opSwitch = reader.nextInt();
		   System.out.println("Procesando...");
           Thread.sleep(500);
		switch(opSwitch) {
		case 1:
			if (cont <= 10) {
				ingresarParticipante(arrayParticipantes);
				System.out.println("Guardando...");
		           Thread.sleep(500);
			cont++;
			} else {
				System.out.println("N�mero de participantes excedido");
			}
			break;
		case 2:
			mostrarporNumero(arrayParticipantes,arrayParticipantes2);
			break;
		case 3:
			mostrarporMarca(arrayParticipantes,arrayParticipantes2);
			break;
		case 4:

            Thread.sleep(500);
			break;
		}
		System.out.println("Desea salir del programa? digite 1. Si   2. (NO) para volver al menu");
		System.out.println("1. Si");
		System.out.println("2. No");
		op2 = reader.nextInt();
		}while (op2 == 2);
		reader.close();
		System.out.println("Salida Exitosa");

	}
	public static void mostrarporNumero(Stack<Participante> arrayParticipantes,Stack<Participante> arrayParticipantes2) {
		if(!arrayParticipantes.isEmpty()) {
			Iterator<Participante> it = arrayParticipantes.iterator();
			Stack<Participante> sortedStack = sortStack(arrayParticipantes);
			while(!sortedStack.isEmpty()) {
				arrayParticipantes2.push(sortedStack.pop());
			}
			while(!arrayParticipantes2.isEmpty()) {
				arrayParticipantes.push(arrayParticipantes2.pop());
			}
			System.out.println("Mostrando participantes ordenados por su numero: ");
			it = arrayParticipantes.iterator();
			  while(it.hasNext()) {
			       System.out.println(it.next().mostrar());
			  }
		}else {
			System.out.println("A�n no hay participantes");
		}
	}
	public static void mostrarporMarca(Stack<Participante> arrayParticipantes,Stack<Participante> arrayParticipantes2) {
		if(!arrayParticipantes.isEmpty()) {
			Iterator<Participante> it2 = arrayParticipantes.iterator();
			Stack<Participante> sortedStackTiempo = sortStackTiempo(arrayParticipantes);
			while(!sortedStackTiempo.isEmpty()) {
				arrayParticipantes2.push(sortedStackTiempo.pop());
			}
			while(!arrayParticipantes2.isEmpty()) {
				arrayParticipantes.push(arrayParticipantes2.pop());
			}
			System.out.println("Mostrando participantes ordenados por su marca del 2002: ");
			it2 = arrayParticipantes.iterator();
			  while(it2.hasNext()) {
			       System.out.println(it2.next().mostrar());
			  }
		}else {
			System.out.println("A�n no hay participantes");
		}
	}
		public static void ingresarParticipante (Stack<Participante> arrayParticipantes) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Inserte el participante");
			System.out.print("Numero: ");
			num = reader.nextInt();
			System.out.print("Nombre: ");
			nom = reader.next();
			System.out.print("Apellido: ");
			ap = reader.next();
			System.out.print("Edad: ");
			edad = reader.nextInt();
			System.out.print("Marca 2000: ");
			m2000 = reader.nextDouble();
			System.out.print("Marca 2001: ");
			m2001 = reader.nextDouble();
			System.out.print("Marca 2002: ");
			m2002 = reader.nextDouble();
			Participante nuevoParticipante  = new Participante(num,nom,ap,edad,m2000,m2001,m2002);
			arrayParticipantes.push(nuevoParticipante);
		}
		public static Stack<Participante> sortStack(Stack<Participante> stack) {
		    Stack<Participante> newStack = new Stack<Participante>();
		  // iterate over till filled stack is not empty
		  while (!stack.isEmpty()) {
		   Participante tmp = stack.pop();
		   // iterate and check if newStack.peek value > tmp,
		   // re-push in original stack from popping new stack
		   while (!newStack.isEmpty() && newStack.peek().getNumero() > tmp.getNumero()) {
		    stack.push(newStack.pop());
		  }
		   newStack.push(tmp);
		  }
		  return newStack;
		  }
		public static Stack<Participante> sortStackTiempo(Stack<Participante> stack) {
		    Stack<Participante> newStack = new Stack<Participante>();
		  // iterate over till filled stack is not empty
		  while (!stack.isEmpty()) {
		   Participante tmp = stack.pop();
		   // iterate and check if newStack.peek value > tmp,
		   // re-push in original stack from popping new stack
		   while (!newStack.isEmpty() && newStack.peek().getMarca2002() < tmp.getMarca2002()) {
		    stack.push(newStack.pop());
		   }
		   newStack.push(tmp);
		  }
		  return newStack;
		  }
}