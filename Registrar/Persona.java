package Planilla;

public class Persona {

	
	private String nombre;
	private String apellido;
	//private int cedula;
	
	public Persona(String nombre, String apellido /*, int cedula*/) {
		
		this.setNombre(nombre);
		this.setApellido(apellido);
		//this.setCedula(cedula);
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/*public int getCedula() {
		return cedula;
	}


	public void setCedula( int cedula) {
		this.cedula = cedula;
	}*/

	
	
	
}
