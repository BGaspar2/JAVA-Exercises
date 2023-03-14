package tipos_datos;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		double precioProducto;

		System.out.print("Ingrese el precio del producto: ");
		precioProducto = entrada.nextDouble();
		double IVA = precioProducto * 0.12;
		double total = IVA +precioProducto;
		System.out.println("El IVA es: $" + IVA );
		System.out.println("El total a pagar es: $" + total);
	}

}
