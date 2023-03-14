package Tarea;

public class Restricciones {
	String N1,N2,N3;

	public Restricciones(String N1, String N2, String N3) {
		this.N1 = N1;
		this.N2 = N2;
		this.N3 = N3;
	}


	public boolean validarNotas(String notas) {
		return notas.matches("[0-9]+.[0-9]+");
	}
	
	
	
}
