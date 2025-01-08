package ejercicio1;

public class ErroresMios extends Exception {
	
	
	int codigoError; 
	public ErroresMios(int codigoError){
		super();
		this.codigoError=codigoError;
		}

	
	public String getMensage() {
		String msj="";
		switch (codigoError) {
		case 1:
			msj= "Error, Solo podes pasar un valor nulo entre los protagonistas";
		break;
		default:
			msj="ERROR DESCONOCIDO";
		}
		return msj;
		
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 6323169605412564274L;

}
