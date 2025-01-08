package clases;

public class Rep_mecanica extends Reparaciones {

	public Rep_mecanica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rep_mecanica(String desc) {
		super(desc, Tipo_Reparaciones.MECANICA);
		// TODO Auto-generated constructor stub
	}
	public double calculaPrecio() {
		double precio=0;
			precio = (30 * this.getHs()) + (this.getCostoMaterial()*1.1);
		return precio;
	}

}
