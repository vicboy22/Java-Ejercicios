import java.util.Scanner;
public class EjCuentaAtras {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean stop = false;
		System.out.println("Introduce un numero para contar hacia atras");
		int numero = s.nextInt();
		while (!stop) {
			System.out.println(numero);
			if (numero == 0) {
				stop = true;
			}
			numero--;	
		}
		s.close();
	}
}
