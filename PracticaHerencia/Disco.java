package ejercicio1;

public class Disco extends Multimedia {
	private String genero;
	public Object out;
	Disco(String titulo, String autor, Formato formato, int duracion,String genero){
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}
	
	
	public String getGenero() {
		return genero;
	}
	
	
	
	public String toString() {
		String msj;
		msj="El titulo es: " + this.getTitulo() + " del autor/a " + this.getAutor() + " Dura " + this.getDuracion() +  " El formato es " + this.getFormatoMultimedia() + " EL genero es " +  this.genero;
		return msj;
	}
}
