import java.util.Scanner;
public class ParImpar {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		boolean repetir = false;
		System.out.println("Introduce el numero:");
		double  numero = s.nextDouble();
		while(!repetir) {
			
			double resto = (numero % 2);
			if (resto == 0) {
			System.out.println("El numero: "+ numero+ " Es PAR");
			}
			else {
			System.out.println("El numero: "+ numero+ " Es IMPAR");
			}
			System.out.println("Introduce el numero:");
			numero = s.nextDouble();
			if (numero == 0) {
				repetir = true;
			}
			
		}
		
	}

}
