package LaBiblioteca;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class MiVentana1 extends JFrame {
	

	public MiVentana1() {

		Font miFuente = new Font("Verdana", Font.CENTER_BASELINE, 14);

		this.setTitle("Registrar usuario");
		this.setSize(250, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new GridLayout(2, 1));


		JPanel panel1 = new JPanel();
	

		JLabel isbn1 = new JLabel("ISBN: ");
		
		JTextField isbn2 = new JTextField(15);
		

		JLabel titulo1 = new JLabel("Titulo: ");
		
		JTextField titulo2 = new JTextField(15);
		
		JLabel autor1 = new JLabel("Autor: ");
		
		JTextField autor2 = new JTextField(15);
		
		JLabel etiqueta = new JLabel();
		

		Libro[] libro = new Libro[10];
		
		JButton registrar = new JButton("Registrar");
		
		registrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				
				Gestor.guardar(libro, isbn2,titulo2,autor2);
				
				etiqueta.setText("Guardado exitosamente");
			}
		});

		
		
		JButton mostrar = new JButton("Mostrar");
		

		mostrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Gestor.mostrar( libro);
				

			}
		});

		
		
		this.add(panel1);
		
		panel1.add(isbn1);
		panel1.add(isbn2);
		panel1.add(titulo1);
		panel1.add(titulo2);
		panel1.add(autor1);
		panel1.add(autor2);
		panel1.add(registrar);
		panel1.add(mostrar);
		panel1.add(etiqueta);

		
	}

	
}
