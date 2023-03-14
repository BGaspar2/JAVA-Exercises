package examenFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class AppExamenFinal {
	
	// Declarar variables ejercicio 5
	public static char[][] tabla = new char[6][7];
	public static char jugador = '1';
	public static boolean ganador = false;

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		int respuesta, respuesta2;
		// Variables de los ejercicio
		Stack<Participante> arrayParticipantes = new Stack<Participante>(); // Ejercicio 2
		Stack<Participante> arrayParticipantes2 = new Stack<Participante>(); // Ejercicio 2
		MetodosLista<Persona> listaPersonas = new MetodosLista<Persona>(); // Ejercicio 3
		do {
			System.out.println("Bienvenido/a a nuestro sistema");
			System.out.println("*****//***** Eliga un Programa a Ejecutar: *****//****");
			System.out.println("1. Entero largo de digitos");
			System.out.println("2. Figuras");
			System.out.println("3. Ingreso de Competidores");
			System.out.println("4. Registro de Personas");
			System.out.println("5. Juego Pirata");
			System.out.println("6. Salir");
			System.out.println("*/***********/Ingrese el numero del Programa/***********/*");
			respuesta = entrada.nextInt();
			switch (respuesta) {
			case 1:
				int[] var1 = new int [30];
				int[] var2 = new int [30];
				int suma=0;
			    CircularLinkedList numeros = new CircularLinkedList();
			    CircularLinkedList numeros2 = new CircularLinkedList();
			    CircularLinkedList Suma = new CircularLinkedList();
			    Random r1 = new Random();
			    for(int i=0;i<var1.length;i++) {
			    	var1[i]=r1.nextInt(9);
					numeros.insertAtFirst(var1[i]);
					for(int x=0;x<1;x++) {
				    	var2[x]=r1.nextInt(9);
						numeros2.insertAtFirst(var2[x]);			
						suma= var1[i]+var2[x];
					    Suma.insertAtFirst(suma);
					}
				}
			    System.out.println("Numero de mas de 30 digitos cada uno dentro de un node cantidad 1");
			    numeros.display();
			    System.out.println("Numero de mas de 30 digitos cada uno dentro de un node cantidad 2");
			    numeros2.display();
			    System.out.println("Suma de numeros puestos en cada node");
			    Suma.display();
				break;
			case 2:
				System.out.println("                  /- Ejercicio 1 -/                          ");
				PrintFigure1();
				System.out.println();
				PrintX(4, "*");	
				System.out.println();
				System.out.println("             /- Ejercicio 1 Finalizado -/                          ");
				break;
			case 3:
				int n, cont = 1;
				System.out.println("                      /- EJERCICIO 2 -/                           ");
				do {
					System.out.println("Eliga una opcion:");
					System.out.println("1. Inscribir un participante");
					System.out.println("2. Mostrar listado de datos");
					System.out.println("3. Mostrar listado por marcas");
					System.out.println("4. Volver");
					System.out.println("*/**********/Ingrese lo que desea realizar/***********/*");
					n = entrada.nextInt();
					switch (n) {
					case 1:
						if (cont <= 10) {
							System.out.print("Ingrese el numero del participante: ");
							int numero = entrada.nextInt();
							System.out.print("Ingrese el nombre: ");
							String nombre = entrada.next();
							System.out.print("Ingrese el apellido: ");
							String apellido = entrada.next();
							System.out.print("Ingrese la edad: ");
							int edad = entrada.nextInt();
							System.out.print("Ingrese la marca del 2000: ");
							double marca2000 = entrada.nextDouble();
							System.out.print("Ingrese la marca del 2001: ");
							double marca2001 = entrada.nextDouble();
							System.out.print("Ingrese la marca del 2002: ");
							double marca2002 = entrada.nextDouble();
							Participante nuevoParticipante = new Participante(numero, nombre, apellido, edad, marca2000,
									marca2001, marca2002);
							arrayParticipantes.push(nuevoParticipante);
							cont++;
						} else {
							System.out.println("Numero de participantes excedido");
						}
						break;
					case 2:
						if (!arrayParticipantes.isEmpty()) {
							Iterator<Participante> it = arrayParticipantes.iterator();
							Stack<Participante> sortedStack = sortStack(arrayParticipantes);
							while (!sortedStack.isEmpty()) {
								arrayParticipantes2.push(sortedStack.pop());
							}
							while (!arrayParticipantes2.isEmpty()) {
								arrayParticipantes.push(arrayParticipantes2.pop());
							}
							System.out.println("Mostrando participantes ordenados por su numero: ");
							it = arrayParticipantes.iterator();
							while (it.hasNext()) {
								System.out.println(it.next().mostrar());
							}
						} else {
							System.out.println("Aun no hay participantes");
						}
						break;
					case 3:
						if (!arrayParticipantes.isEmpty()) {
							Iterator<Participante> it2 = arrayParticipantes.iterator();
							Stack<Participante> sortedStackTiempo = sortStackTiempo(arrayParticipantes);
							while (!sortedStackTiempo.isEmpty()) {
								arrayParticipantes2.push(sortedStackTiempo.pop());
							}
							while (!arrayParticipantes2.isEmpty()) {
								arrayParticipantes.push(arrayParticipantes2.pop());
							}
							System.out.println("Mostrando lista de participantes en orden del 2002: ");
							it2 = arrayParticipantes.iterator();
							while (it2.hasNext()) {
								System.out.println(it2.next().mostrar());
							}
						} else {
							System.out.println("Aun no hay participantes");
						}
						break;
					case 4:
						System.out.println("Saliendo del ejercicio 2...");
						break;
					default:
						System.out.print("Opcion incorrecta");
					}
				} while (n != 4);
				break;
			case 4:
				// Ejercicio 3 (RunLista)
				System.out.println("                     /- EJERCICIO 3 -/                          ");
				int decision, decision2;
				do {
					decision2=1;
					System.out.println("Agregar operacion desea realizar?");
					System.out.println("1. Insertar persona al frente de la lista");
					System.out.println("2. Insertar persona al final de la lista");
					System.out.println("3. Eliminar persona al frente de la lista");
					System.out.println("4. Eliminar persona al final de la lista");
					System.out.println("5. Imprimir la lista de personas");
					System.out.println("6. Volver");
					System.out.println("*/**********/Ingrese lo que desea realizar/***********/*");
					decision = entrada.nextInt();
					switch (decision) {
						case 1:
							listaPersonas.addFirst(ingresarPersona());
							break;
						case 2:
							listaPersonas.addLast(ingresarPersona());
							break;
						case 3:
							 listaPersonas.removeFrist();
							break;
						case 4:
							listaPersonas.removeLast();
							break;
						case 5:
							if(!listaPersonas.isEmpty()) {
								listaPersonas.getAllPersonas();
							}else {
								System.out.println("Aun no se han ingresado personas a la lista");
							}
							break;
						case 6:
							System.out.println("Saliendo del ejercicio 3...");
							decision2=2;
							break;
						default:
							System.out.println("Opcion incorrecta");
					}
					if(decision2!=2) {
						System.out.println("Volver al menu de operaciones? 1. Si | 2. No");
						decision2 = entrada.nextInt();
					}
				}while(decision2==1);
				break;
			case 5:
				// Ejercicio 5
				// Inicializar arreglo
				int jugar;
				do {
					ganador = false;
					jugador = '1';
					for (int row = 0; row < tabla.length; row++) {
						for (int col = 0; col < tabla[0].length; col++) {
							tabla[row][col] = ' ';
						}
					}
					// Jugar un turno
					colocarFicha();
					inicializarJuego(tabla);
					if (ganador) {
						if (jugador == '1') {
							System.out.println("Jugador 2 ha ganado");
						} else {
							System.out.println("Jugador 1 ha ganado");
						}
					} else {
						System.out.println("Empate");
					}
					System.out.println("Desea volver a jugar? 1. Si | 2. No");
					jugar = entrada.nextInt();
				}while(jugar!=2);
				break;
			case 6:
				System.out.println("Programa finalizado...");
				System.exit(0);
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
			System.out.println("Desea volver al menu? ");
			System.out.println(" 1. Si | 2. No , Salir");
			respuesta2 = entrada.nextInt();
		} while (respuesta2 == 1);
		entrada.close();
	}

	




	public static void PrintFigure1() {
		// Punto alto --2
		spaces(8);
		System.out.println(2);
		// cuerpo triangulo 3*3
		for (int i = 2; i <= 4; i++) {
			spaces(9 - i);
			System.out.print("/");
			spaces(2 * i - 3);
			System.out.println("\\");
		}
		// base 1--3
		spaces(4);
		System.out.print(1);
		spaces(7);
		System.out.println(3);
		// / \\
		for (int i = 2; i <= 3; i++) {
			spaces(5 - i);
			System.out.print("/ \\");
			spaces(3);
		}
		System.out.println();
		// cuerpo 0 7 9 1
		spaces(2);
		System.out.print(0);
		spaces(3);
		System.out.print(7);
		spaces(3);
		System.out.print(9);
		spaces(3);
		System.out.println(1);
		System.out.print(" /");
		for (int i = 2; i <= 3; i++) {
			spaces(3);
			System.out.print("/ \\");
			spaces(2);
		}
		System.out.println();
		// base
		System.out.print(2);
		spaces(3);
		System.out.print(1);
		spaces(3);
		System.out.print(0);
		spaces(3);
		System.out.print(8);
		spaces(3);
		System.out.println(8);
		// Punto bajo
        spaces(7);
        System.out.println("/");
        spaces(6);
        System.out.println(7);
	}
	public static void PrintX(int number, String c) {
		for (int i = 1; i <= (number * 2 + 1); i++) {
			for (int j = 0; j <= (number * 2 + 1); j++) {
				if (i == j) {
					System.out.print(c);
				} else if (i + j == (number * 2 + 2)) {
					System.out.print(c);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void spaces(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(" ");
		}
	}

	public static void caracter(int n, String c) {
		for (int i = 1; i < n; i++) {
			System.out.print(c);
		}
	}

	// Funciones ejercicio 2

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
	
	// Funciones ejercicio 3
	
	public static Persona ingresarPersona() throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese la cedula");
		String cedula = entrada.readLine();
		System.out.println("Ingrese el nombre");
		String nombre = entrada.readLine();
		System.out.println("Ingrese el apellido");
		String apellido = entrada.readLine();
		System.out.println("Ingrese la fecha de nacimiento");
		String fechaNacimiento = entrada.readLine();
		Persona persona = new Persona(cedula, nombre, apellido, fechaNacimiento);
		return persona;
	}
	
	// Funciones ejercicio 5
	
	public static void inicializarJuego(char[][] grid) {
		System.out.println(" 0 1 2 3 4 5 6");
		System.out.println("---------------");
		for (int fila = 0; fila < grid.length; fila++) {
			System.out.print("|");
			for (int col = 0; col < grid[0].length; col++) {
				System.out.print(grid[fila][col]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("---------------");
		}
		System.out.println(" 0 1 2 3 4 5 6");
		System.out.println();
	}

	public static void colocarFicha() {
		Scanner entrada = new Scanner(System.in);
		int turno = 1;
		while (ganador == false && turno <= 42) {
			boolean validPlay;
			int play;
			do {
				inicializarJuego(tabla);
				System.out.print("Jugador " + jugador + ", elige una columna: ");
				play = entrada.nextInt();
				// validar jugada
				validPlay = validar(play, tabla);
			} while (validPlay == false);
			for (int fila = tabla.length - 1; fila >= 0; fila--) {
				if (tabla[fila][play] == ' ') {
					tabla[fila][play] = jugador;
					break;
				}
			}
			// determinar ganador
			ganador = comprobarGanador(jugador, tabla);
			// cambiar de jugador
			if (jugador == '1') {
				jugador = '2';
			} else {
				jugador = '1';
			}
			turno++;
		}
	}

	public static boolean validar(int columna, char[][] tabla) {
		// validar columna
		if (columna < 0 || columna > tabla[0].length) {
			return false;
		}
		// comprobar columna llena
		if (tabla[0][columna] != ' ') {
			return false;
		}
		return true;
	}

	public static boolean comprobarGanador(char jugador, char[][] tabla) {
		// Verificar 4 cruzado
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int col = 0; col < tabla[0].length - 3; col++) {
				if (tabla[fila][col] == jugador && tabla[fila][col + 1] == jugador && tabla[fila][col + 2] == jugador
						&& tabla[fila][col + 3] == jugador) {
					return true;
				}
			}
		}
		// Verificar 4 arriba y abajo
		for (int fila = 0; fila < tabla.length - 3; fila++) {
			for (int col = 0; col < tabla[0].length; col++) {
				if (tabla[fila][col] == jugador && tabla[fila + 1][col] == jugador && tabla[fila + 2][col] == jugador
						&& tabla[fila + 3][col] == jugador) {
					return true;
				}
			}
		}
		// Verificar diagonal de arriba a abajo
		for (int fila = 3; fila < tabla.length; fila++) {
			for (int col = 0; col < tabla[0].length - 3; col++) {
				if (tabla[fila][col] == jugador && tabla[fila - 1][col + 1] == jugador && tabla[fila - 2][col + 2] == jugador
						&& tabla[fila - 3][col + 3] == jugador) {
					return true;
				}
			}
		}
		// Verificar diagonal de abajo a arriba
		for (int fila = 0; fila < tabla.length - 3; fila++) {
			for (int col = 0; col < tabla[0].length - 3; col++) {
				if (tabla[fila][col] == jugador && tabla[fila + 1][col + 1] == jugador && tabla[fila + 2][col + 2] == jugador
						&& tabla[fila + 3][col + 3] == jugador) {
					return true;
				}
			}
		}
		return false;
	}

}
