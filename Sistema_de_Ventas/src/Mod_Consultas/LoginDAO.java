package Mod_Consultas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	
	Connection Con;
	java.sql.PreparedStatement Ps;
	ResultSet Rs;
	Conexion Cxn = new Conexion();
	
	public Login Log(String Correo, String Pass) {
		Login L = new Login();
		String Sql = "SELECT * FROM usuarios WHERE Correo = ? AND Pass = ?";
		try {
			Con = Cxn.getConnection();
			Ps = Con.prepareStatement(Sql);
			Ps.setString(1, Correo);
			Ps.setString(2, Pass);
			Rs = Ps.executeQuery();
			if (Rs.next()) {
				L.setId(Rs.getInt("Id"));
				L.setNombre(Rs.getString("Nombre"));
				L.setCorreo(Rs.getString("Correo"));
				L.setPass(Rs.getString("Pass"));
			}
			
		} catch (SQLException e) {
			System.out.println(e.toString());
			
		}
		return L;		
	}

}
