package ejercicio1;

public class Multimedia {

private	String titulo, autor;
private	Formato formatoMultimedia;
private	int duracion;


	Multimedia(String titulo, String autor, Formato formato, int duracion){
		this.duracion = duracion;
		this.formatoMultimedia = formato;
		this.autor=autor;
		this.titulo=titulo;
	}
	
	
	
	
	
	
	//METODOS
	public int getDuracion() {
		return duracion;
	}
	
	public Formato getFormatoMultimedia() {
		return formatoMultimedia;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String toString() {
		String imprimir = "El titulo es: " + this.titulo + " del autor/a " + this.autor + " Dura " + this.duracion +  " El formato es" + this.formatoMultimedia;
		return imprimir;
		
	}
	public boolean equals(Multimedia otroMultimedia) {
		if (this.autor.equals(otroMultimedia.getAutor()) && this.titulo.equals(otroMultimedia.titulo)) {
			return true;
		}
		else {
			return false;
		}
	}
}
