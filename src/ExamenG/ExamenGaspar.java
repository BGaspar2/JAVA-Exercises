package ExamenG;

import java.util.Scanner;

public class ExamenGaspar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*En la ciudad de Esmeraldas se está realizando un sorteo, para ello se pide ingresar la cédula de la persona (por dígitos). Para ser el acreedor al premio se deben cumplir las siguientes condiciones:

			Los dígitos dos, tres, cuatro y cinco se multiplican por 4, 8, 5 y 10, respectivamente.
			Los dígitos seis, siete, ocho y nueve se multiplican por 9, 7, 3 y 6, respectivamente.
			Se suman los resultados de las multiplicaciones anteriores.
			Se divide por 11 y se toma el residuo.
			Calculo la diferencia entre 11 y el residuo anterior. 
			La persona es la ganadora siempre y cuando el resultado anterior sea 6.
			Al finalizar debe imprimirse un mensaje por pantalla indicando si la persona es o no la ganadora.
*/

		char digitoCedula [] = new char[10];
		int mult1 = 0 , mult2 = 0 ;
		int sumaM, residuoM, diferenciaM = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("SORTEO");
		System.out.println("Ingrese su cedula:");
		for(int i = 0; i < 10; i++) {
			digitoCedula[i] = sc.next().charAt(0);
			if(digitoCedula[i] == 2 && digitoCedula[i] == 3 && digitoCedula[i] == 4 && digitoCedula[i] == 5) {
				
				mult1 = digitoCedula[2] * 4 + digitoCedula[3] * 8 +digitoCedula[4] * 5 + digitoCedula[5] * 10;
				
			}
			if(digitoCedula[i] == 6 && digitoCedula[i] == 7 && digitoCedula[i] == digitoCedula[8] && digitoCedula[i] == digitoCedula[9] ) {
				mult2 = digitoCedula[6] * 9 + digitoCedula[7] * 7 +digitoCedula[8] * 3 + digitoCedula[9] * 6;
				
			}
			sumaM = mult1 + mult2;
	
			residuoM = sumaM % 11;
			
			 diferenciaM = 11 - residuoM;
			
			
			
			
		}
		if(diferenciaM == 6 ) {
			System.out.println("Ganador");
		} else {
			System.out.println("Perdio");
		}
		
		
		
		
		
		
		
		
		

	
	}

}
