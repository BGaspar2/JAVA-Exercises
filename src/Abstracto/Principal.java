package Abstracto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planta obj = new Planta();
		obj.alimentarse();
		AnimalCarnivoro ac = new  AnimalCarnivoro();
		ac.alimentarse();
		AnimalHerbivoro ah = new AnimalHerbivoro();
		ah.alimentarse();
	}

}
