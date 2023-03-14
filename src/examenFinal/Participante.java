package examenFinal;

public class Participante {
	int numero, edad ;
	String nombre,apellido;
	double marca2000,marca2001, marca2002;
	
	//constructor vacio
	public Participante() {
		
	}
	public Participante(int numero,String nombre, String apellido, int edad, double marca2000, double marca2001, double marca2002) {
		this.numero=numero;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.marca2000=marca2000;
		this.marca2001=marca2001;
		this.marca2002=marca2002;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
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
	public double getMarca2000() {
		return marca2000;
	}
	public void setMarca2000(double marca2000) {
		this.marca2000 = marca2000;
	}
	public double getMarca2001() {
		return marca2001;
	}
	public void setMarca2001(double marca2001) {
		this.marca2001 = marca2001;
	}
	public double getMarca2002() {
		return marca2002;
	}
	public void setMarca2002(double marca2002) {
		this.marca2002 = marca2002;
	}
	@Override
	public String toString() {
		return "Participante [numero=" + numero + ", edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", marca2000=" + marca2000 + ", marca2001=" + marca2001 + ", marca2002=" + marca2002 + "]";
	}
	
	public String mostrar() {
		System.out.print(numero);
		System.out.print(" ");
		return nombre+" "+apellido;
		
	}

}
