package simuladorTruco;
/*
 * Este archivo sera el que, con 1 cartad e cada jugador comparara segun las normas del truco cual es mayor
 * y devolvera el ganador para que otro archivo determine que jugador debera jugar a continuacion y los puntos
 * Si correspondieran. El valor de las cartas sigue el siguiente orden:
 * 	 
 * As, 1 o ancho de espadas. La carta que mata a todas en el truco. 
	  As, 1 o ancho de bastos. Segunda carta de mayor poder.
 	   7 de espadas. Tercera carta de mayor poder.
 	    7 de oros. Cuarta carta de mayor poder.
 	     Los 3 (cualquiera sea el palo, tienen el mismo valor).
 	      Los 2 (cualquiera sea el palo, tienen el mismo valor).
 	       1 de oros y de copas.
 	        Los 12  (Todos los palos con el mismo valor).
 	         Los 11  (Todos los palos con el mismo valor).
 	          Los 10  (Todos los palos con el mismo valor).
 	           Los 7 de copas y 7 de bastos. (Los dos con el mismo valor).
 	            Los 6. (Todos los palos con el mismo valor).
 	             Los 5. (Todos los palos con el mismo valor).
 	              Los 4. (Todos los palos con el mismo valor).
 	              dasdasd
 *
 * 
 * 
 * 
 * */
