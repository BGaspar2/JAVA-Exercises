package tipos_datos;

import java.util.Scanner;

public class Obrero {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int horasTrabajadas , horasExtras;
	        double total;
	        System.out.print("Introduzca las horas trabajadas: ");
	        horasTrabajadas = sc.nextInt();

	        if(horasTrabajadas <= 40) {
	        	total = horasTrabajadas*16;
	        } else {
	        		horasExtras = horasTrabajadas-40;
	        		total = 40*16 + horasExtras*20;
	        }
	        System.out.print("Su salario semanal es de: $" + total);

	}

}
