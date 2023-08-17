package Mod_Abs;

public abstract class ProductosABS {
	private int Id;
	private String Codigo;
	private String Nombre;
	private String Proveedor;
	private int Stock;
	private double Precio;
	
	
	public ProductosABS() {
		
	}


	public ProductosABS(int id, String codigo, String nombre, String proveedor, int stock, double precio) {
		Id = id;
		Codigo = codigo;
		Nombre = nombre;
		Proveedor = proveedor;
		Stock = stock;
		Precio = precio;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getCodigo() {
		return Codigo;
	}


	public void setCodigo(String codigo) {
		Codigo = codigo;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getProveedor() {
		return Proveedor;
	}


	public void setProveedor(String proveedor) {
		Proveedor = proveedor;
	}


	public int getStock() {
		return Stock;
	}


	public void setStock(int stock) {
		Stock = stock;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	
}
