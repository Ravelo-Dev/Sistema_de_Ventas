package Mod_Consultas;

public class Ventas {
	private int Id;
	private String Cliente;
	private String Vendedor;
	private double Total;

	public Ventas() {
		
	}

	public Ventas(int id, String cliente, String vendedor, double total) {
		Id = id;
		Cliente = cliente;
		Vendedor = vendedor;
		Total = total;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public String getVendedor() {
		return Vendedor;
	}

	public void setVendedor(String vendedor) {
		Vendedor = vendedor;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}
	
	

}
