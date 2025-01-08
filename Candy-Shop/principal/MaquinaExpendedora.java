package principal;

import manejoMonedas.Monedero;
import manejoProductos.CajaProductos;

public class MaquinaExpendedora {
	
	private Monedero monederoUsuario = new Monedero();
	private Monedero monederoMaquina = new Monedero();
	private CajaProductos productosMaquina = new CajaProductos();
	
	public MaquinaExpendedora(Monedero monederoUser, CajaProductos cajaProductos, Monedero monederoMaquina) {
		this.monederoMaquina = monederoMaquina;
		this.monederoUsuario = monederoUser;
		this.productosMaquina = cajaProductos;
	}
	
	
}
