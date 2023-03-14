package POO;

import javax.swing.JOptionPane;

public class Operacion {
	//atributos
	//metodos

	//metodo para sumar dos numeros
	public float sumar(float n1, float n2) {
		float suma = n1 + n2;
		return suma;
	}
	//metodo para restar dos numeros
	public float restar(float n1, float n2) {
		float resta = n1 - n2;
		return resta;
	}
	//metodo para multiplicar dos numeros
	public float multiplicar(float n1, float n2) {
		float multiplicacion = n1 * n2;
		return multiplicacion;
	}
	//metodo para dividir dos numeros
	public float dividir(float n1, float n2) {
		float division = n1 / n2;
		return division;
	}

	//metodo para mostrar resultado
	public void mostrarResultado(float suma, float resta, float multiplicacion, float division) {
		System.out.println("Suma = " + suma);
		System.out.println("Resta = " + resta);
		System.out.println("Multiplicacion = " + multiplicacion);
		System.out.println("Division = " + division);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacion op = new Operacion();
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Numero 1: "));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2: "));
		System.out.println("Suma = " + op.sumar(n1, n2));
		float s = op.sumar(n1,n2);
		float r = op.restar(n1,n2);
		float m = op.multiplicar(n1,n2);
		float d = op.dividir(n1,n2);
	//	op.mostrarResultado(s,r,m,d);
	}

}
