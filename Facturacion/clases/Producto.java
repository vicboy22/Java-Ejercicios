package clases;

public class Producto {

	private String nombre;
	private double precio;
	
	public Producto(String nombre,double precio){
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	double getPrecio() {
		return precio;
	}

	void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return String.format("Producto: %10s   Precio: %10.2f", this.nombre,this.precio);
	}
	
}
