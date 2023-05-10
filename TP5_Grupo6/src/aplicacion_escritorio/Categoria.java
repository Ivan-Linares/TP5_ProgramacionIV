package aplicacion_escritorio;

public class Categoria {

	private int ID;
	private String Nombre;
	
	public Categoria() {
		
	}
	
	public Categoria(int iD, String nombre) {
		super();
		ID = iD;
		Nombre = nombre;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	@Override
	public String toString() {
		return Nombre;
	}
	
}
