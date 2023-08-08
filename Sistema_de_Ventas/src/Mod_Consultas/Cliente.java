package Mod_Consultas;

public class Cliente {
	
	private int Dni;
	private String nombre;
	private String Telefono;
	private String Direccion;
	private String Razon;
	
	
	public Cliente() {
		
	}


	
	public Cliente(int dni, String nombre, String telefono, String direccion, String razon) {
		
		this.Dni = dni;
		this.nombre = nombre;
		this.Telefono = telefono;
		this.Direccion = direccion;
		this.Razon = razon;
	}



	public int getDni() {
		return Dni;
	}



	public void setDni(int dni) {
		Dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
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
