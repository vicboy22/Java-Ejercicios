import java.util.Scanner;
public class EjCambioDinero2 {
	public static void main  (String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Indique la cantdidad y le sera provisto su cambio");
		int cantBilletes=0;
		int dinero = s.nextInt();
		while (dinero >= 500 ) {
			dinero = dinero-500;
			cantBilletes++;	
		}
		System.out.println("Billetes de 500€: " + cantBilletes);
		cantBilletes = 0;
		while ( dinero >= 200 ) {
			dinero = dinero-200;
			cantBilletes++;	

		}
		System.out.println("Billetes de 200€: " + cantBilletes);
		cantBilletes = 0;
		while ( dinero >= 50 ) {
			dinero = dinero-50;
			cantBilletes++;	
		
		}
		System.out.println("Billetes de 50€: " + cantBilletes);
		cantBilletes = 0;
		while ( dinero >= 20 ) {
			dinero = dinero-20;
			cantBilletes++;	
		}
		System.out.println("Billetes de 20€: " + cantBilletes);
		cantBilletes = 0;
		while ( dinero >= 10 ) {
			dinero = dinero-10;
			cantBilletes++;	
		}
		System.out.println("Billetes de 10€: " + cantBilletes);
		cantBilletes = 0;
		while ( dinero >= 5 ) {
			dinero = dinero -5;
			cantBilletes++;	
		
		}
		System.out.println("Billetes de 5€: " + cantBilletes);
		cantBilletes = 0;
		while ( dinero >= 2 ) {
			dinero = dinero-2;
			cantBilletes++;	
		}
		System.out.println("Monedas de 2€: " + cantBilletes);
		cantBilletes = 0;
		while ( dinero >= 1 ) {
			dinero = dinero-1;
			cantBilletes++;	
		}
		System.out.println("Monedas de 1€: " + cantBilletes);
		s.close();
	}
}