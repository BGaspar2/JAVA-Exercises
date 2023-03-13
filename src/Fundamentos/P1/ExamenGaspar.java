package Fundamentos.P1;

public class ExamenGaspar {

	public static void main(String[] args) throws InterruptedException {
		 System.out.println("Generando Figuras...");
         Thread.sleep(500);
		PrintFigure1();
		System.out.println();
         Thread.sleep(500);
		PrintX(4,"*");
		System.out.println();
         Thread.sleep(500);
		PrintFigure2();
		System.out.println();
         Thread.sleep(500);
		PrintVacaV1();
		Thread.sleep(500);
		PrintVacaV2();
		Thread.sleep(500);
		PrintVacaV3();

	}
	public static void PrintVacaV3() {
		spaces(9);
		System.out.println("(__)");
		spaces(9);
		System.out.println("(oo)");
		System.out.print(" /");
		caracter(9,"-");
		System.out.println("\\/");
		// cuerpo
		System.out.print("* ");
		caracter(2,"o|");
		spaces(5);
		System.out.println("||");
		spaces(2);
		caracter(2," ||");
		caracter(5,"-");
		caracter(2,"||");
		System.out.println();
		// base
		caracter(4,"o");
		System.out.print("^^");
		spaces(4);
		System.out.println("^^");
	}
	public static void PrintVacaV2() {
		spaces(9);
		System.out.println("(__)");
		spaces(9);
		System.out.println("(oo)");
		System.out.print("  /");
		caracter(8,"-");
		System.out.println("\\/");
		// cuerpo
		System.out.print(" / ");
		caracter(2,"|");
		spaces(5);
		System.out.println("||");
		System.out.print("* ");
		caracter(2," ||");
		caracter(5,"-");
		caracter(2,"||");
		System.out.println();
		// base
		spaces(3);
		System.out.print("^^");
		spaces(4);
		System.out.println("^^");
	}
	public static void PrintVacaV1() {
			spaces(10);
			System.out.println("(__)");
			spaces(10);
			System.out.println("(uu)");
			spaces(3);
			System.out.print("/");
			caracter(8,"-");
			System.out.println("\\/");
		// cuerpo
			System.out.print(" / ");
			caracter(2,"|");
			spaces(5);
			System.out.println("||");
			System.out.print("* ");
			caracter(2," ||");
			caracter(5,"-");
			caracter(2,"||");
			System.out.println();
		// base
			spaces(3);
			System.out.print("~~");
			spaces(4);
			System.out.println("~~");
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
	public static void PrintFigure2() {
				spaces(17);
				System.out.print("/");
				caracter(6,"-");
				System.out.println(" " + 20);
				spaces(17);
				System.out.print("|");
				spaces(7);
				System.out.print("\\");
				caracter(6,"-");
				System.out.println(" " + 15);
				spaces(9);
				System.out.print("/");
				caracter(6,"-");
				System.out.println(" " + 14);
				spaces(9);
				System.out.print("|");
				spaces(7);
				System.out.print("\\");
				caracter(6,"-");
				System.out.println(" " + 13);
				// cabeza
				System.out.print(" /");
				caracter(6,"-");
				System.out.println(" " + 12);
				// parte de arriba
				System.out.print(" |");
				spaces(7);
				System.out.print("|");
				spaces(7);
				System.out.print("/");
				caracter(6,"-");
				System.out.println(" " + 11);
				System.out.print(" |");
				spaces(7);
				System.out.print("\\");
				caracter(6,"-");
				System.out.println(" " + 10);
				System.out.print(" |");
				spaces(15);
				System.out.print("\\");
				caracter(6,"-");
				System.out.println(" " + 9);
				//punto medio
				System.out.println(8 + " ");
				//parte abajo
				System.out.print(" |");
				spaces(15);
				System.out.print("/");
				caracter(6,"-");
				System.out.println(" " + 7);
				System.out.print(" |");
				spaces(7);
				System.out.print("/");
				caracter(6,"-");
				System.out.println(" " + 6);
				System.out.print(" |");
				spaces(7);
				System.out.print("|");
				spaces(7);
				System.out.print("\\");
				caracter(6,"-");
				System.out.println(" " + 5);
				// pie
				System.out.print(" \\");
				caracter(6,"-");
				System.out.println(" " + 4);
				spaces(9);
				System.out.print("|");
				spaces(6);
				System.out.print(" /");
				caracter(6,"-");
				System.out.println(" " + 3);
				spaces(9);
				System.out.print("\\");
				caracter(6,"-");
				System.out.println(" " + 2);
				spaces(17);
				System.out.print("\\");
				caracter(6,"-");;
				System.out.println(" " + 1);
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
}