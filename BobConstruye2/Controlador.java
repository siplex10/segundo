package BobConstruye2;

import java.util.Scanner;


public class Controlador {

	public static void main(String[] args) {

		int opcion1;
		
		Apartamento[] apartamento = new Apartamento[10];
			Casa[] casa = new Casa[10];
			
			
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
					System.out.println("1- Agregar apartamento");
					System.out.println("2- Agregar casa");
					System.out.println("3- Salir");
					
					int opcion2 = lector.nextInt();
					
					switch (opcion2) {
					
					case 1: 
						
						Apartamento.altaApartamento( apartamento,   lector);
						break;
						
					case 2:
						
						Casa.altaCasa(casa,   lector);
						break;
						
					case 3:
						
						System.out.println(" ------------");
						System.out.println("|  Saliste  |");
						System.out.println(" ------------");
						
						break;
					default:
					}
										

					
					break;
					
				case 2:

					System.out.println("Ingresa opcion:");
					System.out.println("");
					System.out.println("1- Mostrar apartamento");
					System.out.println("2- Mostrar casa");
					System.out.println("3- Salir");
					
					
					int opcion3 = lector.nextInt();
					
					switch (opcion3) {
					
					case 1: 
						
						Apartamento.listarApartamento( apartamento);
						break;
						
					case 2:
						
						Casa.listarCasa(casa);
						break;
						
					case 3:
						
						System.out.println(" ------------");
						System.out.println("|  Saliste  |");
						System.out.println(" ------------");
						
						break;
					default:
					}
										

					
					break;
					
				case 3:

					System.out.println("Ingresa opcion:");
					System.out.println("");
					System.out.println("1- Borrar apartamento");
					System.out.println("2- Borrar casa");
					System.out.println("3- Salir");
					
					int opcion4 = lector.nextInt();
					
					switch (opcion4) {
					
					case 1: 
						
						Apartamento.bajaApartamento( apartamento,   lector);
						break;
						
					case 2:
						
						Casa.bajaCasa(casa,   lector);
						break;
						
					case 3:
						
						System.out.println(" ------------");
						System.out.println("|  Saliste  |");
						System.out.println(" ------------");
						
						break;
					default:
					}
										

					
					break;
				case 4:

					System.out.println("Ingresa opcion:");
					System.out.println("");
					System.out.println("1- Modificar apartamento");
					System.out.println("2- Modificar casa");
					System.out.println("3- Salir");
					
					int opcion5 = lector.nextInt();
					
					switch (opcion5) {
					
					case 1: 
						
						Apartamento.modifApartamento( apartamento,   lector);
						break;
						
					case 2:
						
						Casa.modifCasa(casa,   lector);
						break;
						
					case 3:
						
						System.out.println(" ------------");
						System.out.println("|  Saliste  |");
						System.out.println(" ------------");
						
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