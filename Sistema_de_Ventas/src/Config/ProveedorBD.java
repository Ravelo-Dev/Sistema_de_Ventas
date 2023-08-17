package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Mod_Consultas.*;

public class ProveedorBD {
	Conexion co = new Conexion();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public boolean Registrar_Proveedores(Proveedor pd) {
		String sql = "INSERT INTO proveedores (RUC, Nombre, Telefono, Direccion, Razon) VALUES (?, ?, ?, ?, ?)";

		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, pd.getRuc());
			ps.setString(2, pd.getNombre());
			ps.setString(3, pd.getTelefono());
			ps.setString(4, pd.getDireccion());
			ps.setString(5, pd.getRazon());
			ps.execute();
			return true;
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, e.toString());
			return false;
		}
		
	}
	
	public List<Proveedor> Listar_Proveedores() {
		
		List<Proveedor> Lista_de_Proveedores = new ArrayList<Proveedor>();
		String sql = "SELECT * FROM proveedores";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Proveedor pd = new Proveedor();
				pd.setId(rs.getInt("Id"));
				pd.setRuc(rs.getInt("RUC"));
				pd.setNombre(rs.getString("Nombre"));
				pd.setTelefono(rs.getString("Telefono"));
				pd.setDireccion(rs.getString("Direccion"));
				pd.setRazon(rs.getString("Razon"));
				Lista_de_Proveedores.add(pd);
			}
		}catch (SQLException e) {
			System.out.println(e.toString());
		}
		return Lista_de_Proveedores;
	}
	
	public boolean Eliminar_Proveedores(int Id) {
		String sql = "DELETE FROM Proveedores WHERE Id = ?";
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
	
	public boolean Actualizar_Proveedores(Proveedor pd) {
		String sql = "UPDATE Proveedores SET RUC = ?, Nombre = ? , Telefono = ?, Direccion = ?, Razon = ? WHERE Id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, pd.getRuc());
			ps.setString(2, pd.getNombre());
			ps.setString(3, pd.getTelefono());
			ps.setString(4, pd.getDireccion());
			ps.setString(5, pd.getRazon());
			ps.setInt(6, pd.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.toString());
			return false;
		}
	}
	
}
