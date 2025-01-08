package ejercicio1;

public class PruebaMultimedia {

	public static void main(String[] args) {

		ListaMultimedia miLista = new ListaMultimedia();
		Disco system = new Disco("\"Aerials\"", "System of a down", Formato.MP3, 3, "Rock");
		Disco linkin = new Disco("\"Lost\"", "Linkin Park", Formato.MP3, 4, "Rock");
		Disco gorillaz = new Disco("\"Souk eye\"", "Gorillaz", Formato.MP3, 3, "Indie");
		Pelicula miPeli1 = new Pelicula("\"Malditos Bastardos\"", "Quentin Tarantino", Formato.MP4, 125, "Brad Pitt", null);
		Pelicula miPeli2 = new Pelicula("\"Pulp Fiction\"", "Quentin Tarantino", Formato.MP4, 135, "John Travolta", "Uma Thurman");
		Pelicula miPeli3 = new Pelicula("\"The nightmare before christmas\"", "Tim Burton", Formato.MP4, 115,"Jack Skellington" , null);
		miLista.añadirElemento(miPeli3);
		miLista.añadirElemento(miPeli2);
		miLista.añadirElemento(miPeli1);
		miLista.añadirElemento(system);
		miLista.añadirElemento(linkin);
		miLista.añadirElemento(gorillaz);
	
	System.out.println(miLista.mostrarTodo());
	System.out.println("La duracion total es: " + miLista.duracionTotal());
	System.out.println("LA cantidad de discos de rock es: " + miLista.discosRock());
	System.out.println("LA cantidad de Peliculas sin actriz principal es: " + miLista.peliculasSinActriz());
	
	
	}

}
