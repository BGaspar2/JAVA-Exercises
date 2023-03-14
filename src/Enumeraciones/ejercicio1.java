package Enumeraciones;

public class ejercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EJERCICIO1
		Color c1 = Color.ROJO;
		//System.out.println("El color elegido es:" + c1);
		//EJERCICIO2
		Transporte tp;
		tp = Transporte.AVION;
		//System.out.println("El valor tp elegido es:" + tp);
		tp = Transporte.BARCO;
		
		//comparar con enum
		/*if(tp == Transporte.TREN) {
			System.out.println("El valor tp  es:" + tp);
		}
		else {
			System.out.println("El valor tp  no es TREN, es " + tp);
		}*/
		
		//switch con enum
		/*
		switch(tp) {
		case COCHE:
			System.out.println("UN AUTO LLEVA 5 PERSONAS");
			break;
		case TREN:
			System.out.println("TREN VIAJA POR RIELES:");
			break;
		case AVION:
			System.out.println("UN AVION VUELA");
			break;
		case BARCO:
			System.out.println("UN BARCO NAVEGA POR EL OCEANO");
			break;
		case CAMION:
			System.out.println("CAMION LLEVA CARGA");
			break;
		case MOTO:
			System.out.println("MOTO LLEVA DOS PERSONAS");
			break;
		case BICICLETA:
			System.out.println("LLEVA UNA PERSONA");
			break;
		}*/
		
		//EJERICIO3
		//PROPIEDAD VALUES
		Color arr[] = Color.values();
		for(Color col:arr) {
			System.out.println(col + " indice: "+ col.ordinal());
		}
		
		//Ejercicio4
		Transporte1 tp2 = null;
		System.out.println("La velocidad para un avion es: " + tp2.BARCO.getVelocidad() + "Km/h");
		
		//MOSTRAR TODO
		for(Transporte1 t: Transporte1.values()) {
			System.out.println(t + " la velocidad es: "+ t.getVelocidad() + "km/h");
		}
		
	}

}
