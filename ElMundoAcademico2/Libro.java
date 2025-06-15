package ElMundoAcademico2;

import java.util.Scanner;

public class Libro extends Publicasion {

	private int numero;
	
	
	
	
	
	public Libro(String titulo,int numero) {
		super(titulo);
		this.numero = numero;
		
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static void altaLibro(Libro[] libro,  Scanner lector) {
		
		
		
		
		System.out.println("Ingresa el titulo del libro: ");
		String titulo = lector.next();
		
		System.out.println("Ingresa el numero del libro: ");
		int numero = lector.nextInt();
		
		
		for(int i=0; i<libro.length; i++) {
			if(libro[i] == null) {
				
				libro[i] = new Libro( titulo, numero);
				break;

		}
		}
		
	}


	public static void bajaLibro(Libro[] libro, Scanner lector) {
			
			System.out.println("Ingresa el numero del libro a dar de baja: ");
			int numero = lector.nextInt();
			
			for(int i=0; i<libro.length; i++) {
				if(libro[i] != null && libro[i].getNumero() == numero) {
					
					libro[i] = null;
					break;
				}
			}
		}

	public static void modifLibro(Libro[] libro, Scanner lector) {
		
		System.out.println("Ingresa el numero del libro a modificar: ");
		int numero = lector.nextInt();
		
		for(int i=0; i<libro.length; i++) {
			if(libro[i] != null && libro[i].getNumero() == numero) {
				
				System.out.println("Libro encontrado");
				
				System.out.println("Ingresa el nuevo titulo del libro: ");
					
				libro[i].setTitulo(lector.next());
					
				System.out.println("Ingresa el numero del libro: ");
					
				libro[i].setNumero(lector.nextInt());
			}else {
				System.out.println("No se encontro el libro");
			}
				break;
			
		}
	}


	public static void listarLibro(Libro[] libro) {
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Libro:");
		System.out.println("");
		
		for(int i=0; i<libro.length; i++) {
			if(libro[i] != null) {
				System.out.print("Titulo: " + libro[i].getTitulo());
				
				System.out.println(" | Numero: " + libro[i].getNumero());
				System.out.println("--------------------------------------------------------------------------------------------");
				
			}else {
				
			}
			
		}
		
		
	}
}
