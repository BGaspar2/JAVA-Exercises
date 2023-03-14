package Ejercicios;

public class Persona {
	
		private int PDI;
		private double primerParcial;
		private double segundoParial;
		private double tercerParial;
		private double examenFinal;
		private String apellidos;
		private String nombres;
		//private int edad;
		//private double promedio;
		
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		public String getApellidos() {
			return apellidos;
		}
		public String getNombres() {
			return nombres;
		}
		/*public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}*/
		public int getPDI() {
			return PDI;
		}
		public void setPDI(int pDI) {
			PDI = pDI;
		}
		public double getPrimerParcial() {
			return primerParcial;
		}
		public void setPrimerParcial(double primerParcial) {
			this.primerParcial = primerParcial;
		}
		public double getSegundoParial() {
			return segundoParial;
		}
		public void setSegundoParial(double segundoParial) {
			this.segundoParial = segundoParial;
		}
		public double getTercerParial() {
			return tercerParial;
		}
		public void setTercerParial(double tercerParial) {
			this.tercerParial = tercerParial;
		}
		public double getExamenFinal() {
			return examenFinal;
		}
		public void setExamenFinal(double examenFinal) {
			this.examenFinal = examenFinal;
		}
		
		
		
		
}
