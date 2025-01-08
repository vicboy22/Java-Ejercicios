package manejoProductos;

public class Producto {

	private int id;
	private int precio;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return "Producto: " + this.nombre + " Id: " + this.id + " Precio: " + this.precio;
	}
	
	
	
	
	
	
	
}
