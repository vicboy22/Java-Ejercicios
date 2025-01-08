package ejercicio1;

public class Pelicula extends Multimedia {

	
private	String actorPrincipal, actrizPrincipal;
	
	Pelicula(String titulo, String autor, Formato formato, int duracion, String actor,String actriz) {
		super(titulo, autor, formato, duracion);
		actorPrincipal = actor;
		actrizPrincipal = actriz;
		if(actor==null && actriz == null) {
			throw new IllegalArgumentException("Debes poner por lo menos un protagonista");
		}
		
		
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public String getActrizPrincipal() {
		return actrizPrincipal;
	}
	public String toString() {
		String msj;
		msj="El titulo es: " + this.getTitulo() + " del autor/a " + this.getAutor() + " Dura " + this.getDuracion() +  " El formato es " + this.getFormatoMultimedia();
		if(this.actorPrincipal == null) {
			msj = msj + " Actriz Principal " + this.actrizPrincipal;
		}
		else if(this.actrizPrincipal == null) {
			msj = msj + " Actor Principal " + this.actorPrincipal;
		}
		else {
			msj = msj + " Actriz Principal " + this.actrizPrincipal + " Actor principal " + this.actorPrincipal;
		}
		return msj;
	}
	
}
