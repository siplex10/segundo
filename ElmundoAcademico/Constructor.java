package ElMundoAcademico;
import java.util.Scanner;
public class Constructor {

	public static void main(String[] args) {
	
				Libro l1 = new Libro(null,null,0,null);
				Revista r1 = new Revista(null,null,null,0);
				ArtículoCientífico a1 = new ArtículoCientífico(null,null,null,null);
				
				Scanner lector = new Scanner(System.in);
						
				System.out.println("Ingresa el titulo del libro ");
				l1.setTitulo(lector.nextLine());
				
				System.out.println("Ingresa el nombre del autor");
				l1.setAutor(lector.nextLine());
				
				System.out.println("Ingresa el numero de paginas del libro");
				l1.setNumero(lector.nextInt());
				
				System.out.println("Ingresa el genero del libro");
				l1.setGenero(lector.nextLine());
				
				System.out.println("");
				
				System.out.println("Ingresa el precio de la revista");
				r1.setPrecio(lector.nextDouble());
				
				System.out.println("Ingresa el nombre del autor");
				r1.setAutor(lector.nextLine());
				
				System.out.println("Ingresa el titulo de la revista");
				r1.setTitulo(lector.nextLine());
				
				System.out.println("Ingresa la fecha de lanzamiento");
				r1.setFecha(lector.nextLine());
				
				System.out.println("");
				
				System.out.println("Ingresa el titulo del artuculo");
				a1.setTitulo(lector.nextLine());
				
				System.out.println("Ingresa el escritor del articulo");
				a1.setAutor(lector.nextLine());
				
				System.out.println("Ingresa el tema del articulo");
				a1.setTema(lector.nextLine());
				
				System.out.println("Ingresa el nombre del investigador");
				a1.setInvestigador(lector.nextLine());
				
				System.out.println("");

				
				System.out.println("--------------------------------------------");
				System.out.println("Titulo del libro: " + l1.getTitulo());
				System.out.println("Autor del libro: " + l1.getAutor());
				System.out.println("Numero de paginas del libro: " + l1.getNumero());
				System.out.println("Genero del libro: " + l1.getGenero());
				System.out.println("--------------------------------------------");
				System.out.println("Titulo de la revista: " + r1.getTitulo());
				System.out.println("Precio de la revista: " + r1.getPrecio());
				System.out.println("Autor de la revista: " + r1.getAutor());
				System.out.println("Fecha de lanzamiento: " + r1.getFecha());
				System.out.println("--------------------------------------------");
				System.out.println("Titulo del articulo: " + a1.getTitulo());
				System.out.println("Escritor del articulo: " + a1.getAutor());
				System.out.println("Tema del articulo: " + a1.getTema());
				System.out.println("Investigador del articulo: " + a1.getInvestigador());
				System.out.println("--------------------------------------------");
				
				
				
				
				
				

				
			}

			}

		