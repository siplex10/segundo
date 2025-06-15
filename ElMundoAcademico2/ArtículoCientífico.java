package ElMundoAcademico2;

import java.util.Scanner;



public class ArtículoCientífico extends Publicasion {

	
	private String tema;
	
	
	
	
	public ArtículoCientífico(String titulo, String tema) {
		super(titulo);
		this.tema = tema;
		
	}
	
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public static void altaArticulo(ArtículoCientífico[] ac,  Scanner lector) {
		
		
		
		
		System.out.println("Ingresa el titulo del articulo: ");
		String titulo = lector.next();
		
		System.out.println("Ingresa el tema del articulo: ");
		String tema = lector.next();
		
		
		for(int i=0; i<ac.length; i++) {
			if(ac[i] == null) {
				
				ac[i] = new ArtículoCientífico( titulo, tema);
				break;

		}
		}
		
	}


	public static void bajaArticulo(ArtículoCientífico[] ac, Scanner lector) {
			
			System.out.println("Ingresa el titulo del articulo a dar de baja: ");
			String titulo = lector.next();
			
			for(int i=0; i<ac.length; i++) {
				if(ac[i] != null && ac[i].getTitulo().length() == titulo.length()) {
					
					ac[i] = null;
					break;
				}
			}
		}

	public static void modifArticulo(ArtículoCientífico[] ac, Scanner lector) {
		
		System.out.println("Ingresa el titulo del articulo a modificar: ");
		String titulo = lector.next();
		
		for(int i=0; i<ac.length; i++) {
			if(ac[i] != null && ac[i].getTitulo().length() == titulo.length()) {
				
				
				System.out.println("Articulo encontrado");
				
				System.out.println("Ingresa el nuevo titulo del articulo: ");
					
				ac[i].setTitulo(lector.next());
					
				System.out.println("Ingresa el tema del articulo: ");
					
				ac[i].setTema(lector.next());
			}else {
				System.out.println("No se encontro el articulo");
			}
				break;
			
		}
	}


	public static void listarArticulo(ArtículoCientífico[] ac) {
		
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("Artículo científico:");
		System.out.println("");
		
		for(int i=0; i<ac.length; i++) {
			if(ac[i] != null) {
				System.out.print("Titulo: " + ac[i].getTitulo());
				
				System.out.println(" | Tema: " + ac[i].getTema());
				System.out.println("--------------------------------------------------------------------------------------------");
				
			}else {
				
			}
			
		}
		
		
	}

}
