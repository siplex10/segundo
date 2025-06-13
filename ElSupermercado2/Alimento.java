package Supermercado2;

import java.util.Scanner;

public class Alimento extends Producto {
	
	private String vencimiento;


	
	public Alimento(String nombre, String vencimiento) {
		super(nombre);
		this.vencimiento = vencimiento;
	}

	public String getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	
public static void bajaAlimento(Alimento[] alimento, Scanner lector) {
		
		System.out.println("Ingresa el nombre del alimento a dar de baja: ");
		String nombre = lector.next();
		
		for(int i=0; i<alimento.length; i++) {
			if(alimento[i] != null && alimento[i].getNombre().length() == nombre.length()) {
				
				alimento[i] = null;
				break;
			}
		}
	}


public static void modifAlimento(Alimento[] alimento, Scanner lector) {
	
	System.out.println("Ingresa el nombre del alimento a modificar: ");
	String nombre = lector.next();
	
	for(int i=0; i<alimento.length; i++) {
		if(alimento[i] != null && alimento[i].getNombre().length() == nombre.length()) {
			
			System.out.println("Alimento encontrado");
			
			System.out.println("Ingresa el nuevo nombre del alimento: ");
				
			alimento[i].setNombre(lector.next());
				
			System.out.println("Ingresa el Vencimiento del alimento: ");
				
			alimento[i].setVencimiento(lector.next());
		}else {
			System.out.println("No se encontro el alimento");
		}
			break;
		
	}
}


public static void altaAlimento(Alimento[] alimento,  Scanner lector) {
	
	
	
	
	System.out.println("Ingresa el nombre del alimento: ");
	String nombre = lector.next();
	
	System.out.println("Ingresa vencimiento: ");
	String vencimiento = lector.next();
	
	
	for(int i=0; i<alimento.length; i++) {
		if(alimento[i] == null) {
			
			alimento[i] = new Alimento( nombre, vencimiento);
			break;

	}
	}
	
}


public static void listarAlimento(Alimento[] alimento) {
	
	System.out.println("--------------------------------------------------------------------------------------------");

	for(int i=0; i<alimento.length; i++) {
		if(alimento[i] != null) {
			System.out.print("Nombre: " + alimento[i].getNombre());
			
			System.out.println(" | Vencimiento: " + alimento[i].getVencimiento());
			System.out.println("--------------------------------------------------------------------------------------------");
			
		}else {
			
		}
		
	}
	
	
}

}
