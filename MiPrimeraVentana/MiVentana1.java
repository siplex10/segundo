package TuPrimeraVentanaYComponentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiVentana1 extends JFrame {

public MiVentana1() {
		
		
		
		
		
		this.setTitle("Ventana de prueba - Ramiro Sosa"); 
		this.setSize(500, 300); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setResizable(false);
		this.setLayout(new GridLayout(1,1));
		
		JPanel panel1 = new JPanel(); 
		panel1.setLayout(null);
		Color colorFondo = new Color(24,63, 199);
		panel1.setBackground(colorFondo);
		
		
		JLabel etiBienvenida = new JLabel("Bienvenido a mi programa: "); 
		etiBienvenida.setBounds(30, 30, 300, 30);
		Color colorLetras = new Color(61, 242, 255);
		etiBienvenida.setForeground(colorLetras);
		Font miFuente = new Font("Verdana", Font.CENTER_BASELINE, 14);
		etiBienvenida.setFont(miFuente);
		
		
		JLabel etiNombre = new JLabel("Nombre: "); 
		etiNombre.setBounds(30, 68, 100, 30);
		etiNombre.setForeground(colorLetras);
		etiNombre.setFont(miFuente);
		 
		JTextField inpNombre = new JTextField(15);
		inpNombre.setBounds(100, 68, 200, 30);
		inpNombre.setText("Ingrese aqui su nombre");
		inpNombre.setForeground(colorFondo);
		
		
		JButton botAceptar = new JButton("Aceptar");
		botAceptar.setBounds(200, 120, 100, 30);
		botAceptar.setBackground(colorLetras);
		botAceptar.setForeground(colorFondo);
		
		this.add(panel1);
		panel1.add(etiBienvenida);
		panel1.add(etiNombre);
		panel1.add(inpNombre);
		panel1.add(botAceptar);
		
		
		
		
		
		      
		
		
		
	}
	
}
