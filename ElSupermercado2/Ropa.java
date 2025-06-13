package Supermercado2;

import java.util.Scanner;

public class Ropa extends Producto {
	
	private String talle;

	
	
	public Ropa(String nombre,  String talle) {
		
		super(nombre);
		this.talle = talle;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}
	

	
	
	
	
	public static void bajaRopa(Ropa[] ropa, Scanner lector) {
		
		System.out.println("Ingresa el nombre de la ropa a dar de baja: ");
		String nombre = lector.next();
		
		for(int i=0; i<ropa.length; i++) {
			if(ropa[i] != null && ropa[i].getNombre().length() == nombre.length()) {
				
				ropa[i] = null;
				break;
			}
		}
	}
	
public static void modifRopa(Ropa[] ropa, Scanner lector) {
	
	System.out.println("Ingresa el nombre de la ropa a modificar: ");
	String nombre = lector.next();
	
	for(int i=0; i<ropa.length; i++) {
		if(ropa[i] != null && ropa[i].getNombre().length() == nombre.length()) {
			
			System.out.println("Alimento encontrado");
			
			System.out.println("Ingresa el nuevo nombre del alimento: ");
				
			ropa[i].setNombre(lector.next());
				
			System.out.println("Ingresa el nuevo talle del alimento: ");
				
			ropa[i].setTalle(lector.next());
		}else {
			System.out.println("No se encontro la ropa");
		}
			break;
		
	}
}


public static void altaRopa(Ropa[] ropa,  Scanner lector) {
	
	
	System.out.println("Ingresa el nombre de la ropa: ");
	String nombre = lector.next();
	
	System.out.println("Ingresa el talle: ");
	String talle = lector.next();
	
	
	for(int i=0; i<ropa.length; i++) {
		if(ropa[i] == null) {
			
			ropa[i] = new Ropa( nombre, talle);
			
			break;

	}
	}
	
}

public static void listarRopa(Ropa[] ropa) {
	
	System.out.println("--------------------------------------------------------------------------------------------");
	
	for(int i=0; i<ropa.length; i++) {
		if(ropa[i] != null) {
			System.out.print("Nombre: " + ropa[i].getNombre());
			
			System.out.println(" | Talle: " + ropa[i].getTalle());
			System.out.println("--------------------------------------------------------------------------------------------");
		
		}else {
			
		}
	}
	
	
}

}
