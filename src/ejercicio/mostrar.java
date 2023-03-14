package ejercicio;

import java.util.Scanner;

public class mostrar {

	public static void main(String[] args) {
		
Scanner entrada= new Scanner (System.in); 
Estudiante p = new Estudiante();

	int matricula;
	System.out.println("PDI= ");
	matricula= entrada.nextInt();	
	p.setMatricula(matricula);
	
	String ap,nom;
	
	System.out.println("Apellidos ");
	ap= entrada.next();	
	p.setApellido(ap);

	System.out.println("Nombres ");
	nom= entrada.next();	

p.setNombre(nom);


double pp,sp,tp,ex,promedio;

System.out.println("Primer parcial ");
pp= entrada.nextDouble();
p.setPrimerp(pp);


System.out.println("segundo parcial");
sp= entrada.nextDouble();
p.setSegundop(sp);

System.out.println("tercer parcial");
tp= entrada.nextDouble();
p.setTercerp(tp);


System.out.println("examen final");
ex= entrada.nextDouble();
p.setExa(ex);

promedio =(p.getPrimerp()+p.getSegundop()+p.getTercerp()+p.getExa())/4;
System.out.println("Promedio= " + promedio);










	}
}

