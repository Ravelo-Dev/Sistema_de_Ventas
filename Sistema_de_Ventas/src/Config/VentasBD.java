package Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Mod_Consultas.Detalles;
import Mod_Consultas.Ventas;

public class VentasBD {
	
	Connection con;
	Conexion co = new Conexion();
	PreparedStatement ps;
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
			e.printStackTrace();
		}
		return R;
	}
	
}
