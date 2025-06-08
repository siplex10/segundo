package BobConstruye;

public class Apartamento extends Edificio {

	private int piso;

	
	
	public Apartamento(String ubicasion, int piso) {
		super(ubicasion);
		this.piso = piso;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
	
}
