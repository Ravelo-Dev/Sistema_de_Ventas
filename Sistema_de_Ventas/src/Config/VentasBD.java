package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Mod_Consultas.Detalles;
import Mod_Consultas.Proveedor;
import Mod_Consultas.Ventas;

public class VentasBD {
	
	Connection con;
	Conexion co = new Conexion();
	PreparedStatement ps;
	ResultSet rs;
	int R;
	
	public int Registrar_Venta(Ventas v) {
		String sql = "INSERT INTO ventas (Cliente, Vendedor, Total) VALUES (?,?,?)";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, v.getCliente());
			ps.setString(2, v.getVendedor());
			ps.setDouble(3, v.getTotal());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		return R;
	}
	
	public int Registrar_Detalle(Detalles Dv) {
		String sql = "INSERT INTO detalle (Cod_producto, Cantidad, Precio, Id_Venta) VALUES (?, ?, ?, ?)";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, Dv.getCod_Producto());
			ps.setInt(2, Dv.getCantidad());
			ps.setDouble(3, Dv.getPrecio());
			ps.setInt(4, Dv.getId_Venta());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		return R;
	}
	
	public int ID_Venta() {
		int Id = 0;
		String sql = "SELECT MAX(Id) FROM ventas";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				Id = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		return Id;
		
	}
	
	public boolean Actualizar_STOCK(int Cantidad, String Codigo) {
		String sql = "UPDATE productos SET Stock = ? WHERE Codigo = ?";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, Cantidad);
			ps.setString(2, Codigo);
			ps.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			return false;
		}
	}
	
	public List<Ventas> Listar_Ventas() {
		
		List<Ventas> Lista_de_Ventas = new ArrayList<Ventas>();
		String sql = "SELECT * FROM ventas";
		try {
			con = co.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Ventas vnt = new Ventas();
				vnt.setId(rs.getInt("Id"));
				vnt.setCliente(rs.getString("Cliente"));
				vnt.setVendedor(rs.getString("Vendedor"));
				vnt.setTotal(rs.getDouble("Total"));
				Lista_de_Ventas.add(vnt);
			}
		}catch (SQLException e) {
			System.out.println(e.toString());
		}
		return Lista_de_Ventas;
	}
	
}
