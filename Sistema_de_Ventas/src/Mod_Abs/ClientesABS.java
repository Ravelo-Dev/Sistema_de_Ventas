package Mod_Abs;

public abstract class ClientesABS {
	private int Id;
	private int Dni;
	private String Nombre;
	private String Telefono;
	private String Direccion;
	
	
	public ClientesABS() {
		
	}


	public ClientesABS(int id, int dni, String nombre, String telefono, String direccion) {
		Id = id;
		Dni = dni;
		Nombre = nombre;
		Telefono = telefono;
		Direccion = direccion;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getDni() {
		return Dni;
	}


	public void setDni(int dni) {
		Dni = dni;
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


}
