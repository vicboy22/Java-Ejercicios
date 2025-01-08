package clases;

public abstract class Reparaciones extends Trabajo {
	private Tipo_Reparaciones tipo_reparacion;
	private double costo_material;
	Reparaciones(){
		super();
		this.setTipo_reparacion(Tipo_Reparaciones.CHAPA_PINTURA);
		this.setCostoMaterial(0);
	}
	Reparaciones(String desc, Tipo_Reparaciones tipo ){
		super(desc);
		this.setCostoMaterial(0);
		this.setTipo_reparacion(tipo);
	}
	/**
	 * @return the tipo_reparacion
	 */
	public Tipo_Reparaciones getTipo_reparacion() {
		return tipo_reparacion;
	}
	/**
	 * @param tipo_reparacion the tipo_reparacion to set
	 */
	public void setTipo_reparacion(Tipo_Reparaciones tipo_reparacion) {
		this.tipo_reparacion = tipo_reparacion;
	}
	/**
	 * @return the costo_rep
	 */
	public double getCostoMaterial() {
		return costo_material;
	}
	/**
	 * @param costo_rep the costo_rep to set
	 */
	public void setCostoMaterial(double costo_rep) {
		this.costo_material = costo_rep;
	}
	public String toString() {
 		String imprimir="";
 		String estadoActual;
 		if(this.getEstado()) {
 			estadoActual="Activo";
 		}
 		else {
 			estadoActual="Finalizado";
 		}
 		imprimir = "Id Trabajo: " + this.getID() + " Tipo de Reparacion: " + this.tipo_reparacion + " Descripcion: " + this.getDesc() + " Horas empleadas: " + this.getHs() + " Costo Material " + this.costo_material + " Estado actual: " + estadoActual + " Precio Actual: " + this.calculaPrecio();
 		return imprimir;
 	}
	public double calculaPrecio() {
		double precio=0;
		if(this.getTipo_reparacion() == Tipo_Reparaciones.MECANICA) {
			precio = (30 * this.getHs()) + (costo_material*1.1);
		}
		else
		{
			precio = (30 * this.getHs()) + (costo_material*1.3);
		}
		return precio;
	}
}
