package Prueba;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class MySQL {

	private final String URL = "jdbc:mysql://23.111.185.242/program1_avanzada?useSSL=false";
	private final String USR = "program1_estudiantes";
	private final String USS = "estudiantesarrayanes";

	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USR, USS);
	}

	public void listar(DefaultTableModel modelo) {
		String sentencia = "SELECT  id,  producto,  precio FROM productos";

		try {
			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String producto = rs.getString(2);
				int precio = rs.getInt(3);
				
				Object[] fila = {id, producto, precio};
				modelo.addRow(fila);

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error " + e);

		}

	}

}
