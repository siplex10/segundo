package Supermercado;

public class Ropa extends Producto {
	
	private String talle;

	
	
	public Ropa(String nombre, double precio, String talle) {
		
		super(nombre, precio);
		this.talle = talle;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}
	

}
