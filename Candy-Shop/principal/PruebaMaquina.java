package principal;

import java.util.ArrayList;

import manejoMonedas.*;

public class PruebaMaquina {

	
	
	
	
	public static void main(String args[]) {
		Moneda moneda10 = new Moneda(10);
		Moneda moneda20 = new Moneda(20);
		Moneda moneda50 = new Moneda(50);
		Moneda moneda1 = new Moneda(1);
		Moneda moneda2 = new Moneda(2);
		ArrayList<Moneda> monedero = new ArrayList<Moneda>();
		monedero.add(moneda2);
		monedero.add(moneda1);
		monedero.add(moneda50);
		monedero.add(moneda20);
		monedero.add(moneda10);
		ArrayList<Integer> cantidades = new ArrayList<Integer>();
		cantidades.add(10);
		cantidades.add(5);
		cantidades.add(0);
		cantidades.add(0);
		cantidades.add(1);
		Monedero monederoMaquina = new Monedero(monedero,cantidades);
		Monedero mone
		
		
	}
	
}
