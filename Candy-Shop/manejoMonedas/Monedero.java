package manejoMonedas;

import java.util.ArrayList;


public class Monedero {

	ArrayList<Moneda> monedero = new ArrayList<Moneda>(5);
	ArrayList<Integer> cantidades = new ArrayList<Integer>();
	
	
	
	public Monedero() {}
	
	public Monedero(ArrayList<Moneda> monedero) {
		this.monedero=monedero;
	}
	
	public Monedero(ArrayList<Moneda> monedero, ArrayList<Integer> cantidades){
		this.monedero = monedero;
		this.cantidades = cantidades;
	}

	public void añadeUnidad(Moneda nuevaUnidad) {
		int posicion = monedero.indexOf(nuevaUnidad);
		cantidades.set(posicion, (cantidades.get(posicion)+1));
	}
	public String vaciar() {
		String imprimir ="";
		for (int i =0; i <= monedero.size(); i++) {
			if (cantidades.get(i) > 0) {
			imprimir = imprimir + "Monedas de " + monedero.get(i).getValor() + " centavos, cantidad: ";
			imprimir = imprimir + cantidades.get(i) + "\n";
			cantidades.set(i,0);
			}
		}
		return imprimir;
	}
	public boolean hayCambio(int cantidad) {
		this.ordenarBurbuja();
		for (int i = (monedero.size()-1); i >= 0; i--) {
			int valorMoneda = monedero.get(i).getValor();
			int cantidadMoneda = cantidades.get(i);
			if(valorMoneda == 1 || valorMoneda == 2) {
				valorMoneda = valorMoneda *100;
			}
			while (cantidad >= valorMoneda && cantidadMoneda > 0) {
				cantidad = cantidad - valorMoneda;
				cantidadMoneda--;
			}
		}
		if (cantidad > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	public String darCambio(int cantidad) {
		this.ordenarBurbuja();
		String cambio="";
		int unidadesCambio=0;
		for (int i = (monedero.size()-1); i >= 0; i--) {
			int valorMoneda = monedero.get(i).getValor();
			if(valorMoneda == 1 || valorMoneda == 2) {
				valorMoneda = valorMoneda *100;
			}
			while (cantidad >= valorMoneda &&  cantidades.get(i) > 0) {
				cantidad = cantidad - valorMoneda;
				int nuevasUnidades = cantidades.get(i)- 1;
				cantidades.set(i, nuevasUnidades); 
				unidadesCambio++;
			}
			cambio = cambio + "Monedas de " + monedero.get(i).toString() + " Cambio " + unidadesCambio + "\n";
			unidadesCambio = 0;
		}
		return cambio;
		
	}
	private void ordenarBurbuja() {
		Moneda aux;
		int auxCantidades =0;
		boolean salir=true;
		while(salir) {
			salir = false;
			for (int i=1; i < monedero.size(); i++) {
				int elemento1=monedero.get(i).getValor();
				int elemento2=monedero.get(i-1).getValor();
				if(elemento1 == 1 || elemento1 == 2) {
					elemento1 = elemento1 *100;
				}
				if(elemento2 == 1 || elemento2 == 2) {
					elemento2 = elemento2 *100;
				}
				if (elemento1 < elemento2 ) {
					aux = monedero.get(i-1);
					auxCantidades = cantidades.get(i-1);
					cantidades.remove(i-1);
					cantidades.add(auxCantidades);
					monedero.remove(i-1);
					monedero.add(aux);
					salir = true;
				}
			}
		}
		System.out.println(monedero.toString());
	}
	public ArrayList<Moneda> getMonedero() {
		return monedero;
	}
}


/*	//creo variables temporales para cada una de las monedas
int centimos10 = 0, centimos20 = 0, centimos50 = 0, euro = 0, euro2 = 0;
//recorro todo el array y guardo las cantidades en estas variables
for (int i = 0; i < monedero.size(); i++) {
	switch (monedero.get(i).getValor()) {
	case 10:
		centimos10 = monedero.get(i).getUnidades();
		break;
	case 20:
		centimos20 = monedero.get(i).getUnidades();
		break;
	case 50:
		centimos50 = monedero.get(i).getUnidades();
		break;
	case 1:
		euro = monedero.get(i).getUnidades();
		break;
	case 2:
		euro2 = monedero.get(i).getUnidades();
		break;
	}
}
//multiplico el valor a realizar el cambio por 100 para manejarme en centimos y realizo las restas segun corresponda
cantidad = cantidad * 100;
while (cantidad >= 200 && euro2 > 0) {
	cantidad = cantidad - 200;
	euro2--;
}
while (cantidad >= 100 && euro > 0) {
	cantidad = cantidad - 100;
	euro--;

}
while (cantidad >= 50 && centimos50 > 0) {
	cantidad = cantidad - 50;
	centimos50--;

}
while (cantidad >= 20 && centimos20 > 0) {
	cantidad = cantidad - 20;
	centimos20--;
}
while (cantidad >= 10) {
	cantidad = cantidad - 10;
	centimos10--;
}
//si al realizar las restas la cantidad no es 0 significa que no hay monedas disponibles para hacer la devolucion
if (cantidad > 0) {
	return false;
} else {
	return true;
}*/
