package Supermercado;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		
		Electronica e1 = new Electronica(null,0,0);
		Ropa r1 = new Ropa(null,0,null);
		Alimento a1 = new Alimento(null,0,null);
		
		Scanner lector = new Scanner(System.in);
				
		System.out.println("Ingresa el nombre del producto electronico");
		e1.setNombre(lector.next());
		
		System.out.println("Ingresa el precio del producto electronico");
		e1.setPrecio(lector.nextDouble());
		
		System.out.println("Ingresa el watts del producto electronico");
		e1.setWatts(lector.nextDouble());
		
		System.out.println("Ingresa el nombre de la ropa");
		r1.setNombre(lector.next());
		
		System.out.println("Ingresa el precio de la ropa");
		r1.setPrecio(lector.nextDouble());
		
		System.out.println("Ingresa el talle de la ropa");
		r1.setTalle(lector.next());
		
		System.out.println("Ingresa el nombre del alimento");
		a1.setNombre(lector.next());
		
		System.out.println("Ingresa el precio del alimento");
		a1.setPrecio(lector.nextDouble());
		
		System.out.println("Ingresa los dias que faltan para vencerse");
		a1.setVencimiento(lector.next());
		
		System.out.println("--------------------------------------------");
		System.out.println("Nombre: " + e1.getNombre());
		System.out.println("Precio: " + e1.getPrecio());
		System.out.println("Watts: " + e1.getWatts());
		System.out.println("--------------------------------------------");
		System.out.println("Nombre: " + r1.getNombre());
		System.out.println("Precio: " + r1.getPrecio());
		System.out.println("Talle: " + r1.getTalle());
		System.out.println("--------------------------------------------");
		System.out.println("Nombre: " + a1.getNombre());
		System.out.println("Precio: " + a1.getPrecio());
		System.out.println("Vencimiento: " + a1.getVencimiento());
		System.out.println("--------------------------------------------");

		
		

	}

}
