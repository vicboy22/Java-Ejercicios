package simuladorTruco;

import java.util.InputMismatchException;
import java.util.Scanner;
import simuladorTruco.RepartoCartas;

/*Este sera el nexo de union entre todas las clases
 * 
 * 
 * 
 * */
public class JuegoTruco {
	public static void main(String[] args) {
		String cartaJugador1[] = { "", "", "" };
		String cartaJugador2[] = { "", "", "" };
		System.out.println("Simulador de cartas del truco (Actualmente solo reparte cartas)");
		System.out.println("Indique numero jugadores: \n El truco se juega de 2, 4 o 6 jugadores /n (Version actual solo 2 jugadores)");
		Scanner s = new Scanner(System.in);
		boolean salir = false;
		int puntosJ1 = 0;
		int puntosJ2 = 0;
		while (puntosJ1 < 15&&puntosJ2 < 15) {
			try {
				int cantidadJugadores = s.nextInt();
				switch (cantidadJugadores) {
				case 2:
					String aux[] = { "", "", "" };
					// Esto es de prueba de errores for(int h=0; h<30;h++) {}
					for (int i = 0; i < 3;) {
						aux[i] = RepartoCartas.darCartas();

						if (!aux[i].equals(cartaJugador1[0]) && !aux[i].equals(cartaJugador1[1])
								&& !aux[i].equals(cartaJugador1[2])) {
							cartaJugador1[i] = aux[i];
							i++;
						}
					}
					for (int j = 0; j < 3;) {
						aux[j] = RepartoCartas.darCartas();
						if (!aux[j].equals(cartaJugador1[0]) && !aux[j].equals(cartaJugador1[1])
								&& !aux[j].equals(cartaJugador1[2]) && !aux[j].equals(cartaJugador2[0])
								&& !aux[j].equals(cartaJugador2[1]) && !aux[j].equals(cartaJugador2[2])) {
							cartaJugador2[j] = aux[j];
							j++;
						}
					}
					System.out.println(cartaJugador1[0] + ", " + cartaJugador1[1] + ", " + cartaJugador1[2]);
					System.out.println(cartaJugador2[0] + ", " + cartaJugador2[1] + ", " + cartaJugador2[2]);
					salir = true;
					break;
					
					
					
					
					
					
				case 4:

					break;
				case 6:
					
					break;
				default:
					System.out.println("El truco se juega de 2, 4 o 6 jugadores\n Introduzca la cantidad de jugadores:");
					break;
				}
			} catch (InputMismatchException a) {
				System.out.println("El truco se juega de 2, 4 o 6 jugadores\n Introduzca la cantidad de jugadores:");
				s.next();
			}
		}
	}
}
