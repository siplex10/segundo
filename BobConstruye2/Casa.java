package BobConstruye2;

import java.util.Scanner;

public class Casa extends Edificio {

	private int numero;

	
	
	public Casa(String ubicasion, int numero) {
		super(ubicasion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static void altaCasa(Casa[] casa,  Scanner lector) {

		
		System.out.println("Ingresa la ubicasion de la casa: ");
		String ubicasion = lector.next();
		
		System.out.println("Ingresa el numero de la casa: ");
		int numero = lector.nextInt();
		
		
		for(int i=0; i<casa.length; i++) {
			if(casa[i] == null) {
				
				casa[i] = new Casa( ubicasion, numero);
				break;

		}
		}
		
	}


	public static void bajaCasa(Casa[] casa, Scanner lector) {
			
			System.out.println("Ingresa el numero de la casa a dar de baja: ");
			int numero = lector.nextInt();
			
			for(int i=0; i<casa.length; i++) {
				if(casa[i] != null && casa[i].getNumero() == numero) {
					
					casa[i] = null;
					break;
				}
			}
		}

	public static void modifCasa(Casa[] casa, Scanner lector) {
		
		System.out.println("Ingresa el numero de la casa a modificar: ");
		int numero = lector.nextInt();
		
		for(int i=0; i<casa.length; i++) {
			
			if(casa[i] != null && casa[i].getNumero() == numero) {
				
				System.out.println("Ingresa la nueva ubicasion: ");
					
				casa[i].setUbicasion(lector.next());
					
				System.out.println("Ingresa el nuevo numero de la casa: ");
					
				casa[i].setNumero(lector.nextInt());
			}else {
				System.out.println("No se encontro la casa");
			}
				break;
			
		}
	}


	public static void listarCasa(Casa[] casa) {
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Casa:");
		System.out.println("");
		
		for(int i=0; i<casa.length; i++) {
			if(casa[i] != null) {
				System.out.print("Ubicasion: " + casa[i].getUbicasion());
				
				System.out.println(" | Numero: " + casa[i].getNumero());
				System.out.println("--------------------------------------------------------------------------------------------");
				
			}else {
				
			}
			
		}
		
		
	}
	
}
