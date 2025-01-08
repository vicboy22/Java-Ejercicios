import java.util.Scanner;

public class Contarv2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero a contar");
		int numero = s.nextInt();
		for (int i = 0; i <= numero; i++) {

			System.out.print(" " + i + ",");
		}
		s.close();
	}
}
  