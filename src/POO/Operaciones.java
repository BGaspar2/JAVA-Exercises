package POO;

import javax.swing.JOptionPane;

public class Operaciones {

	//atributos
	float n1;
	float n2;
	float suma;
	float resta;
	float multiplicacion;
	float division;
	//metodos
	public void IngresarNumeros() {
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1: "));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2: "));
	}

	//metodo para sumar dos numeros
	public void sumar() {
		suma = n1 + n2;
	}
	//metodo para restar dos numeros
	public void restar() {
		resta = n1 - n2;
	}
	//metodo para multiplicar dos numeros
	public void multiplicar() {
		multiplicacion = n1 * n2;
	}
	//metodo para dividir dos numeros
	public void dividir() {
		division = n1 / n2;
	}

	//metodo para mostrar resultado
	public void mostrarResultado() {
		System.out.println("Suma = " + suma);
		System.out.println("Resta = " + resta);
		System.out.println("Multiplicacion = " + multiplicacion);
		System.out.println("Division = " + division);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operaciones op = new Operaciones();
		op.IngresarNumeros();
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();
		op.mostrarResultado();
	}

}
