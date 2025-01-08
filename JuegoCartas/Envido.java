package simuladorTruco;
/*
 * Programa que va a tomar los valores de las cartas de cada jugador y va a comprobar cuanto suman cada mano
 * devolvera un valor 1 si gana el jugador1, 2 si gana el jugador2 y, si es empate (La suma) se tendra en cuenta quien es 
 * mano para devolver quien es el ganador
 * No se tendran en cuenta si estamos con Envido, Real Envido, Envido Envido o Falta envido Ya que para eso deberia
 * de devolver 2 valores que en java (Con variables normales) no se puede.
 * Si no estoy equivocado esto se puede resolver devolviendo un objeto que contenga ambos valores pero como no he dado
 * aun objetos (Y no queria adelantar contenidos) lo he resuelto de esta manera. 
 * El chequeo de la variante del envido lo hare en el main. 
 * */
public class Envido {
 public static int envido(String[] J1, String[] J2,int mano) {
	 // J1 cartas jugador 1
	 // J2 cartas jugador 2 
	 // Mano, jugador que es mano
	 // Se necesita primero comprobar que cartas de cada jugador son del mismo palo, para eso deberia de filtrar solo la parte que
	 // que dice el palo de la carta. Si los palos de 2 o mas cartas coinciden se suman pero, si son 3 solo se suman las 2 mas grandes
	 // El 10, 11 y 12 "solo sirven para juntar palo" Ya que no aportan valor numerico ademas del "+20" que tienen todas las cartas al sumar
	 // 2 palos
	 // EJ Si tenemos el 3 de Espada, 7 de Espada y 2 de Copa. Deberia de filtrar primero la parte del palo. el 3 y el 7 comparten palo y como son distintos
	 // de 10, 11 y 12, se Sumaran entre si (10) y se le sumaran los 20 del envido (Deberian ser 30 al final)
	 int puntosJ1 =0;
	 int puntosJ2 =0;
	 //OTRA alternativa seria usa el indexOf con el char E, B, C, O (cada uno de los palos) y si varias cartas lo tienen significa que comparten palo (y se podria usar el index of aunque al no repetirse no es necesario) 
	 //En esta alternativa si no devuelve -1 significa que existe
	 //Si el valor en el char(1) es != ' ' entonces comparara a partir del char (2)
	 
	 
	 
	 //compruebo las cartas del primer jugador primero
	 
	 
	 
	 
	 
	 
	 
	 return 1;
 } 
}
