package tipos_datos;

import java.util.Scanner;

public class ProgramaParImpar {

	public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.print("Introduzca número: ");
        n1 = sc.nextInt();
        System.out.println(n1 % 2 == 0 ?  "Es Par" : "Impar");

	}

}
