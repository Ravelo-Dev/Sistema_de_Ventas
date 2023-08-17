package Mod_Abs;

public abstract class ProveedorABS {
	private int Id;
	private int Ruc;
	private String Nombre;
	private String Telefono;
	private String Direccion;
	private String Razon;
	
	public ProveedorABS() {
	
	}

	public ProveedorABS(int id, int ruc, String nombre, String telefono, String direccion, String razon) {
		Id = id;
		Ruc = ruc;
		Nombre = nombre;
		Telefono = telefono;
		Direccion = direccion;
		Razon = razon;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getRuc() {
		return Ruc;
	}


	public void setRuc(int ruc) {
		Ruc = ruc;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	public String getRazon() {
		return Razon;
	}


	public void setRazon(String razon) {
		Razon = razon;
	}
	
}
