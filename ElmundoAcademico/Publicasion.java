package ElMundoAcademico;

public class Publicasion {

	private String titulo;
	private String autor;
	
	
	
	public Publicasion(String titulo, String autor) {
		
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
