package ExamenG;

import java.util.Scanner;

public class Acierto {
	/*Realizar un programa en JAVA para adivinar un número entre 1 y 100 que
	previamente se ha definido como una constante. El programa irá pidiendo
	números al usuario y siempre que dicho número no coincida con el número secreto,
	le indicará si el número introducido es mayor o menor que el número secreto que 
	tiene que adivinar. Al final, el programa indicará la cantidad de intentos que se 
	han necesitado para adivinar el número. Si el número de intentos es menor que 5 se 
	mostrará "Excelente". Si es un valor entre 5 y 10 se mostrará el mensaje "Muy bien". 
	Si el número de intentos es mayor que 10 se mostrará el mensaje "Debe practicar más".*/
	public static void main(String[] args) {
		final int n=50;
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int numIngresado = 0;
		do {
			System.out.println("Ingrese un numero: ");
			numIngresado = sc.nextInt();
			if(numIngresado >= 1 && numIngresado <= 100) {
			if(numIngresado > n) {
				System.out.println("El numero ingresado es mayor ");
				
			} else if(numIngresado < n){
				System.out.println("El numero ingresado es menor ");
			}
			
			cont++;
			
		}else {
			System.out.println("!ERROR¡ El numero ingresado tiene que estar entre 1 y 100");
		}
		}
		while(numIngresado != n);
		if(cont < 5) {
			System.out.println("Excelente, total de intentos: " + cont);
		} else if(cont >= 5 && cont <= 10) {
			System.out.println("Muy bien, total de intentos: " + cont);
		} else if(cont > 10) {
			System.out.println("Debera Practicar mas, total de intentos: " + cont);
		}
		
		
		}
	
			
			
			
		}


