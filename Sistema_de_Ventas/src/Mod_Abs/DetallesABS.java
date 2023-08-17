package Mod_Abs;

public abstract class DetallesABS {
	private int Id;
	private String Cod_Producto;
	private int Cantidad;
	private double Precio;
	private int Id_Venta;
	
	
	public DetallesABS() {
		
	}


	public DetallesABS(int id, String cod_Producto, int cantidad, double precio, int id_Venta) {
		Id = id;
		Cod_Producto = cod_Producto;
		Cantidad = cantidad;
		Precio = precio;
		Id_Venta = id_Venta;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getCod_Producto() {
		return Cod_Producto;
	}


	public void setCod_Producto(String cod_Producto) {
		Cod_Producto = cod_Producto;
	}


	public int getCantidad() {
		return Cantidad;
	}


	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}


	public int getId_Venta() {
		return Id_Venta;
	}


	public void setId_Venta(int id_Venta) {
		Id_Venta = id_Venta;
	}
	
	
}
