package Prueba;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Ventana extends JFrame {

	Logica gestor = new Logica();

	public Ventana() {

		this.setTitle("Prueba");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		JPanel panel = new JPanel();

		JButton boton = new JButton("Listar Productos");
		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("ID");
		modelo.addColumn("Producto");
		modelo.addColumn("Precio");

		JTable tabla = new JTable(modelo);
		tabla.setModel(modelo);
		JScrollPane scroll = new JScrollPane(tabla);

		this.add(panel);
		panel.add(boton);
		panel.add(scroll);

		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				gestor.boton(modelo);

			}
		});

	}
}
