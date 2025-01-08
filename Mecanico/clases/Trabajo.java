package clases;
public class Trabajo {
 static private int id_global;
 private int id;
 private String desc;
 private int hs;
 private boolean estado_activo;
 	Trabajo(){
 		this.compruebaID();
 		Trabajo.id_global = Trabajo.id_global +1;
 		this.id = Trabajo.id_global;
 		this.desc="";
 		this.setHs(0);
 		this.estado_activo=true;
 	}
 	Trabajo(String desc){
 		this.compruebaID();
 		Trabajo.id_global = Trabajo.id_global +1;
 		this.id = Trabajo.id_global;
 		this.desc=desc;
 		this.setHs(0);
 		this.estado_activo=true;
 	}
 	public String toString() {
 		String imprimir="";
 		String estadoActual;
 		if(estado_activo) {
 			estadoActual="Activo";
 		}
 		else {
 			estadoActual="Finalizado";
 		}
 		imprimir = "Id Trabajo: " + this.id + " Descripcion: " + this.desc + " Horas empleadas: "+ this.hs + " Estado actual: " + estadoActual + " Precio Actual: " + this.calculaPrecio();
 		return imprimir;
 	}
 	public double calculaPrecio() {
 		double precio=0;
 		precio = 30 * hs;
 		return precio;
 	};
 	
 	
 	
 	
 	private void compruebaID() {
 		if(Trabajo.id_global <= 0) {
 			Trabajo.id_global=0;
 		}
 	}
 	
 	
	/**
	 * @return the hs
	 */
	public int getHs() {
		return hs;
	}
	/**
	 * @param hs the hs to set
	 */
	public void setHs(int hs) {
		this.hs = hs;
	}
	public String getDesc() {
		return desc;
	}
	/**
	 * @param hs the hs to set
	 */
	public void setDesct(String desc) {
		this.desc = desc;
	}
	public boolean getEstado() {
		return estado_activo;
	}
	/**
	 * @param hs the hs to set
	 */
	public void setEstado(Boolean Nuevoestado) {
		this.estado_activo = Nuevoestado;
	}
	public int getID() {
		return this.id;
	}
 	
 	
}
