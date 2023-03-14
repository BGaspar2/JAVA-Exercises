package TareaEnum;
/**
 *
 * Clase de restricciones para validar la cantidad y el precio unitario
 */
public class Restricciones {
	String precioUni,Cantidad;
	/**
	 * Constructor de la clase restricciones
	 * @param precioUni se asigna el precio unitario 
	 * @param Cantidad se asigna la cantidad de electrodomesticos
	 */
	public Restricciones(String precioUni, String Cantidad) {
		this.precioUni = precioUni;
		this.Cantidad = Cantidad;
		
	}

/**
 * Funcion que valida el precio unitario
 * @param precioUni parametro que recibe el precio
 * @return retorna la validacion de solo numeros y decimales
 */
	public boolean validarPrecioUni(String precioUni) {
		return precioUni.matches("[0-9]+.[0-9]+");
	}
	/**
	 * Funcion que valida la cantidad de electrodomesticos
	 * @param cant varible que recibe la funcion
	 * @return retorna la validacion de solo numeros 
	 */
	public boolean validarCantidad(String cant) {
		return cant.matches("[0-9]*");
	}
}
