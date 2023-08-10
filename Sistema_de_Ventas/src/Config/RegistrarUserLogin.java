package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Mod_Consultas.Usuarios;

public class RegistrarUserLogin {
	Conexion co = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public boolean Registrar_Usuarios(Usuarios User) {
		String sql = "INSERT INTO usuarios (Nombre, Correo, Pass) VALUES (?, ?, ?)";

		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, User.getNombre());
			ps.setString(2, User.getCorreo());
			ps.setString(3, User.getPass());
			ps.execute();
			return true;
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, e.toString());
			return false;

		} 
	}
}
