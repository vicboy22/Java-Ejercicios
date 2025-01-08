package manejoProductos;

import java.util.ArrayList;


public class CajaProductos {
	ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	ArrayList<Integer> cantProductos = new ArrayList<Integer>();
	
	public CajaProductos() {}
	public CajaProductos(ArrayList<Producto> listaProductos){
		this.listaProductos = listaProductos;
	}
	//devulve el index si exite producto con ese id con >=1 unidad
	public int hayProductos(int id) {
		for (int i = 0; i < listaProductos.size(); i++) {
			int idProducto = listaProductos.get(i).getId();
			int cantDelProducto = cantProductos.get(i);
			if(idProducto == id && cantDelProducto > 0) {
				return i;
			}
		}
		
		return -1;
	}
	
	//Devuelve string con todos los productos
	public String recorrer_Producto() {
		String imprimir="";
		for (int i = 0; i < listaProductos.size(); i++) {
			imprimir = imprimir + listaProductos.get(i).toString() + " Cantidad " + cantProductos.get(i) + "\n";
			}
		return imprimir;
	}
	//Al pasarle un id mira en la lista y devuelve el precio en centimos
	public int damePrecioDelProducto(int id) {
		int precioCentimos=0;
		int i = this.hayProductos(id);
		int precioBruto = listaProductos.get(i).getPrecio();
		precioCentimos = precioBruto * 100;
		return precioCentimos;

	}
	public void retirarUnidad(int id) {
		int i = this.hayProductos(id);
		int cantidad = this.cantProductos.get(i) -1;
		this.cantProductos.set(i, cantidad);
	}
	
	
	
}
