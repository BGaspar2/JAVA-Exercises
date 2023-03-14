package Enumeraciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		Transporte tp,tp2,tp3;
		for(Transporte t:Transporte.values()) {
			System.out.println(t + " " + t.ordinal());
		}
		
		tp = Transporte.AVION;
		tp2 = Transporte.TREN;
		tp3 = Transporte.AVION;
		
		//compareTo
		if(tp.compareTo(tp2)<0) {
			System.out.println(tp + " llega antes que " + tp2);
		}else if(tp.compareTo(tp2)>0){
			System.out.println(tp2 + " llega antes que " + tp);
			
				
		}
		if(tp.compareTo(tp3) == 0) {
			System.out.println(tp + " Es igual que " + tp3);
		}
		
		
		Color c1 = Color.ROJO;
		System.out.println(c1);
		c1.colorInfo();

	}

}
