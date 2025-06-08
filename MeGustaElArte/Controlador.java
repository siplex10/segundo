package MeGustaElArte;

import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);

		Pintura p1 = new Pintura(null,0,null);
		Escultura e1 = new Escultura(null,0,0);
		Fotografia f1 = new Fotografia(null,0,null);
		
		System.out.println("Ingresa el nombre de la pintura");
		p1.setNombre(lector.nextLine());
		
		System.out.println("Ingresa el valor de la pintura");
		p1.setValor(lector.nextDouble());
		
		System.out.println("Ingresa el tipo de la pintura");
		p1.setTipo(lector.nextLine());
		
		System.out.println("");
		
		System.out.println("Ingresa el nombre de la escultura");
		e1.setNombre(lector.nextLine());
		
		System.out.println("Ingresa el valor de la escultura");
		e1.setValor(lector.nextDouble());
		
		System.out.println("Ingresa el peso de la escultura");
		e1.setPeso(lector.nextDouble());
		
		System.out.println("");
		
		System.out.println("Ingresa el nombre de la fotografia");
		f1.setNombre(lector.nextLine());
		
		System.out.println("Ingresa el valor de la fotografia");
		f1.setValor(lector.nextDouble());
		
		System.out.println("Ingresa la camara que se uso para sacar la fotografia");
		f1.setCamara(lector.nextLine());
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Pintura:");
		System.out.println("");
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Valor: $"+p1.getValor());
		System.out.println("Tipo: "+p1.getTipo());
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Escultura:");
		System.out.println("");
		System.out.println("Nombre: "+e1.getNombre());
		System.out.println("Valor: $"+e1.getValor());
		System.out.println("Peso: Kg"+e1.getPeso());
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Escultura:");
		System.out.println("");
		System.out.println("Nombre: "+f1.getNombre());
		System.out.println("Valor: $"+f1.getValor());
		System.out.println("Camara: "+f1.getCamara());

		System.out.println("-----------------------------------------------------------");
		
	}

}
