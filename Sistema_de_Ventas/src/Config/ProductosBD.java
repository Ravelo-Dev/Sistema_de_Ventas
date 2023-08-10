package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Mod_Consultas.Clientes;
import Mod_Consultas.Productos;

public class ProductosBD {
	
	Connection con;
	Conexion co = new Conexion();
	PreparedStatement ps;
	ResultSet rs;
	
	public boolean Registrar_Productos(Productos prod) {
		String sql = "INSERT INTO productos (Codigo, Nombre, Proveedor, Stock, Precio) VALUES (?, ?, ?, ?, ?)";
		
		try {
			con  = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, prod.getCodigo());
			ps.setString(2, prod.getNombre());
			ps.setString(3, prod.getProveedor());
			ps.setInt(4, prod.getStock());
			ps.setDouble(5, prod.getPrecio());
			ps.execute();
			return true;
		} catch (SQLException e) {
			System.out.println(e.toString());
			return false;
		}
		
		
	}

	
	public void Consultar_Proveedor(JComboBox<String> proveedor) {
		String sql = "SELECT Nombre From proveedores";
		try {
			 con = co.getConnection();
			 ps = con.prepareStatement(sql);
			 rs = ps.executeQuery();
			 while (rs.next()) {
				 proveedor.addItem(rs.getString("Nombre"));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<Productos> Listar_Productos() {
		
		List<Productos> Lista_de_Productos = new ArrayList<Productos>();
		String sql = "SELECT * FROM Productos";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Productos prd = new Productos();
				prd.setId(rs.getInt("Id"));
				prd.setCodigo(rs.getString("Codigo"));
				prd.setNombre(rs.getString("Nombre"));
				prd.setProveedor(rs.getString("Proveedor"));
				prd.setStock(rs.getInt("Stock"));
				prd.setPrecio(rs.getDouble("Precio"));
				Lista_de_Productos.add(prd);
			}
		}catch (SQLException e) {
			System.out.println(e.toString());
		}
		return Lista_de_Productos;
	}
	
	public boolean Eliminar_Productos(int Id) {
		String sql = "DELETE FROM productos WHERE Id = ?";
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
	
	public boolean Actualizar_Productos(Productos prod) {
		String sql = "UPDATE productos SET Codigo = ?, Nombre = ? , Proveedor = ?, Stock = ?, Precio = ? WHERE Id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, prod.getCodigo());
			ps.setString(2, prod.getNombre());
			ps.setString(3, prod.getProveedor());
			ps.setInt(4, prod.getStock());
			ps.setDouble(5, prod.getPrecio());
			ps.setInt(6, prod.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.toString());
			return false;
		}
	}
	
	/*public Productos Buscar_Producto(String codigo) {
		Productos productos = new Productos();
		String sql = "SELECT * FROM productos WHERE codigo = ?";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, codigo);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				productos.setNombre(rs.getString("Nombre"));
				productos.setPrecio(rs.getDouble("precio"));
				productos.setStock(rs.getInt("Stock"));
			}
		}catch(Exception e) {
			
			System.out.println(e.toString());
		}
		return productos;
	}*/
}


