package Prueba;

import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

public class Logica {

	MySQL bd = new MySQL();

	public static void main(String[] args) {

		Ventana v1 = new Ventana();

		v1.setVisible(true);

	}

	public void boton(DefaultTableModel modelo) {

		bd.listar(modelo);

	}

}
