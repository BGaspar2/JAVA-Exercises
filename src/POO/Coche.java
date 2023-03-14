package POO;

public class Coche {
	// Atributo
			String color;
			String marca;
			String modelo;
			int Kilometraje;



			//Metodos
	public static void main(String[] args) {
		//crear objeto 1
		Coche coche1 = new Coche(); //Objeto de la clase coche.
		coche1.color = "Azul";
		coche1.marca = "Aveo";
		coche1.modelo = "Family";
		coche1.Kilometraje = 50000;
		Coche coche2 = new Coche(); //Objeto 2 de la clase coche.
		coche2.color = "Blanco";
		coche2.marca = "Chevrolet";
		coche2.modelo = "Sail";
		coche2.Kilometraje = 25000;
		System.out.println("El color del coche 2 es: " + coche2.color);

	}

}