public class CompararCartas {
public static int comparar(String J1, String J2) {
	//Para saber quien gana tomo el 1 Como que gana la carta del jugador 1 y 2 como la cartad el jugador 2. Si devuelve 3 es empate y 4 error
	//para poder comparar mas ordenado Creo un array con todas las cartas donde las primeras 4 si las comparare con equals y al resto les comparare solo el primer Char ya que da igual el palo que sean
	String mazo[] = {"1 De Espada", "1 De Basto", "7 De Espada", "7 De Oro", "3", "2", "1 ", "12", "11", "10", "7", "6", "5", "4"};
	
	if (J1.equals(mazo[0])) {
		//J1 tiene un as de espadas
		return 1;
	}
	else if (J1.equals(mazo[1])) {
		//J1 tiene un as de basto
			//Si: J2 tiene el de espada
		if (J2.equals(mazo[0])) {
			//gana el J2
			return 2;
		}
		else {
		return 1;
			}
		}
	else if (J1.equals(mazo[2])) {
		//J1 tiene un 7 de espadas
		if (J2.equals(mazo[0])||J2.equals(mazo[1])) {
			return 2;
		}
		return 1;
	}
	else if (J1.equals(mazo[3])) {
		//J1 tiene un 7 de Oro
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])) {
			return 2;
		}
		return 1;
	}else if (J1.charAt(0) == mazo[4].charAt(0)) {
		//J1 tiene un 3
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0)) {
			return 3;
		}
		return 1;
	}
	else if (J1.charAt(0) == mazo[5].charAt(0)) {
		//J1 tiene un 2
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])||J2.charAt(0)==mazo[4].charAt(0)) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0)) {
			return 3;
		}
		return 1;
	}
	else if (J1.charAt(0) == mazo[6].charAt(0) && J1.charAt(1) == mazo[6].charAt(1)) {
		//J1 tiene un 1 Falso
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])||J2.charAt(0)==mazo[4].charAt(0)||J2.charAt(0)==mazo[5].charAt(0)) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0)&&J2.charAt(1)== J1.charAt(1)) {
			return 3;
		}
		return 1;
	}
	else if (J1.charAt(0) == mazo[7].charAt(0) && J1.charAt(1) == mazo[7].charAt(1)) {
		//J1 tiene un 12 
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])||J2.charAt(0)==mazo[4].charAt(0)||J2.charAt(0)==mazo[5].charAt(0)||(J2.charAt(0)==mazo[6].charAt(0)&& J2.charAt(1)==mazo[6].charAt(1))) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0) && J2.charAt(1)==J1.charAt(1)) {
			return 3;
		}
		return 1;
	}
	else if (J1.charAt(0) == mazo[8].charAt(0)&& J1.charAt(1) == mazo[8].charAt(1)) {
		//J1 tiene un 11 
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])||J2.charAt(0)==mazo[4].charAt(0)||J2.charAt(0)==mazo[5].charAt(0)||(J2.charAt(0)==mazo[6].charAt(0)&& J2.charAt(1)==mazo[6].charAt(1))||(J2.charAt(0)==mazo[7].charAt(0)&& J2.charAt(1)==mazo[7].charAt(1))) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0) && J2.charAt(1)==J1.charAt(1)) {
			return 3;
		}
		return 1;
	}
	else if (J1.charAt(0) == mazo[9].charAt(0)&& J1.charAt(1) == mazo[9].charAt(1)) {
		//J1 tiene un 10 
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])||J2.charAt(0)==mazo[4].charAt(0)||J2.charAt(0)==mazo[5].charAt(0)||(J2.charAt(0)==mazo[6].charAt(0)&& J2.charAt(1)==mazo[6].charAt(1))||(J2.charAt(0)==mazo[7].charAt(0)&& J2.charAt(1)==mazo[7].charAt(1))||(J2.charAt(0)==mazo[8].charAt(0)&&J2.charAt(1)==mazo[8].charAt(1))) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0) && J2.charAt(1)==J1.charAt(1)) {
			return 3;
		}
		return 1;
	}
	else if (J1.charAt(0) == mazo[10].charAt(0)) {
		//J1 tiene un 7 falso 
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])||J2.charAt(0)==mazo[4].charAt(0)||J2.charAt(0)==mazo[5].charAt(0)||J2.charAt(0)==mazo[6].charAt(0)||J2.charAt(0)==mazo[7].charAt(0)||J2.charAt(0)==mazo[8].charAt(0)||J2.charAt(0)==mazo[9].charAt(0)) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0)) {
			return 3;
		}
		return 1;
	}
	else if (J1.charAt(0) == mazo[11].charAt(0)) {
		//J1 tiene un 6 
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])||J2.charAt(0)==mazo[4].charAt(0)||J2.charAt(0)==mazo[5].charAt(0)||J2.charAt(0)==mazo[6].charAt(0)||J2.charAt(0)==mazo[7].charAt(0)||J2.charAt(0)==mazo[8].charAt(0)||J2.charAt(0)==mazo[9].charAt(0)||J2.charAt(0)==mazo[10].charAt(0)) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0)) {
			return 3;
		}
		return 1;
	}
	else if (J1.charAt(0) == mazo[12].charAt(0)) {
		//J1 tiene un 5 
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])||J2.charAt(0)==mazo[4].charAt(0)||J2.charAt(0)==mazo[5].charAt(0)||J2.charAt(0)==mazo[6].charAt(0)||J2.charAt(0)==mazo[7].charAt(0)||J2.charAt(0)==mazo[8].charAt(0)||J2.charAt(0)==mazo[9].charAt(0)||J2.charAt(0)==mazo[10].charAt(0)||J2.charAt(0)==mazo[11].charAt(0)) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0)) {
			return 3;
		}
		return 1;
	}
	else if (J1.charAt(0) == mazo[13].charAt(0)) {
		//J1 tiene un 4 
		if (J2.equals(mazo[0])||J2.equals(mazo[1])||J2.equals(mazo[2])||J2.equals(mazo[3])||J2.charAt(0)==mazo[4].charAt(0)||J2.charAt(0)==mazo[5].charAt(0)||J2.charAt(0)==mazo[6].charAt(0)||J2.charAt(0)==mazo[7].charAt(0)||J2.charAt(0)==mazo[8].charAt(0)||J2.charAt(0)==mazo[9].charAt(0)||J2.charAt(0)==mazo[10].charAt(0)||J2.charAt(0)==mazo[11].charAt(0)||J2.charAt(0)==mazo[12].charAt(0)) {
			return 2;
		}
		else if (J2.charAt(0)== J1.charAt(0)) {
			return 3;
		}
		return 1;
	}
	return 4;
}
public static void main(String [] args) {
	for( int i =0; i< 10; i++) {
	String	carta1 = simuladorTruco.RepartoCartas.darCartas();
	String	carta2 = simuladorTruco.RepartoCartas.darCartas();
	System.out.println(carta1+ "/" + carta2);
	System.out.println(comparar(carta1, carta2));
	}
}








}
