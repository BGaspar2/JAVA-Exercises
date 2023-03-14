package Tarea4;

import java.util.Scanner;

public class Estructura_Repetitiva {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares.

			El usuario debe ingresar una contraseña. (Nota: la contraseña general para este ejercicio es "1234").

			Si la contraseña es correcta aparecerá en la pantalla sus dos nombres y dos apellidos, caso contrario saldrá contraseña incorrecta y terminará la ejecución del programa.

			Si la contraseña es correcta, se debe visualizar el siguiente menú de opciones:

			1. Ingresar dinero a la cuenta.
			2. Retirar dinero de la cuenta.
			3. Consultas.
			4. Salir.

			Mostrar un mensaje de error si el monto no es suficiente. Rechazar valores negativos.

			El programa termina cuando el usuario digita la opción 4.  Al finalizar imprimir un mensaje "GRACIAS POR USAR NUESTROS SERVICIOS, VUELVA PRONTO".

			Al culminar la actividad, debe cargarla en la plataforma.
		 *
		 */
		Scanner sc = new Scanner(System.in);
		double saldoInicial = 1000;
		final String passwordGeneral = "1234";
		String contrasena;
		String nombre;
		int op = 0;
		System.out.println("Ingrese su nombre completo:");
		nombre = sc.nextLine();
		System.out.println("Ingrese la contraseña: ");
		contrasena = sc.next();
		System.out.println("PROCESANDO...");
		  Thread.sleep(500);
		if(contrasena.equals(passwordGeneral)) {
			System.out.println("BIENVENIDO AL CAJERO " + nombre.toUpperCase());
			do {
			System.out.println("Menú: ");
			System.out.println("1. Ingresar dinero a la cuenta.");
			System.out.println("2. Retirar dinero de la cuenta.");
			System.out.println("3. Consultas.");
			System.out.println("4. Salir.");
			System.out.println("Digite una opción:");
			op = sc.nextInt();
			switch(op) {
			case 1:
				double montoIngresar = 0;
				System.out.println("Ingrese el monto:");
				montoIngresar = sc.nextDouble();
				if(montoIngresar > 0 && montoIngresar <= 10000) {
				saldoInicial += montoIngresar;
				System.out.println("PROCESANDO...");
				  Thread.sleep(500);
				System.out.println("El deposito de: $"+ montoIngresar +" se realizo correctamente" );
				} else {
					System.out.println("El valor ingresado es erroneo o supera el maximo valor que se puede depositar");
				}
				break;
			case 2:
				double montoRetirar = 0;
				System.out.println("Ingrese el monto a retirar:");
				montoRetirar = sc.nextDouble();
				if(montoRetirar > 0 && montoRetirar <= saldoInicial ) {
				saldoInicial -= montoRetirar;
				System.out.println("PROCESANDO...");
				  Thread.sleep(500);
				System.out.println("El retiro de: $"+ montoRetirar +" se realizo correctamente");
				} else {
					System.out.println("El valor ingresado es erroneo o supera al monto actual");
				}
				break;
			case 3:
				System.out.println("PROCESANDO...");
				  Thread.sleep(500);
				System.out.println("USTED ACTUALMENTE POSEE LA CANTIDAD DE: $" + saldoInicial);
				break;
			case 4:
				System.out.println("GRACIAS POR USAR NUESTROS SERVICIOS, VUELVA PRONTO");
				break;
			default:
				System.out.println("Opcion erronea");
				break;
			}
			}while(op != 4);
					}else {
			System.out.print("CONTRASEÑA INCORRECTA EL PROGRAMA HA TERMINADO");
		}
	}//fin

}
