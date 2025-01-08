package clases;

import java.util.ArrayList;

public class Lista_trabajos implements TallerInterface{
	ArrayList<Trabajo> listaTrabajos;
	
	public Lista_trabajos() {
		listaTrabajos = new ArrayList<Trabajo>();
	}
	
	
	@Override
	public int anadirTrabajo(String tipoTrabajo, String descripcion, String ingeniero, String modeloMaquina, double costoMateriales ) { // AÑADIR EL RESTO
		switch(tipoTrabajo.toLowerCase()){
		case "revision":
			Revisiones nuevotrabajo = new Revisiones(descripcion);
			listaTrabajos.add(nuevotrabajo);
			return nuevotrabajo.getID();
		case "reparacion chapa y pintura":
			Rep_chapa_pintura nuevarepCP = new Rep_chapa_pintura(descripcion);
			listaTrabajos.add(nuevarepCP);
			return nuevarepCP.getID();
		case "reparacion mecanica":
			Rep_mecanica nuevarepMec = new Rep_mecanica(descripcion);
			listaTrabajos.add(nuevarepMec);
			return nuevarepMec.getID();
		case "reparacion electrica":
			Reparacion_electrica nuevarepE = new Reparacion_electrica(descripcion, ingeniero, modeloMaquina, costoMateriales);
			listaTrabajos.add(nuevarepE);
			return nuevarepE.getID();
		default:
			return -1;
		}
	}

	@Override
	public int aumentarHoras(int id, int horas) {
		Trabajo trabajo = this.dameElTrabajo(id);
		if (trabajo == null) {
			return -1;
		}
		else {
			if (horas <= 0) {
				return 0;
			}
			else if(!trabajo.getEstado()) {
				return -2;
			}
			else {
				int hs=0;
				hs = trabajo.getHs() + horas;
				trabajo.setHs(hs);
				return 1;
			}
		}
	}

	@Override
	public int aumentarCostePiezas(int id, double precio) {
		Trabajo trabajo = this.dameElTrabajo(id);
		//evaluo el coste de piezas > 0
		if(precio < 0) {
			//coste de piezas negativo
			return 0;
		}
		else {
			//Compruebo si el trabajo existe
			if (trabajo == null) {
				//trabajo no existente
				return -3;
			}
			//SI existe
			else {
				//Compruebo si es de tipo reparacion
				if(trabajo instanceof Reparaciones) {
					//Compruebo si esta activo
					if(trabajo.getEstado()) {
						//Pasadas todas las comprobaciones ahora le indico el nuevo valor del precio
						Reparaciones rep = (Reparaciones)trabajo;
						double coste = rep.getCostoMaterial() + precio;
						rep.setCostoMaterial(coste);
						return 1;
					}
					else {
					//Trabajo no activo
						return -2;
					}
				}
				else {
					//No es una reparacion
					return -1;
				}
			}
		}	
	}

	@Override
	public int finalizarTrabajo(int id) {
		Trabajo trabajo = this.dameElTrabajo(id);
		if (trabajo == null) {
			return -1;
		}
		else if(!trabajo.getEstado()) {
			return 0;
		}
		else {
			trabajo.setEstado(false);
			return 1;
		}
	}

	@Override
	public String muestraTrabajo(int id) {
		Trabajo trabajo = this.dameElTrabajo(id);
		if (trabajo == null) {
			return "El trabajo no existe";
		}
		return trabajo.toString();
	}

	//Busca el trabajo a partir de un id y te lo devuelve. En caso de no encontralo devuelve null
	private Trabajo dameElTrabajo(int id_trabajo) {
		for (Trabajo trabajo : listaTrabajos) {
			if(trabajo.getID() == id_trabajo) {
				return trabajo;
			}
		}
		return null;
	}
	
	public int eliminarTrabajo(int id) {
		Trabajo trabajo = this.dameElTrabajo(id);
		if (trabajo == null) {
			return -1;
		}
		else {
			listaTrabajos.remove(trabajo);
			return 1;
		}
	}



}
