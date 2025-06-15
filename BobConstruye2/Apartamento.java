package BobConstruye2;

import java.util.Scanner;



public class Apartamento extends Edificio {

	private int numero;

	
	
	public Apartamento(String ubicasion, int numero) {
		super(ubicasion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int piso) {
		this.numero = piso;
	}
	
	
public static void altaApartamento(Apartamento[] apartamento,  Scanner lector) {
		
		
		
		
		System.out.println("Ingresa la ubicasion del apartamento: ");
		String ubicasion = lector.next();
		
		System.out.println("Ingresa el numero del apartamento: ");
		int numero = lector.nextInt();
		
		
		for(int i=0; i<apartamento.length; i++) {
			if(apartamento[i] == null) {
				
				apartamento[i] = new Apartamento( ubicasion, numero);
				break;

		}
		}
		
	}


	public static void bajaApartamento(Apartamento[] apartamento, Scanner lector) {
			
			System.out.println("Ingresa el numero del apartamento a dar de baja: ");
			int numero = lector.nextInt();
			
			for(int i=0; i<apartamento.length; i++) {
				if(apartamento[i] != null && apartamento[i].getNumero() == numero) {
					
					apartamento[i] = null;
					break;
				}
			}
		}

	public static void modifApartamento(Apartamento[] apartamento, Scanner lector) {
		
		System.out.println("Ingresa el numero del apartamento a modificar: ");
		int numero = lector.nextInt();
		
		for(int i=0; i<apartamento.length; i++) {
			
			if(apartamento[i] != null && apartamento[i].getNumero() == numero) {
				
				System.out.println("Ingresa la nueva ubicasion: ");
					
				apartamento[i].setUbicasion(lector.next());
					
				System.out.println("Ingresa el nuevo numero del apartamento: ");
					
				apartamento[i].setNumero(lector.nextInt());
			}else {
				System.out.println("No se encontro el apartamento");
			}
				break;
			
		}
	}


	public static void listarApartamento(Apartamento[] apartamento) {
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Apartamento:");
		System.out.println("");
		
		for(int i=0; i<apartamento.length; i++) {
			if(apartamento[i] != null) {
				System.out.print("Ubicasion: " + apartamento[i].getUbicasion());
				
				System.out.println(" | Numero: " + apartamento[i].getNumero());
				System.out.println("--------------------------------------------------------------------------------------------");
				
			}else {
				
			}
			
		}
		
		
	}
}

