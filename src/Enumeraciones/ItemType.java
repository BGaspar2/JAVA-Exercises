package Enumeraciones;

public enum ItemType {
	Primero("1er. Nivel"), Segundo("2do. Nivel"), Tercero("3er. Nivel"), Cuarto("4to. Nivel");
	private String imp_nivel;
	
	private ItemType(String s) {
		imp_nivel = s;
	}
	
	public String toString() {
		return imp_nivel;
	}
	
}
