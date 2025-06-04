package Supermercado;

public class Electronica extends Producto {

	private double watts;

	
	
	
	public Electronica(String nombre, double precio, double watts) {
		super(nombre, precio);
		this.watts = watts;
	}

	public double getWatts() {
		return watts;
	}

	public void setWatts(double watts) {
		this.watts = watts;
	}






}
