package clases;

public class Rep_chapa_pintura extends Reparaciones {

	public Rep_chapa_pintura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rep_chapa_pintura(String desc) {
		super(desc, Tipo_Reparaciones.CHAPA_PINTURA);
		// TODO Auto-generated constructor stub
	}

	public double calculaPrecio() {
		double precio=0;
			precio = (30 * this.getHs()) + (this.getCostoMaterial()*1.3);
		return precio;
	}

}
