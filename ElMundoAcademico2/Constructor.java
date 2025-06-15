package ElMundoAcademico2;
import java.util.Scanner;


public class Constructor {

	public static void main(String[] args) {
	
int opcion1;
		
	ArtículoCientífico[] ac = new ArtículoCientífico[10];
		Libro[] libro = new Libro[10];
		Revista[] revista = new Revista[10];
		
		
		do {
			
			Scanner lector = new Scanner(System.in);
			
			
			System.out.println("Ingresa opcion deseada:");
			System.out.println("");
			System.out.println("1- Ingresar");
			System.out.println("2- Mostrar Lista");
			System.out.println("3- Borrar");
			System.out.println("4- Modificar");
			System.out.println("5- Salir");
			opcion1 = lector.nextInt();
			
			
			switch (opcion1) {
			
			case 1:
				
				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Agregar articulo");
				System.out.println("2- Agregar libro");
				System.out.println("3- Agregar revista");
				System.out.println("4- Salir");
				
				int opcion2 = lector.nextInt();
				
				switch (opcion2) {
				
				case 1: 
					
					ArtículoCientífico.altaArticulo( ac,   lector);
					break;
					
				case 2:
					
					Libro.altaLibro(libro,   lector);
					break;
					
				case 3:
					
					Revista.altaRevista(revista, lector);
					break;
				default:
				}
									

				
				break;
				
			case 2:

				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Mostrar articulo");
				System.out.println("2- Mostrar libro");
				System.out.println("3- Mostrar revista");
				System.out.println("4- Salir");
				
				int opcion3 = lector.nextInt();
				
				switch (opcion3) {
				
				case 1: 
					
					ArtículoCientífico.listarArticulo(ac);
					break;
					
				case 2:
					
					Libro.listarLibro( libro);
					break;
					
				case 3:
					
					Revista.listarRevista(revista);
					break;
				default:
					
				}
									

				
				break;
				
			case 3:

				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Borrar articulo");
				System.out.println("2- Borrar libro");
				System.out.println("3- Borrar revista");
				System.out.println("4- Salir");
				
				int opcion4 = lector.nextInt();
				
				switch (opcion4) {
				
				case 1: 
					
					ArtículoCientífico.bajaArticulo(ac, lector);
					break;
					
				case 2:
					
					Libro.bajaLibro( libro,  lector);
					break;
					
				case 3:
					
					Revista.bajaRevista(revista, lector);
					break;
				default:
					
				}
				
				break;
			case 4:

				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Modificar articulo");
				System.out.println("2- Modificar libro");
				System.out.println("3- Modificar revista");
				System.out.println("4- Salir");
				
				int opcion5 = lector.nextInt();
				
				switch (opcion5) {
				
				case 1: 
					
					ArtículoCientífico.modifArticulo(ac,lector);
					break;
					
				case 2:
					
					Libro.modifLibro( libro,  lector);
					break;
					
				case 3:
					
					Revista.modifRevista( revista,  lector);
					break;
				default:
					
				}
				break;
			case 5:
				System.out.println(" ------------");
				System.out.println("|  Saliste  |");
				System.out.println(" ------------");

				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}
			
		} while (opcion1!=5);

	}
	
	
		
	

}