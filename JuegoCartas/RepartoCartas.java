package simuladorTruco;
/*
 *	Algoritmo para repartir cartas del truco.
 *	Se busca realizar una funcion que pueda asignar una carta del mazo al llamarla
 * REGLAS:
 *			1: Las cartas tienen que ser entre el 1 y el 12 PERO no pueden ser ni 9 ni 8 (Se puede o hcaer un condicional o, hacer que llegue del 1 al 10 pero si sale un 8, 9 o 10, sumarle 2 asi mantenemos las mismas probabilidades)
 * 			2: Las cartas tienen que estar compuestas por un PALO (Hay 4 1: Basto, 2: Espada, 3:Copa, 4: Oro)
 * 			3: Tambien se podrian definir todas las cartas en un array o en 40 Variables y que el math.random elija una de ella y la devuelva
 * */
public class RepartoCartas {
	public static String darCartas() {
		String carta = "";
		int numeroCarta=0;
		int paloCarta=0;
		numeroCarta= (int)(Math.random()*10+1);
		if (numeroCarta == 8 || numeroCarta==9 || numeroCarta == 10) {
			numeroCarta = numeroCarta+2;
		}	
		carta =  carta + numeroCarta;
		paloCarta=(int)(Math.random()*4+1);
		switch(paloCarta) {
		case 1: carta =  carta + " De Espada";
		break;
		case 2: carta =  carta + " De Basto";
		break;
		case 3: carta =  carta + " De Oro";
		break;
		case 4: carta =  carta + " De Copa";
		break;
		}
		return(carta);
	}
	public static void main(String[] args) {
		for (int i =0; i< 100; i++) {
		System.out.println(darCartas());}
	}
}
