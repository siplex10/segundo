package ElMundoAcademico;

public class Libro extends Publicasion {

	private int numero;
	private String genero;
	
	
	
	
	public Libro(String titulo, String autor, int numero, String genero) {
		super(titulo, autor);
		this.numero = numero;
		this.genero = genero;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
