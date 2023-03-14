package lamda;

public class Scopes {
	private double n3 = 3;
	public double probarVariableLocal() {
		
		/*Operacion op = new Operacion() {
			
			@Override
			public double calcular(double n1, double n2) {
				
				 
				return n1 + n2 + n3;
			}

			@Override
			public double CalcularPromedio(double n1, double n2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			
		};*/
		Operacion op =   ( n1,  n2) -> {
			n3 = n1+n2;
			return n1+n2+n3;
		};
		return op.calcular(2, 8);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scopes app = new Scopes();
		System.out.println(app.probarVariableLocal());
	}

}
