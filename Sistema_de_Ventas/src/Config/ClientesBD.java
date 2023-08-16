

package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import Mod_Consultas.*;

public class ClientesBD {
	Conexion co = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public boolean Registrar_Clientes(Clientes cl) {
		String sql = "INSERT INTO clientes (DNI, Nombre, Telefono, Direccion, Razon) VALUES (?, ?, ?, ?, ?)";

		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, cl.getDni());
			ps.setString(2, cl.getNombre());
			ps.setString(3, cl.getTelefono());
			ps.setString(4, cl.getDireccion());
			ps.setString(5, cl.getRazon());
			ps.execute();
			return true;
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, e.toString());
			return false;

		} /*
			 * finally { try { con.close(); } catch (SQLException e) {
			 * System.out.println(e.toString()); } }
			 */	

	}
	
	public List<Clientes> Listar_Clientes() {
		
		List<Clientes> Lista_de_Clientes = new ArrayList<Clientes>();
		String sql = "SELECT * FROM clientes";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Clientes cl = new Clientes();
				cl.setId(rs.getInt("Id"));
				cl.setDni(rs.getInt("DNI"));
				cl.setNombre(rs.getString("Nombre"));
				cl.setTelefono(rs.getString("Telefono"));
				cl.setDireccion(rs.getString("Direccion"));
				cl.setRazon(rs.getString("Razon"));
				Lista_de_Clientes.add(cl);
			}
		}catch (SQLException e) {
			System.out.println(e.toString());
		}
		return Lista_de_Clientes;
	}
	
	public boolean Eliminar_Clientes(int Id) {
		String sql = "DELETE FROM clientes WHERE Id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, Id);
			ps.execute();
			return true;
		}catch (SQLException e) {
			System.out.println(e.toString());
			return false;
		}
		
	}
	
	public boolean Actualizar_Clientes(Clientes cl) {
		String sql = "UPDATE clientes SET DNI = ?, Nombre = ? , Telefono = ?, Direccion = ?, Razon = ? WHERE Id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, cl.getDni());
			ps.setString(2, cl.getNombre());
			ps.setString(3, cl.getTelefono());
			ps.setString(4, cl.getDireccion());
			ps.setString(5, cl.getRazon());
			ps.setInt(6, cl.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.toString());
			return false;
		}
	}
	
	public Clientes  BuscarClientes(int dni) {
		Clientes cl = new Clientes();
		String sql = "SELECT * FROM clientes WHERE Dni = ?";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, cl.getDni());
			rs = ps.executeQuery();

			if(rs.next()) {
				cl.setNombre(rs.getString("Nombre"));
				cl.setTelefono(rs.getString("Telefono"));
				cl.setDireccion(rs.getString("Direccion"));
				cl.setRazon(rs.getString("razon"));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
		return cl;
	}
	
}

