package Parcial3;

public class Restricciones {
	String Cantidad;
	String precioUni;
	String Codigo;

	public Restricciones(String cantidad, String precioUni, String codigo) {
		super();
		Cantidad = cantidad;
		this.precioUni = precioUni;
		Codigo = codigo;
	}
	public boolean validarPrecioUni(String precioUni) {
		return precioUni.matches("[0-9]+.[0-9]+");
	}
	public boolean validarCodigo(String cant) {
		return cant.matches("[0-9]*");
	}
	public boolean validarCantidad(String codigo) {
		return codigo.matches("[0-9]*");
	}
}
