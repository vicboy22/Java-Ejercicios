package clases;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Factura {

	
	private	String cliente;
	private ArrayList<Pedido> listaPedidosFactura;
	private String n_facturacion;
	private double descuento;
	private String productosFormateados;
	
	public Factura(String cliente, ArrayList<Pedido> lista, double descuento){
		this.n_facturacion = this.generarNumeroFactura();
		this.cliente =cliente;
		this.listaPedidosFactura =lista;
		this.descuento = descuento;
		if(descuento < 10) {
			this.descuento=10;
		}
		productosFormateados = this.formatearProductos();
	}

	private String generarNumeroFactura() {
		LocalDateTime fechaActual = LocalDateTime.now();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("MMddHHmm");
		String n_factura = fechaActual.format(formatoFecha);
		
		return n_factura;
		
	}
	
	public String toString() {
		//Contiuar con esto y seguir String.format
		String imprimir = "";
		imprimir = String.format("Cliente: %10s", cliente);
		imprimir = imprimir + "\n"  + String.format("Factura nº: %10s", n_facturacion);
		imprimir = imprimir + "\n"  + String.format("%10s %10s %10s %10s %10s", "Producto", "Unidades",  "Precio", "Descuento", "Subtotal");
		imprimir = imprimir + "\n"  + "------------------------------------------------------ \n";
		imprimir = imprimir + productosFormateados;
		
		return imprimir;
	}
	
	
	private String formatearProductos() {
		String imprimir ="";
		double subtotal =0;
		for (Pedido c : listaPedidosFactura) {
			String nombreProducto = c.getNombreProductos();
			int unidadesProducto =  c.getCantidad();
			double precioProducto = c.getPrecioProductos();
			double subtotalProducto = (precioProducto * unidadesProducto) - ((precioProducto * unidadesProducto)*descuento/100);
			subtotal = subtotal + subtotalProducto;
			imprimir =imprimir + String.format("%10s %10d %10.2f %10.2f %10.2f", nombreProducto, unidadesProducto, precioProducto , this.descuento, subtotalProducto);
			imprimir = imprimir + "\n";
		}
		imprimir = imprimir + "------------------------------------------------------ \n";
		imprimir = imprimir + String.format("Subtotal: %4.2f \n", subtotal);
		double iva = (subtotal*21/100);
		imprimir = imprimir + String.format("Iva 21: %4.2f", iva);
		return imprimir;
	}
	
	
	
	
	
	
	public String getN_facturacion() {
		return n_facturacion;
	}
	public ArrayList<Pedido> getListaPedidos() {
		return listaPedidosFactura;
	}

	public String cliente() {
		return cliente;
	}
	public void setDniCliente(String dniCliente) {
		this.cliente = dniCliente;
	}
	
	
	
	
	
}
