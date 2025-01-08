package clases;

public class Reparacion_electrica extends Reparaciones {

	private String ingeniero, modeloMaquina;
	
	
	
	public Reparacion_electrica(String desc, String ingeniero, String modeloMaquina, double costoMateriales ) {
		super(desc, Tipo_Reparaciones.ELECTRICA);
		this.setCostoMaterial(costoMateriales);
		this.setIngeniero(ingeniero);
		this.setModeloMaquina(modeloMaquina);
	}

	public double calculaPrecio() {
 		double precio=0;
 		precio = (30 * this.getHs()) + 70 + 30 + this.getCostoMaterial();
 		return precio;
 	};


	/**
	 * @return the ingeniero
	 */
	public String getIngeniero() {
		return ingeniero;
	}



	/**
	 * @param ingeniero the ingeniero to set
	 */
	public void setIngeniero(String ingeniero) {
		this.ingeniero = ingeniero;
	}



	/**
	 * @return the modeloMaquina
	 */
	public String getModeloMaquina() {
		return modeloMaquina;
	}



	/**
	 * @param modeloMaquina the modeloMaquina to set
	 */
	public void setModeloMaquina(String modeloMaquina) {
		this.modeloMaquina = modeloMaquina;
	}


}
