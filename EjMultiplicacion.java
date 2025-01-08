import java.util.Scanner;
public class EjMultiplicacion {
	public static void main (String[] args) { 
		Scanner s = new Scanner(System.in);
		System.out.println("introduzca los numeros a multiplicar: ");
		double mult = s.nextDouble();
		double cantMult = s.nextDouble();
		double multStatic = mult;
		for (int i = 0; i < (cantMult-1); i++) { //revisar cuando se multiplica por 0
			
			mult = mult + multStatic;
			
		}
		System.out.println("El resultado es: " + mult);
		s.close();
	}

}
