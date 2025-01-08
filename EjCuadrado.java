import java.util.Scanner;
public class EjCuadrado {
	public static void main (String[] args) { 
		Scanner s = new Scanner(System.in);
		System.out.println("introduzca el numero a realizar el cuadrado: ");
		int cuadrado = s.nextInt();
		cuadrado = cuadrado * cuadrado;
		System.out.println("El resultado es: " + cuadrado);
		System.out.println();
		for (int i = 1; i < 10; i++) {
		System.out.println("El cuadrado de los primeros 9 numeros naturales es: " + i +"^2" + " " + (i*i));
		}
		s.close();
	}

}
