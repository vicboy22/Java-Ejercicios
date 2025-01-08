package main;

import java.util.ArrayList;

import clases.Cliente;
import clases.Comercio;
import clases.Factura;
import clases.Pedido;
import clases.Producto;
import excepciones.CantidadInsuficiente;
import excepciones.ClienteInexistente;
import excepciones.ClienteRepetido;
import excepciones.ClienteSinPedido;
import excepciones.ProductoInexistente;
import excepciones.ProductoRepetido;

public class PruebaFacturacion {

	public static void main(String[] args) throws ProductoRepetido, ProductoInexistente, ClienteInexistente, CantidadInsuficiente, ClienteRepetido, ClienteSinPedido {
		Comercio nuevoComercio = new Comercio();
		Producto producto1 = new Producto("Coca-Cola",25.3);
		Producto producto2 = new Producto("Fanta",15.2);
		Producto producto3 = new Producto("Sprite",10.2);
		Pedido pedido = new Pedido(producto1,4);
		Pedido pedido1 = new Pedido(producto2,1);
		Pedido pedido2 = new Pedido(producto3,14);
		ArrayList<Pedido> lista = new ArrayList<Pedido>();
		lista.add(pedido2);
		lista.add(pedido);
		lista.add(pedido1);
		Cliente cliente = new Cliente(10,"Juan perez", "1s");
		nuevoComercio.añadirCliente("pepe", "1s", 0);
		Factura nuevafactura = new Factura("pepe martinez", lista, 15);
		System.out.println(nuevafactura);
		nuevoComercio.añadirProducto("Cocacola", 8, 1.6);
		nuevoComercio.añadirProducto("Sprite", 8, 1.9);
		System.out.println(nuevoComercio.mostrarProductos());
		System.out.println(nuevoComercio.buscarFacturasCliente(null));
		
		nuevoComercio.generaPedido("1s", 5, "Sprite");
		nuevoComercio.generaPedido("1s", 5, "Cocacola");
		nuevoComercio.generarFactura("1s");
		System.out.println(nuevoComercio.buscarFacturasCliente("1s"));
		nuevoComercio.generaPedido("1s", 1, "Cocacola");
		nuevoComercio.generarFactura("1s");
		System.out.println(nuevoComercio.buscarFacturasCliente("1s"));
	}

}
