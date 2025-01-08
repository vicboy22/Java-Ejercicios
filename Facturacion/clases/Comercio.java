package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import excepciones.CantidadInsuficiente;
import excepciones.ClienteInexistente;
import excepciones.ClienteRepetido;
import excepciones.ClienteSinPedido;
import excepciones.ProductoInexistente;
import excepciones.ProductoRepetido;

public class Comercio {
	
	private	Almacen almacenProductos;
	private	HashMap<String, Cliente> listaClientes;
	private	HashMap<String, Factura> listaFacturas;
	
	public Comercio(){
		almacenProductos = new Almacen();
		listaClientes = new HashMap<String, Cliente>();
		listaFacturas = new HashMap<String, Factura>();
	}
	public String mostrarProductos() {
		String imprimir = "";
		imprimir = almacenProductos.toString();
		return imprimir;
	}
	
	public void añadirCliente(String nombre,String dni,double descuento) throws ClienteRepetido {
		if(verificarCliente(dni)) {
			throw new ClienteRepetido();
		}else {
			Cliente nuevoCliente = new Cliente(descuento,nombre,dni);
			listaClientes.put(dni, nuevoCliente);
		}
	}
	public void generarFactura(String dni) throws ClienteInexistente, ClienteSinPedido {
		if(verificarCliente(dni)) {
			Cliente clientePedido = this.buscarCliente(dni);
			this.añadirFactura(dni, clientePedido.pedidosParaFactura(), clientePedido.getDescuento());
			clientePedido.vaciarPedido();
		}else {
			throw new ClienteInexistente();
		}
	}
	public void generaPedido(String dni,int cantidad,String nombreProducto) throws ClienteInexistente, ProductoInexistente, CantidadInsuficiente {
		if(this.verificarCliente(dni)) {
			Cliente clientePedido = this.buscarCliente(dni);
			Producto productoPedido = almacenProductos.buscarProducto(nombreProducto);
			almacenProductos.retirarCantidad(cantidad, nombreProducto);
			clientePedido.nuevoPedido(productoPedido, cantidad);
		}
		else {
			throw new ClienteInexistente();
		}
	}
	private Cliente buscarCliente(String dni) {
		return listaClientes.get(dni);
	}
	public void añadirProducto(String nombre,int cantidad,double precio) throws ProductoRepetido, ProductoInexistente {
		almacenProductos.nuevoProducto(nombre, precio, cantidad);
	}
	public void añadirCantidad(String nombre,int cantidad) throws ProductoRepetido, ProductoInexistente {
		almacenProductos.recargarCantidad(nombre, cantidad);
	}
	private boolean verificarCliente(String dni) {
		if(listaClientes.containsKey(dni)) {
			return true;
		}
		else {
			return false;
		}
	}
	public String buscarFacturasCliente(String dni) {
		String imprimir = "";
		/*Iterator listaFacturasIterable = (Iterator)listaFacturas;
		while (listaFacturasIterable.hasNext()) {
			String dniFactura= ((Factura) listaFacturasIterable.next()).cliente();
			if(dniFactura.equals(dni)) {
				String numeroFactura = ((Factura)listaFacturasIterable.next()).getN_facturacion();
				imprimir = imprimir + numeroFactura  + "\n";
			}*/
			for (Entry<String, Factura> entry : listaFacturas.entrySet()) {
	            String key = entry.getKey();
	            Factura value = entry.getValue();
	            imprimir = imprimir + value.toString() + "\n";
	        }
		return imprimir;
	}
	private void añadirFactura(String cliente, ArrayList<Pedido> lista, double descuento) {
		Factura nuevaFactura = new Factura(cliente, lista, descuento);
		listaFacturas.put(nuevaFactura.getN_facturacion(), nuevaFactura);
	}
}
