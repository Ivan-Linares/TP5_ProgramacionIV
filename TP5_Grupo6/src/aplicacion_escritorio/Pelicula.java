package aplicacion_escritorio;

public class Pelicula {

	private Categoria categoria;
	private int ID;
	private String nombre;	
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pelicula() {
		
	}
	
	public Pelicula(Categoria categoria, int iD, String nombre) {
		super();
		this.categoria = categoria;
		ID = iD;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return ID + " - " + nombre + " - " + categoria.getNombre();
	}
	
	
	
}
