package Mod_Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Config.Conexion;

public class ClienteDB {
	Conexion co = new Conexion();
	Connection con;
	PreparedStatement ps;

	
	public boolean InyeccionFormulario(Cliente cl)  {
		String sql = "INSERT INTO clientes (dni,nombre,telefono,direccion,razon) VALUES (?,?,?,?,?)";
		
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1,cl.getDni() );
			ps.setString(2,cl.getNombre());
			ps.setString(3, cl.getTelefono());
			ps.setString(4,cl.getDireccion() );
			ps.setString(5,cl.getRazon());
			ps.execute();
			return true;
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.toString());
			
		    return false;
		}finally{
			try {
				con.close();
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			
	}

	
	}

}

