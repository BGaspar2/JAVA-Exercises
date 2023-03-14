package parcial3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class AppRecargas {
		public static int recClaro = 0;
		public static int recCnt = 0;
		public static int recMov = 0;
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		LinkedList<CLARO> recargaClaro = new LinkedList<CLARO>();
		LinkedList<CNT> recargaCnt = new LinkedList<CNT>();
		LinkedList<MOVISTAR> recargaMovistar = new LinkedList<MOVISTAR>();
		int op;
	do {
	System.out.print("Seleccione una compañia: \n0.Claro \n1.CNT \n2.MOVISTAR \n3.terminar programa:\n");
	op = entrada.nextInt();
	switch(op) {
	case 0:
		System.out.println("Selecciono CLARO");
		ingresarDatosClaro(recargaClaro);
		break;
	case 1:
		System.out.println("Selecciono CNT");
		ingresarDatosCNT(recargaCnt);
		break;
	case 2:
		System.out.println("Selecciono MOVISTAR");
		ingresarDatosMov(recargaMovistar);
		break;
	}
	}while(op != 3);

	 if(recargaClaro.isEmpty()){
         System.out.println("No hay recargas registradas");
         return;
     }
      System.out.println("Cantidad total abonada a CLARO:");
      verRecargasClaro(recargaClaro);
      System.out.println("Cantidad total abonada a CNT:");
      verRecargasCnt(recargaCnt);
      System.out.println("Cantidad total abonada a MOVISTAR:");
      verRecargasMov(recargaMovistar);
		System.out.print("\nClaro | ");
		asteriscos(recClaro);
		System.out.println();
		System.out.print("CNT | ");
		asteriscos(recCnt);
		System.out.println();
		System.out.print("MOVISTAR | ");
		asteriscos(recMov);
	}
	public static void asteriscos(int cont) {
		for(int i = 0; i < cont; i++) {
			System.out.print("*");
		}
	}
	public static void verRecargasMov(LinkedList<MOVISTAR> recargaMov) {
		Iterator<MOVISTAR> it = recargaMov.iterator();
	      while(it.hasNext())
	      {
	        System.out.println(it.next().mostrar());
	      }
	}
	public static void verRecargasCnt(LinkedList<CNT> recargaCnt) {
		Iterator<CNT> it = recargaCnt.iterator();
	      while(it.hasNext())
	      {
	        System.out.println(it.next().mostrar());
	      }
	}
	public static void verRecargasClaro(LinkedList<CLARO> recargaClaro) {
		Iterator<CLARO> it = recargaClaro.iterator();
		 while(it.hasNext())
	      {
	        System.out.println(it.next().mostrar());
	      }
	}
	public static void ingresarDatosClaro(LinkedList<CLARO> recargaClaro) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		CLARO guardarNum;
		String numCelular;
		String numCelularConfirmacion;
		System.out.print("Digite la cantidad a ser abonada en dolares: ");
		double valorAbonado = entrada.nextInt();
		do {
		System.out.print("Digite el numero de celular: ");
		 numCelular = entrada.next();

		System.out.print("Digite el numero de celular nuevamente: ");
		 numCelularConfirmacion = entrada.next();
		if(!numCelular.equals(numCelularConfirmacion)) {
			System.out.println("Los numeros no coinciden, intente de nuevo");
		}else {
			System.out.println("Numero Correcto");
			recClaro++;
			guardarNum = new CLARO(numCelular,valorAbonado);
			recargaClaro.push(guardarNum);
			 System.out.println("Procesando...");
	            Thread.sleep(500);
			System.out.println("Usted Abono "+ valorAbonado + " Al numero " + numCelular) ;
		}
		}while(!numCelular.equals(numCelularConfirmacion));
	}
	public static void ingresarDatosMov(LinkedList<MOVISTAR> recargaMov) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		MOVISTAR guardarNum;
		String numCelular;
		String numCelularConfirmacion;
		System.out.print("Digite la cantidad a ser abonada en dolares: ");
		double valorAbonado = entrada.nextInt();
		do {
		System.out.print("Digite el numero de celular: ");
		 numCelular = entrada.next();

		System.out.print("Digite el numero de celular nuevamente: ");
		 numCelularConfirmacion = entrada.next();
		if(!numCelular.equals(numCelularConfirmacion)) {
			System.out.println("Los numeros no coinciden, intente de nuevo");
		}else {
			System.out.println("Numero Correcto");
			recMov++;
			guardarNum = new MOVISTAR(numCelular,valorAbonado);
			recargaMov.push(guardarNum);
			 System.out.println("Procesando...");
	            Thread.sleep(500);
			System.out.println("Usted Abono "+ valorAbonado + " Al numero " + numCelular) ;
		}
		}while(!numCelular.equals(numCelularConfirmacion));
	}
	public static void ingresarDatosCNT(LinkedList<CNT> recargaCnt) throws InterruptedException {

		Scanner entrada = new Scanner(System.in);
		CNT guardarNum;
		String numCelular;
		String numCelularConfirmacion;
		System.out.print("Digite la cantidad a ser abonada en dolares: ");
		double valorAbonado = entrada.nextInt();
		do {
		System.out.print("Digite el numero de celular: ");
		 numCelular = entrada.next();
		System.out.print("Digite el numero de celular nuevamente: ");
		 numCelularConfirmacion = entrada.next();
		if(!numCelular.equals(numCelularConfirmacion)) {
			System.out.println("Los numeros no coinciden, intente de nuevo");
		}else {
			System.out.println("Numero Correcto");
			recCnt++;
			guardarNum = new CNT(numCelular,valorAbonado);
			recargaCnt.push(guardarNum);
			 System.out.println("Procesando...");
	            Thread.sleep(500);
			System.out.println("Usted Abono "+ valorAbonado + " Al numero " + numCelular) ;
		}
		}while(!numCelular.equals(numCelularConfirmacion));
	}

}