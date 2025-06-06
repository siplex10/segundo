package ElMundoAcademico;

public class Revista extends Publicasion {

	private String fecha;
	private double precio;
	

	
	

	public Revista(String titulo, String autor, String fecha, double precio) {
		super(titulo, autor);
		this.fecha = fecha;
		this.precio = precio;
	}

	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
