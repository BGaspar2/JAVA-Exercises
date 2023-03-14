package poo;

public class AppHerencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//crear dos objetos y en cada uno agregar un array de objetos
			// ultimo vamos a mostrar la informacion
		
		//objeto 1
		Persona a = new Persona("0850569120", "Bryan","02/04/2002");
		//objeto 2
		Alumno c = new Alumno("0850594573","Pablo","05/11/2005", "2B");
		//objeto 3
		Alumno j = new Alumno("0835453620","Jaime", "10/08/1974","3A" );
		
		//array de objetos de tipo persona
		//crear un array de tipo de clase a generar
		Persona [] arrayPersona = new Persona[3];
		arrayPersona[0] = a;
		arrayPersona[1] = c;
		arrayPersona[2] = j;
		
		//pilas , colas , listas
		//colecciones, hashmap, obj nativos, arraylist
		//arboles y grafos
		
		lectorArrayPersona(arrayPersona);
		
	}
	
	public static void lectorArrayPersona(Persona [] array) {
		for(int i= 0; i<array.length;i++)
			System.out.println("identificando: " + array[i].identificacion());
		
	}
	
	

}
