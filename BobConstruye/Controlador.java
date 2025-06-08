package BobConstruye;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		
		Casa c1 = new  Casa(null, 0);
		Apartamento a1 = new Apartamento(null, 0);
		
		System.out.println("Ingresa la ubicasion de la casa");
		c1.setUbicasion(lector.nextLine());
		
		System.out.println("Ingresa las habitaciones de la casa");
		c1.setHabitaciones(lector.nextInt());
		
		System.out.println("Ingresa la ubicasion del apartamento");
		String holaProfe = lector.next();
		a1.setUbicasion(lector.nextLine());
		
		System.out.println("Ingresa el piso del apartamento");
		a1.setPiso(lector.nextInt());
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Ubicasion de la casa: "+c1.getUbicasion());
		System.out.println("Habitaciones de la casa: "+c1.getHabitaciones());
		
		System.out.println("------------------------------------------------");

		System.out.println("Ubicasion del apartamento: "+a1.getUbicasion());
		System.out.println("Piso del apartamento: "+a1.getPiso());
		
		System.out.println("------------------------------------------------");


	}

}
