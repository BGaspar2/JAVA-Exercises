package lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class lambdaApp {
	public  void ordenarLista() {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Redes");
		lista.add("Sistemas Operativos");
		lista.add("Programacion Orientada a Objetos");
		lista.add("Base de Datos");
		lista.add("Internet de las Cosas");
		
		/*sin lambda
		 * Collections.sort(lista, new Comparator<String>() {
			//ordenacion
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
			
		});*/
		//con lambda
		Collections.sort(lista, (String o1, String o2) -> o1.compareTo(o2));
		for(String elemento:lista) {
			System.out.println(elemento);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambdaApp app = new lambdaApp();
		app.ordenarLista();
	}

}
