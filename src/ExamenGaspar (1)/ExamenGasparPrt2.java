package pucese.edu.unidad1;
import java.util.Scanner;
public class ExamenGasparPrt2 {

	public static void main(String[] args) {
		int opcion;
		int edad, acum = 0; 
		int cont = 0, mayoresDeEdad = 0;
		float estatura , acum2 = 0;
		int mayoresDeEstatura = 0, cont2 = 0;
		Scanner entrada = new Scanner(System.in);
		
		 //ejercicio 3
		   do {
			   System.out.print("Ingrese la edad del alumno: ");
				edad = entrada.nextInt();
				if(edad>0) {
					acum += edad;
					cont++;
					if(edad > 18) {
						mayoresDeEdad++;
					}
					System.out.print("Ingrese la estatura del alumno: ");
					estatura = entrada.nextFloat();
					acum2 += estatura;
					cont2++;
					if(estatura > 1.75) {
						mayoresDeEstatura++;
					}
					}else {
						System.out.println("Se ha detenido el Programa");
					}
			}while(edad>0);
		   	System.out.println("Menu:");
		   	System.out.println("1. Edad Media y Estatura Media");
		   	System.out.println("2. Cantidad de alumnos mayores a 18 años");
		   	System.out.println("3. Cantidad de alumnos que miden mas de 1,75cm");
		 	System.out.print("Opcion: ");
			opcion = entrada.nextInt();
			switch(opcion) {
			case 1:
			  	System.out.println("El promedio de edades de los alumnos es igual a: " + acum/cont);
				System.out.println("El promedio de estaturas de los alumnos es igual a: " + acum2/cont2);
				break;
			case 2:
			  	System.out.print("Eligio Cantidad de alumnos mayores a 18 años es igual a: " + mayoresDeEdad);
				break;
			case 3:
				System.out.print("Eligio Cantidad de alumnos que miden mas de 1,75cm es igual a: " + mayoresDeEstatura);
				break;
			}
			entrada.close();

	}

}
