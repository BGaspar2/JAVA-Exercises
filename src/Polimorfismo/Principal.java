package Polimorfismo;

public class Principal {
	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0] = new Vehiculo("GH67","Ferrari","A76");
		misVehiculos[1] = new VehiculoTurismo("HJ78","Audi","P18",4);
		misVehiculos[2] = new VehiculoDeportivo("PATA53","Toyota","AB15", 1600);
		misVehiculos[3] = new VehiculoFurgoneta("ZAPA234","Toyota","XY67",2000);
		
		for(Vehiculo v  : misVehiculos) {
			System.out.println(v.toString());
			System.out.println(" ");
		}
	}
}
