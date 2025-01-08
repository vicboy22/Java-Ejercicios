package clases;

public class Revisiones extends Trabajo {
	public Revisiones() {
		super();
	}
	Revisiones(String desc){
		super(desc);
	}
	public double calculaPrecio() {
 		double precio=0;
 		precio = (30 * this.getHs()) + 20;
 		return precio;
 	};
}
