package parcial3;

public class CNT {
	private String numCelular;
	private double abono;
	public CNT(String numCelular, double abono) {
		super();
		this.numCelular = numCelular;
		this.abono = abono;
	}
	public String mostrar() {
		return "CNT |Numero: " + this.numCelular + "| Abono: " + this.abono;
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
