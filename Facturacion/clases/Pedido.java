package clases;

public class Pedido {

	private Producto productos;
	private int cantidad;
	
	public Pedido(Producto producto, int cantidad){
		this.setProductos(producto);
		this.setCantidad(cantidad);
	}

	
	
	
	
	public String getNombreProductos() {
		return productos.getNombre();
	}
	public double getPrecioProductos() {
		return productos.getPrecio();
	}


	public void setProductos(Producto productos) {
		this.productos = productos;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
