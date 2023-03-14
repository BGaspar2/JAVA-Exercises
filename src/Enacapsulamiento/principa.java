package Enacapsulamiento;

public class principa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p= new Persona();
		p.SetApellido("Marin Reyes");
		p.SetNombre("Anahis Nayely");
		p.SetEdad(19);
		
		
		System.out.println("Apelidos : "+ p.GetApellido());
		;
		System.out.println("Nombres : "+ p.GetNombre());
		;
		System.out.println("Edad : "+ p.GetEdad());
		;
		
	}

}
