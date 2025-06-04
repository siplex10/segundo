package Supermercado;

public class Alimento extends Producto {
	
	private String vencimiento;

	
	
	public Alimento(String nombre, double precio, String vencimiento) {
		super(nombre, precio);
		this.vencimiento = vencimiento;
	}

	public String getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	

}
