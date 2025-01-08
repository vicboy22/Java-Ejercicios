package clases;

import java.util.ArrayList;

import excepciones.ClienteSinPedido;

public class Cliente {
	
	private double descuento;
	private String nombre;
	private String dni;
	private ArrayList<Pedido> listaPedidos;
	
	public Cliente(double descuento, String nombre, String dni) {
		this.descuento =descuento;
		this.dni = dni;
		this.nombre = nombre;
		listaPedidos = new ArrayList<Pedido>();
	}

	
	public void nuevoPedido(Producto producto, int cantidad) {
		Pedido nuevoPedido = new Pedido(producto,cantidad);
		listaPedidos.add(nuevoPedido);
	}
	public void vaciarPedido() {
		listaPedidos.clear();
	}
	public ArrayList<Pedido> pedidosParaFactura() throws ClienteSinPedido {
		if (listaPedidos.isEmpty()) {
			throw new ClienteSinPedido();
		}
		else {
		ArrayList<Pedido> listaPedidos2 = new ArrayList<>();
		listaPedidos2 = listaPedidos;
		return listaPedidos2;
		}
	}
	/**
	 * @return the descuento
	 */
	double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return the nombre
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the dni
	 */
	String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the listaPedidos
	 */
	ArrayList<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	/**
	 * @param listaPedidos the listaPedidos to set
	 */
	void setListaPedidos(ArrayList<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
}
