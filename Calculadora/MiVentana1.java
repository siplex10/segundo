package Calculadora;

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
	Calculadora calculadora = new Calculadora(0,0);

	public MiVentana1() {


		this.setTitle("Registrar usuario");
		this.setSize(300, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new GridLayout(2, 1));


		JPanel panel1 = new JPanel();
		

		JLabel etiNumero1 = new JLabel("Numero 1: ");
		JTextField ingNumero1 = new JTextField(15);
		
		JLabel etiNumero2 = new JLabel("Numero 2: ");
		JTextField ingNumero2 = new JTextField(15);
		

		JLabel etiqueta = new JLabel();
	

		JButton suma = new JButton("+");
		

		suma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				double num1 = Integer.parseInt(ingNumero1.getText());
				double num2 = Integer.parseInt(ingNumero2.getText());
				
				registrar(calculadora, num1, num2 );
				//ingNumero1.setText("");
				//ingNumero2.setText("");
				
				etiqueta.setText("Resultado de la suma: "+ (num1+num2));
				System.out.println("Resultado de la suma: "+ (num1+num2));
		
				
			}
		});

		JButton resta = new JButton("-");
		

		resta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				double num1 = Integer.parseInt(ingNumero1.getText());
				double num2 = Integer.parseInt(ingNumero2.getText());
				
				registrar(calculadora, num1, num2 );
				//ingNumero1.setText("");
				//ingNumero2.setText("");
				
				etiqueta.setText("Resultado de la resta: "+ (num1-num2));
				System.out.println("Resultado de la resta: "+ (num1-num2));
		
				
			}
		});

		
		JButton por = new JButton("x");
		

		por.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				double num1 = Integer.parseInt(ingNumero1.getText());
				double num2 = Integer.parseInt(ingNumero2.getText());
				
				registrar(calculadora, num1, num2 );
				//ingNumero1.setText("");
				//ingNumero2.setText("");
				
				etiqueta.setText("Resultado de la multiplicasion: "+ (num1*num2));
				System.out.println("Resultado de la multiplicasion: "+ (num1*num2));
		
				
			}
		});
		
		
		JButton divi = new JButton("÷");
		

		divi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
				double num1 = Integer.parseInt(ingNumero1.getText());
				double num2 = Integer.parseInt(ingNumero2.getText());
				
				registrar(calculadora, num1, num2 );
				//ingNumero1.setText("");
				//ingNumero2.setText("");
				
				etiqueta.setText("Resultado de la divicion: "+ (num1/num2));
				System.out.println("Resultado de la divicion: "+ (num1/num2));
		
				
			}
		});
		
		
		
		this.add(panel1);
		panel1.add(etiNumero1);
		panel1.add(ingNumero1);
		panel1.add(etiNumero2);
		panel1.add(ingNumero2);
		panel1.add(suma);
		panel1.add(resta);
		panel1.add(por);
		panel1.add(divi);
		panel1.add(etiqueta);

		

	}

	public static void registrar(Calculadora calculadora, double num1, double num2) {
			
		

				calculadora = new Calculadora(num1, num2);
				

			}
		
	}


