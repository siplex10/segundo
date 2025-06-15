package ElMundoAcademico2;

import java.util.Scanner;

public class Revista extends Publicasion {

	private String fecha;
	
	

	
	

	public Revista(String titulo,String fecha) {
		super(titulo);
		this.fecha = fecha;
		
	}

	

	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public static void altaRevista(Revista[] revista,  Scanner lector) {
		
		
		
		
		System.out.println("Ingresa el titulo de la revista: ");
		String titulo = lector.next();
		
		System.out.println("Ingresa la fecha de publicasion de la revista: ");
		String fecha = lector.next();
		
		
		for(int i=0; i<revista.length; i++) {
			if(revista[i] == null) {
				
				revista[i] = new Revista( titulo, fecha);
				break;

		}
		}
		
	}


	public static void bajaRevista(Revista[] revista, Scanner lector) {
			
			System.out.println("Ingresa el titulo de la revista a dar de baja: ");
			String titulo = lector.next();
			
			for(int i=0; i<revista.length; i++) {
				if(revista[i] != null && revista[i].getTitulo().length() == titulo.length()) {
					
					revista[i] = null;
					break;
				}
			}
		}

	public static void modifRevista(Revista[] revista, Scanner lector) {
		
		System.out.println("Ingresa el titulo de la revista a modificar: ");
		String titulo = lector.next();
		
		for(int i=0; i<revista.length; i++) {
			if(revista[i] != null && revista[i].getTitulo().length() == titulo.length()) {
				
				
				System.out.println("Ingresa el nuevo titulo de la revista: ");
					
				revista[i].setTitulo(lector.next());
					
				System.out.println("Ingresa la nueva fecha de publicasion de la revista: ");
					
				revista[i].setFecha(lector.next());
			}else {
				System.out.println("No se encontro la revista");
			}
				break;
			
		}
	}


	public static void listarRevista(Revista[] revista) {
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Revista:");
		System.out.println("");
		
		for(int i=0; i<revista.length; i++) {
			if(revista[i] != null) {
				System.out.print("Titulo: " + revista[i].getTitulo());
				
				System.out.println(" | Fecha: " + revista[i].getFecha());
				System.out.println("--------------------------------------------------------------------------------------------");
				
			}else {
				
			}
			
		}
		
		
	}
	
}
