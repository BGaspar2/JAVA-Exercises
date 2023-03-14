package EjemploHerencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Poligno> poligno = new ArrayList <Poligno>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		llenarPoligonos();
		//mostrarResultados();
		guardar();
		leer();
	}
	
	
	public static void guardar() {
		try {
			FileWriter fw = new FileWriter("poligono1.txt", true);//crea el archivo
			BufferedWriter bw = new BufferedWriter(fw); //preparar el archivo para guardar los datos
			for(Poligno poli: poligno) {
				bw.write(poli.toString()); //guarda lo que se imprime en el metodo toString
				bw.newLine(); //salto de linea
				bw.write("Area = " + poli.area()); //guardar el area
				bw.newLine(); //salto de linea
			}
			bw.flush(); //guardar lo que se a ingresado (cambios)
			
		
		}
		catch(Exception e) {
			System.out.println("Existe un error: " + e);
		}
	}
	
	public static void leer() {
		try {
			FileReader fr = new FileReader("poligono1.tpv"); // leer el archivo
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine(); //asigna la variable linea lo que este en cada una de las lineas del archivo
			while(linea != null) { //mientras la linea no este vacia
				System.out.println(linea);
				linea = br.readLine(); //leer la nueva linea
			}
		}
		catch(Exception e){
			System.out.println("Existe un error: " + e);
		}
	}
	public static void llenarPoligonos() {
		int op;
		do {
			System.out.println("Poligonos: ");
			System.out.println("1. Triangulo");
			System.out.println("2. Rectangulo");
			System.out.println("3. Salir");
			System.out.print("Opcion: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				//Triangulo
				
				llenarTriangulos();
				
				
				break;
			case 2:
				//Rectangulo
				llenarRectangulos();
				
				
				break;
			}
			
			
		}while(op == 1 || op == 2);
	}

	
	
	public static void llenarTriangulos() {
		double l1, l2 , l3;
		System.out.println("Lado 1: ");
		l1 = sc.nextDouble();
		System.out.println("Lado 2: ");
		l2 = sc.nextDouble();
		System.out.println("Lado 3: ");
		l3 = sc.nextDouble();
		Triangulo triangulo = new Triangulo(l1,l2,l3);
		poligno.add(triangulo);
	}
	
	public static void llenarRectangulos() {
		double l1, l2 ;
		System.out.println("Lado 1: ");
		l1 = sc.nextDouble();
		System.out.println("Lado 2: ");
		l2 = sc.nextDouble();
		Rectangulo rectangulo = new Rectangulo(l1,l2);
		poligno.add(rectangulo);
	}
	public static void mostrarResultados() {
		for (Poligno poli: poligno) {
			System.out.println(poli.toString());
			System.out.println("Area: " + Math.round(poli.area()*100.0)/100.0);
		}
	}
	
}
