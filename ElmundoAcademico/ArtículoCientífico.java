package ElMundoAcademico;

public class ArtículoCientífico extends Publicasion {

	
	private String tema;
	private String investigador;
	
	
	
	public ArtículoCientífico(String titulo, String autor, String tema, String investigador) {
		super(titulo, autor);
		this.tema = tema;
		this.investigador = investigador;
	}
	public String getInvestigador() {
		return investigador;
	}
	public void setInvestigador(String investigador) {
		this.investigador = investigador;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
}
