package Config;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Conexion {
	Connection Con;
	
	public Conexion () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_de_ventas", "root", "");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Conexion no establecida" + e.getMessage());
		}
	}
	
	public Connection getConnection() {
		return Con;
	}
}
