package manejoMonedas;

public class Moneda {

	private int valor;

	
	
	public Moneda(int valor){
		this.valor = valor;
	}
	public boolean equals(Moneda moneda) {
		if (this.valor == moneda.getValor()) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
	public String toString() {
		String imprimir = "Moneda de" + this.valor;
		return imprimir;
	}
	
	
}
