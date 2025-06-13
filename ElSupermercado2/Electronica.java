package Supermercado2;

import java.util.Scanner;

public class Electronica extends Producto {

	private double watts;

	
	
	
	public Electronica(String nombre, double watts) {
		super(nombre);
		this.watts = watts;
	}

	public double getWatts() {
		return watts;
	}

	public void setWatts(double watts) {
		this.watts = watts;
	}




public static void bajaElectronica(Electronica[] electronica, Scanner lector) {
		
		System.out.println("Ingresa el nombre del producto electronico a dar de baja: ");
		String nombre = lector.next();
		
		for(int i=0; i<electronica.length; i++) {
			if(electronica[i] != null && electronica[i].getNombre().length() == nombre.length()) {
				
				electronica[i] = null;
				break;
			}
		}
	}

public static void modifElectronica(Electronica[] electronica, Scanner lector) {
	
	System.out.println("Ingresa el nombre del producto electronico a modificar: ");
	String nombre = lector.next();
	
	for(int i=0; i<electronica.length; i++) {
		if(electronica[i] != null && electronica[i].getNombre().length() == nombre.length()) {
			
			System.out.println("Alimento encontrado");
			
			System.out.println("Ingresa el nuevo nombre del producto electronico: ");
				
			electronica[i].setNombre(lector.next());
				
			System.out.println("Ingresa los watts del producto electronico: ");
				
			electronica[i].setWatts(lector.nextDouble());
		}else {
			System.out.println("No se encontro el producto");
		}
			break;
		
	}
}


public static void altaElectronica(Electronica[] electronica,  Scanner lector) {
	
	
	System.out.println("Ingresa el nombre del producto electronico: ");
	String nombre = lector.next();
	
	System.out.println("Ingresa los watts que usa el producto electronico: ");
	double watts = lector.nextDouble();
	
	
	for(int i=0; i<electronica.length; i++) {
		if(electronica[i] == null) {
			
			electronica[i] = new Electronica( nombre, watts);
			
			break;

	}
	}
	
}


public static void listarElectronica(Electronica[] electronica) {
	
	System.out.println("--------------------------------------------------------------------------------------------");
	
	for(int i=0; i<electronica.length; i++) {
		if(electronica[i] != null) {
			
			System.out.print("Nombre: " + electronica[i].getNombre());
			
			System.out.println(" | Watts: " + electronica[i].getWatts());
			System.out.println("--------------------------------------------------------------------------------------------");
		}else {
			
		}
		
	}
	

	
}

}
