package poo2;

import java.util.Scanner;

public class Alumno {
	String nombre;
	String apellido;
	String edad;
	String mejor_marca2002;
	String mejor_marca2001;
	String mejor_marca2000;
	String num;
	
	//entrada de datos
	Scanner in=new Scanner(System.in);
	
	void cargar() {
		System.out.println("Ingrese el numero");
		num=in.nextLine();
		System.out.println("Ingrese el nombre");
		nombre=in.nextLine();
		System.out.println("Ingrese el apellido");
		apellido=in.nextLine();
		System.out.println("Ingrese el edad");
		edad=in.nextLine();
		System.out.println("Ingrese el mejor_marca2002");
		mejor_marca2002=in.nextLine();
		System.out.println("Ingrese el mejor_marca2001");
		mejor_marca2001=in.nextLine();
		System.out.println("Ingrese el mejor_marca2000");
		mejor_marca2000=in.nextLine();

	}
	void mostrar() {
		System.out.println("Nombre del corredor:" +nombre+ "\n" + "Apellido:" + apellido
	+ "\n" + "edad:" +edad + "\n" + "Mejor marca 2000:" +mejor_marca2000 + "\n" + "Mejor marca 2001:" +mejor_marca2001
	+ "\n" + "Mejor marca 2002:" +mejor_marca2002 + "\n" 	);
	}
	void mostrar_marca() {
		System.out.println("Nombre del corredor:" +nombre+ "Marca 2002" +mejor_marca2002);
	}
	void vaciar() {
		num="";
		apellido="";
		edad="";
		mejor_marca2001="";
		mejor_marca2000="";
		mejor_marca2002="";
		nombre="";
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getMejor_marca2002() {
		return mejor_marca2002;
	}
	public void setMejor_marca2002(String mejor_marca2002) {
		this.mejor_marca2002 = mejor_marca2002;
	}
	public String getMejor_marca2001() {
		return mejor_marca2001;
	}
	public void setMejor_marca2001(String mejor_marca2001) {
		this.mejor_marca2001 = mejor_marca2001;
	}
	public String getMejor_marca2000() {
		return mejor_marca2000;
	}
	public void setMejor_marca2000(String mejor_marca2000) {
		this.mejor_marca2000 = mejor_marca2000;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}


	
}
