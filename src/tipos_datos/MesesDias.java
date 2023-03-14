package tipos_datos;

import java.util.Scanner;

public class MesesDias {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int mes;
	        System.out.print("Introduzca un mes en numero: ");
	        mes = sc.nextInt();

	        switch(mes){
	        case 1:
	            System.out.print("El mes es Enero y tiene 31 días");
	        	break;
	        case 2:
	        	  System.out.print("El mes es Febrero y tiene 28 días");
	        	break;
	        case 3:
	        	  System.out.print("El mes es Marzo y tiene 31 días");
	        	break;
	        case 4:
	        	  System.out.print("El mes es Abril y tiene 30 días");
	        	break;
	        case 5:
	        	  System.out.print("El mes es Mayo y tiene 31 días");
	        	break;
	        case 6:
	        	  System.out.print("El mes es Junio y tiene 30 días");
	        	break;
	        case 7:
	        	  System.out.print("El mes es Julio y tiene 31 días");
	        	break;
	        case 8:
	        	  System.out.print("El mes es Agosto y tiene 31 días");
	        	break;
	        case 9:
	        	  System.out.print("El mes es Septiembre y tiene 30 días");
	        	break;
	        case 10:
	        	  System.out.print("El mes es Octubre y tiene 31 días");
	        	break;
	        case 11:
	        	  System.out.print("El mes es Noviembre y tiene 30 días");
	        	break;
	        case 12:
	        	  System.out.print("El mes es Diciembre y tiene 31 días");
	        	break;
	        default:
	        	System.out.print("El mes ingresado es incorrecto");
	        	break;

	        }

	}

}
