package ejercicio1;

import java.util.ArrayList;

public class ListaMultimedia {

	private ArrayList <Multimedia> lista;
	public ListaMultimedia() {
		this.lista= new ArrayList<Multimedia>();
	}
	
	
	
	public void añadirElemento(Multimedia multimedia) {
		this.lista.add(multimedia);
	}
	
	
	public String mostrarTodo() {
		String msj ="";
		for (Multimedia multimedia : lista) {
		msj = msj +	multimedia +"\n"; 
		}
		return msj;
	}

	public int duracionTotal() {
		int duracion=0;
		for (Multimedia multimedia : lista) {
			duracion = duracion + multimedia.getDuracion();
			}
		return duracion;
	}
	public int discosRock() {
		int cantidad=0;
		for (Multimedia multimedia : lista) {
			if(multimedia instanceof Disco) {
				Disco discoCasteado = (Disco)multimedia;
				if(discoCasteado.getGenero().equals("Rock")) {
						cantidad++;
					}
				}
			}
		return cantidad;
	}
	public int peliculasSinActriz() {
		int cantidad=0;
		for (Multimedia multimedia : lista) {
			if(multimedia instanceof Pelicula) {
				Pelicula peli = (Pelicula)multimedia;
				if(peli.getActrizPrincipal() == null) {
						cantidad++;
					}
				}
			}
		return cantidad;
	}

}
