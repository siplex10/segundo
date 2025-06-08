package MeGustaElArte;

public class Fotografia extends ObraArte {
	
	private String camara;

	public Fotografia(String nombre, double valor, String camara) {
		super(nombre, valor);
		this.camara = camara;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

}
