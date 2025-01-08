import java.util.Scanner;
public class Quiniela {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el resultado del partido siendo el formato: GolesLocal \"espacio\" GolesVisitante");
		int local = s.nextInt();
		int visitante = s.nextInt();
		if (local == visitante) {
			System.out.println("(X)");
		}
		else {
			if (local > visitante) {
			System.out.println("(1)");
			}
			else {
				System.out.println("(2)");
			}
		}	
		s.close();
	}
}
