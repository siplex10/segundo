package VentanaLayaut;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiVentana1 extends JFrame {

public MiVentana1() {
		
	
		Color colorFondo = new Color(24,63, 199);
		Color colorLetras = new Color(61, 242, 255);
		Color colorCosas = new Color(121, 224, 219);
		Font miFuente = new Font("Verdana", Font.CENTER_BASELINE, 14);
		
		this.setTitle("Registrar usuario"); 
		this.setSize(350, 400); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setResizable(false);
		this.setLayout(new GridLayout(1,1));
		
		
		JPanel panel1 = new JPanel(); 
		panel1.setLayout(null);
		panel1.setBackground(colorFondo);
		
		
		JLabel etiNombre = new JLabel("Nombre: "); 
		etiNombre.setBounds(30, 30, 100, 30);
		etiNombre.setForeground(colorLetras);
		etiNombre.setFont(miFuente);
		
		JTextField intNombre = new JTextField(15);
		intNombre.setBounds(100,30 , 200, 30);
		intNombre.setBackground(colorCosas);
		intNombre.setFont(miFuente);
		
		
		JLabel etiApellido = new JLabel("Apellido: "); 
		etiApellido.setBounds(30, 70, 100, 30);
		etiApellido.setForeground(colorLetras);
		etiApellido.setFont(miFuente);
		
		JTextField intApellido = new JTextField(15);
		intApellido.setBounds(100, 70, 200, 30);
		intApellido.setBackground(colorCosas);
		intApellido.setFont(miFuente);
		
		
		JLabel etiCedula = new JLabel("Cedula: "); 
		etiCedula.setBounds(30, 110, 100, 30);
		etiCedula.setForeground(colorLetras);
		etiCedula.setFont(miFuente);
		
		JTextField intCedula = new JTextField(15);
		intCedula.setBounds(100,110 , 200, 30);
		intCedula.setBackground(colorCosas);
		intCedula.setFont(miFuente);
		
		
		JLabel etiEdad = new JLabel("Edad: "); 
		etiEdad.setBounds(30, 150, 100, 30);
		etiEdad.setForeground(colorLetras);
		etiEdad.setFont(miFuente);
		
		
		JTextField intEdad = new JTextField(15);
		intEdad.setBounds(100, 150, 200, 30);
		intEdad.setBackground(colorCosas);
		intEdad.setFont(miFuente);
		
		 
		JLabel etiRol = new JLabel("Rol: "); 
		etiRol.setBounds(30, 190, 100, 30);
		etiRol.setForeground(colorLetras);
		etiRol.setFont(miFuente);
		
		
		String[] opciones = {"Cliente","Trabajador", "Administrador"};
		
		JComboBox<String> comRol = new JComboBox<>(opciones);
		comRol.setBounds(100, 190, 200, 30);
		comRol.setBackground(colorCosas);
		comRol.setFont(miFuente);
		
		JButton botRegistrar = new JButton("Registrar");
		botRegistrar.setBounds(30, 230, 150, 25);
		botRegistrar.setBackground(colorLetras);
		botRegistrar.setFont(miFuente);
		
		
		this.add(panel1);
		
		panel1.add(etiNombre);
		panel1.add(etiApellido);
		panel1.add(etiCedula);
		panel1.add(etiEdad);
		panel1.add(etiRol);
		panel1.add(comRol);
		panel1.add(intNombre);
		panel1.add(intApellido);
		panel1.add(intCedula);
		panel1.add(intEdad);
		panel1.add(botRegistrar);
		
		
		
		
		
		
		
		      
		
		
		
	}
	
}
