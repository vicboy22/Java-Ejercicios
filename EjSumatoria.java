import java.util.Scanner;
public class EjSumatoria {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero para realizar la sumatoria");
		int numero = s.nextInt();
		int sumatoria=0;
		for (int i = 0; i<=numero; i++) {
			sumatoria = sumatoria + i;
		}
		System.out.println("la sumatoria es: "+ sumatoria);
		s.close();
	}
}

