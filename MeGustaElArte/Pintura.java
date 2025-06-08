package MeGustaElArte;

public class Pintura extends ObraArte {
	
	private String tipo;

	public Pintura(String nombre, double valor, String tipo) {
		super(nombre, valor);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
