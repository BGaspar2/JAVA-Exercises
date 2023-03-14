/**
 * Paquete donde esta el JFrame y la Clase Enum
 */
package TareaEnum;
/**
 *	En Esta Clase se crea la lista de electrodomesticos de venta de un almacen con el uso de ENUM
 */
public enum Electrodomesticos {
	/**
	 * variable que muestra el valor de una refrigeradora
	 */
	REFRIGERADORA("Refrigeradora"), 
	/**
	 * variable que muestra el valor de una Televisor
	 */
	TELEVISOR("Televisor"), 
	/**
	 * variable que muestra el valor de una Acondicionado
	 */
	AIRE_ACONDICIONADO("Aire Acondicionado"),
	/**
	 * variable que muestra el valor de una Computadora de Escritorio
	 */
	COMPUTADORA_ESCRITORIO("Computadora de Escritorio"), 
	/**
	 * variable que muestra el valor de una Computadora Portatil
	 */
	COMPUTADORA_PORTATIL("Computadora Portatil"),
	/**
	 * variable que muestra el valor de una Ventilador
	 */
	VENTILADOR("Ventilador"), 
	/**
	 * variable que muestra el valor de una Lavadora
	 */
	LAVADORA("Lavadora");
	
	private String impElectrodomestico;
	/**
	 * 
	 * @param s se crea el constructor de Electrodomesticos
	 */
	private Electrodomesticos(String s) {
		impElectrodomestico = s;
	}
	/**
	 * se crea el toString() que retorna la variable privada anteriormente declarada
	 */
	public String toString() {
		return impElectrodomestico;
	}
}
