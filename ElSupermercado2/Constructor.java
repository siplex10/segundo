package Supermercado2;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		
		
		int opcion1;
		
		Electronica[] electronica = new Electronica[10];
		Alimento[] alimento = new Alimento[10];
		Ropa[] ropa = new Ropa[10];
		
		
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
				System.out.println("1- Agregar alimento");
				System.out.println("2- Agregar producto electronico");
				System.out.println("3- Agregar ropa");
				System.out.println("4- Salir");
				
				int opcion2 = lector.nextInt();
				
				switch (opcion2) {
				
				case 1: 
					
					Alimento.altaAlimento(alimento, lector);
					break;
					
				case 2:
					
					Electronica.altaElectronica(electronica,   lector);
					break;
					
				case 3:
					
					Ropa.altaRopa(ropa, lector);
					break;
				default:
				}
									

				
				break;
				
			case 2:

				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Mostrar alimento");
				System.out.println("2- Mostrar producto electronico");
				System.out.println("3- Mostrar ropa");
				System.out.println("4- Salir");
				
				int opcion3 = lector.nextInt();
				
				switch (opcion3) {
				
				case 1: 
					
					Alimento.listarAlimento(alimento);
					break;
					
				case 2:
					
					Electronica.listarElectronica( electronica);
					break;
					
				case 3:
					
					Ropa.listarRopa(ropa);
					break;
				default:
					
				}
									

				
				break;
				
			case 3:

				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Borrar alimento");
				System.out.println("2- Borrar producto electronico");
				System.out.println("3- Borrar ropa");
				System.out.println("4- Salir");
				
				int opcion4 = lector.nextInt();
				
				switch (opcion4) {
				
				case 1: 
					
					Alimento.bajaAlimento( alimento,  lector);
					break;
					
				case 2:
					
					Electronica.bajaElectronica( electronica,  lector);
					break;
					
				case 3:
					
					Ropa.bajaRopa(ropa, lector);
					break;
				default:
					
				}
				
				break;
			case 4:

				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Modificar alimento");
				System.out.println("2- Modificar producto electronico");
				System.out.println("3- Modificar ropa");
				System.out.println("4- Salir");
				
				int opcion5 = lector.nextInt();
				
				switch (opcion5) {
				
				case 1: 
					
					Alimento.modifAlimento(alimento,lector);
					break;
					
				case 2:
					
					Electronica.modifElectronica( electronica,  lector);
					break;
					
				case 3:
					
					Ropa.modifRopa( ropa,  lector);
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
	
	public static void caso1() {
		
	}

}