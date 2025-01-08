package clases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import excepciones.CantidadInsuficiente;
import excepciones.ProductoInexistente;
import excepciones.ProductoRepetido;

public class Almacen {

	private HashMap<String,Producto> listaProductos;
	private HashMap<String,Integer> listaCantidades;
	
	Almacen(){
		setListaProductos(new HashMap<String,Producto>());
		setListaCantidades(new HashMap<String,Integer>());
	}
	
	public void nuevoProducto(String nombre, double precio, int cantidad) throws ProductoRepetido, ProductoInexistente {
		if(this.verificarProducto(nombre)) {
			throw new ProductoRepetido();
		}
		else {
		Producto producto = new Producto(nombre, precio);
		listaProductos.put(nombre, producto);
		this.añadirCantidad(nombre, cantidad);
		}
	}	
	

	private void añadirCantidad(String nombre, int cantidad) throws ProductoInexistente {
		if(this.verificarProducto(nombre)) {
			listaCantidades.put(nombre, cantidad);
		}
		else {
			throw new ProductoInexistente();
		}
	}
	

	public void recargarCantidad(String nombre, int cantidad) throws ProductoInexistente {
		if(this.verificarProducto(nombre)) {
			int cantidadActual = listaCantidades.get(nombre);
			cantidadActual = cantidadActual + cantidad;
			listaCantidades.put(nombre, cantidadActual);
		}
		else {
			throw new ProductoInexistente();
		}
	}		
	

	public Producto buscarProducto(String nombre) throws ProductoInexistente {
		if(this.verificarProducto(nombre)) {
			return listaProductos.get(nombre);
		}
		else {
			throw new ProductoInexistente();
		}
	}	
	

	private boolean verificarProducto(String nombre) {
		
		if(this.listaProductos.containsKey(nombre)) {
			return true;
		}
		else {
			return false;
		}	
	}
	

	public void retirarCantidad(int cantidad, String nombre) throws ProductoInexistente, CantidadInsuficiente {
		if(this.verificarProducto(nombre)) {
			 int cantidadActual = this.listaCantidades.get(nombre);
			 cantidadActual = cantidadActual - cantidad;
			 if(cantidadActual>0) {
				 this.listaCantidades.replace(nombre, cantidadActual);
			 }
			 else {
				 throw new CantidadInsuficiente();
			 }
		}
		else {
			throw new ProductoInexistente();
		}
	}
	
	
	public String toString() {
		
		String imprimir ="";
		 for (Entry<String, Producto> entry : listaProductos.entrySet()) {
	            String key = entry.getKey();
	            Producto value = entry.getValue();
	            imprimir = imprimir + value + " Cantidad: " + listaCantidades.get(key) + "\n";
	           
	        }
		return imprimir;
	}

	
	
	
	private void setListaProductos(HashMap<String,Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	private void setListaCantidades(HashMap<String,Integer> listaCantidades) {
		this.listaCantidades = listaCantidades;
	}
	
	
	
	
}
