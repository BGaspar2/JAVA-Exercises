package Fundamentos.P6;

import java.util.Scanner;

public class FourinLine {

	// Declarar variables ejercicio 5
	public static char[][] tabla = new char[7][8];
	public static char jugador = 'R';
	public static boolean ganador = false;

public static void main(String[] args) throws InterruptedException {
	Scanner entrada = new Scanner(System.in);

	int jugar;
	do {
		ganador = false;
		jugador = 'R';
		for (int row = 0; row < tabla.length; row++) {
			for (int col = 0; col < tabla[0].length; col++) {
				tabla[row][col] = ' ';
			}
		}
		// Jugar un turno
		colocarFicha();
		inicializarJuego(tabla);
			if (ganador){
				if (jugador=='R'){
					System.out.println("Jugador Blanco gana");
				}else{
					System.out.println("Jugador Rojo gana");
				}
			}else{
				System.out.println("EMPATE!!");
			}
		System.out.println("Desea volver a jugar? 1. Si | 2. No");
		jugar = entrada.nextInt();
	}while(jugar!=2);


}
// Funciones ejercicio 5

	public static void inicializarJuego(char[][] tablero) {
		System.out.println("  ---------------");
		for (int fila = 1; fila < tablero.length; fila++){
			System.out.print(fila + " |");
			for (int columna = 1; columna < tablero[0].length; columna++){
				System.out.print(tablero[fila][columna]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("  ---------------");
		}
		System.out.println("   1 2 3 4 5 6 7");
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
			if (jugador == 'R'){
				jugador = 'B';
			}else{
				jugador = 'R';
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
