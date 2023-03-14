package parcial3;

public class CLARO {
		private String numCelular;
		private double abono;


		public CLARO(String numCelular, double abono) {

			this.numCelular = numCelular;
			this.abono = abono;
		}

		public String mostrar() {
			return "CLARO | Numero: " + this.numCelular + "| Abono: " + this.abono;
		}

		public String getNumCelular() {
			return numCelular;
		}
		public void setNumCelular(String numCelular) {
			this.numCelular = numCelular;
		}
		public double getAbono() {
			return abono;
		}
		public void setAbono(double abono) {
			this.abono = abono;
		}


}
