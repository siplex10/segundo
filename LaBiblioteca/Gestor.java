package LaBiblioteca;

import javax.swing.JLabel;
import javax.swing.JTextField;





public class Gestor {

	public static void main(String[] args) {
		
		MiVentana1 ventana1 = new MiVentana1();
		ventana1.setVisible(true);

		
		
		
		
	}
	
	
	public static void guardar(Libro[] libro,JTextField isbn2,JTextField titulo2,JTextField autor2) {
		
		
	String isbn = isbn2.getText();
	String titulo = isbn2.getText();
	String autor = isbn2.getText();
		
	for (int i = 0; i < libro.length; i++) {
    	
		if (libro[i] == null) {
			
			libro[i] = new Libro(isbn,titulo,autor);
				
			 System.out.println("Se guardó exitosamente");
			 
			 isbn2.setText("");
			 titulo2.setText("");
			 autor2.setText("");
					
			break;
			
			
		} else {
		}
	}
	
}
	
public static void mostrar(Libro[] libro) {
		
		
		for (int a = 0; a < libro.length; a++) {
			if (libro[a] != null) {
		
		System.out.println("Libro "+(a+1)+": " + libro[a].getIsbn() + " " + libro[a].getTitulo() + " " + libro[a].getAutor());
		 }
	}

	
	
	}
}