package MeGustaElArte;

public class Escultura extends ObraArte {
	
	private double peso;

	public Escultura(String nombre, double valor, double peso) {
		super(nombre, valor);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
