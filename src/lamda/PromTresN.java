package lamda;

public class PromTresN {
	public double calcular () {
		
		
		Operacion2 op =  (double n1, double n2, double n3) -> (n1+n2+n3)/3;
		 
		return op.CalcularPromedioN(50, 35,41);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PromTresN app = new PromTresN();
		System.out.println("Promedio: " + app.calcular());

	}

}
