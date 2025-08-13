package Planilla;

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
	Persona[] persona = new Persona[10];

	public MiVentana1() {

		// Color colorFondo = new Color(24,63, 199);
		// Color colorLetras = new Color(61, 242, 255);
		// Color colorCosas = new Color(121, 224, 219);
		Font miFuente = new Font("Verdana", Font.CENTER_BASELINE, 14);

		this.setTitle("Registrar usuario");
		this.setSize(350, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new GridLayout(2, 1));


		JPanel panel1 = new JPanel();
		//panel1.setLayout(null);
		// panel1.setBackground(colorFondo);

		JLabel nombre = new JLabel("Nombre: ");
		nombre.setBounds(30, 30, 100, 30);
		// etiNombre.setForeground(colorLetras);
		nombre.setFont(miFuente);

		JTextField nombre2 = new JTextField(15);
		nombre2.setBounds(100, 30, 150, 30);
		// intNombre.setBackground(colorCosas);
		nombre2.setFont(miFuente);
		String n = nombre2.getText();

		JLabel apellido = new JLabel("Apellido: ");
		apellido.setBounds(30, 70, 100, 30);
		// etiApellido.setForeground(colorLetras);
		apellido.setFont(miFuente);

		JTextField apellido2 = new JTextField(15);
		apellido2.setBounds(100, 70, 150, 30);
		// intApellido.setBackground(colorCosas);
		apellido2.setFont(miFuente);
		// String a = apellido2.getText();

		/*JLabel cedula = new JLabel("Cedula: ");
		cedula.setBounds(30, 150, 100, 30);
		// etiEdad.setForeground(colorLetras);
		cedula.setFont(miFuente);

		JTextField cedula2 = new JTextField(15);
		cedula2.setBounds(100, 70, 200, 30);
		// intApellido.setBackground(colorCosas);
		cedula2.setFont(miFuente);
		// int c = Integer.parseInt(cedula2.getText());*/

		JLabel etiqueta = new JLabel();
		nombre.setBounds(30, 230, 100, 30);
		// etiNombre.setForeground(colorLetras);
		nombre.setFont(miFuente);

		JButton registrar = new JButton("Registrar");
		registrar.setBounds(30, 190, 150, 25);
		// botRegistrar.setBackground(colorLetras);
		registrar.setFont(miFuente);

		registrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				String n = nombre2.getText();
				String a = apellido2.getText();
				//int ci = Integer.parseInt(cedula2.getText());
				registrar(persona, n, a /*, ci*/);
				nombre2.setText("");
				apellido2.setText("");
			}
		});

		JButton mostrar = new JButton("Mostrar");
		mostrar.setBounds(200, 190, 150, 25);
		// botRegistrar.setBackground(colorLetras);
		mostrar.setFont(miFuente);

		mostrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < persona.length; i++) {
					if (persona[i] != null) {

						etiqueta.setText("Persona "+(i+1)+": " + persona[i].getNombre() + " " + persona[i].getApellido() /* + " cedula: " + persona[i].getCedula()*/);
								System.out.println("Persona "+(i+1)+": " + persona[i].getNombre() + " " + persona[i].getApellido()/* + " cedula: " + persona[i].getCedula()*/);
						
					} else {
						
					}

				}

			}
		});

		
		
		this.add(panel1);
		

		panel1.add(nombre);
		panel1.add(nombre2);
		panel1.add(apellido);
		panel1.add(apellido2);
		/*panel1.add(cedula);
		panel1.add(cedula2);*/
		panel1.add(registrar);
		panel1.add(mostrar);
		
		//panel1.add(etiqueta);

	}

	public static void registrar(Persona[] arr, String nom, String ape/*, int ci*/) {
			
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {

				arr[i] = new Persona(nom, ape/*, ci*/);
				break;

			}
		}
	}

}
