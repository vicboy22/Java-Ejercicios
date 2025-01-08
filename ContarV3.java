import java.util.Scanner;

public class ContarV3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean repetir = false;
		System.out.println("Introduce el numero a contar");
		int numero = s.nextInt();
		int contar = 0;
		while(!repetir) {
			if (contar == numero) {
				repetir = true;
			}
			contar++;
			System.out.print(contar + ",");
		}
		s.close();
	}
}
  