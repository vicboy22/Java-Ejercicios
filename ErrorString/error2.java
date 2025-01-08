import java.util.InputMismatchException;
import java.util.Scanner;
public class error2 {
	public static void main (String [] args) {
	Scanner s = new Scanner (System.in);
	boolean error = false;
	while (!error) {
		try {
		System.out.println("Introduce 5 num");
		int var1 = s.nextInt();
		int var2 = s.nextInt();
		int var3 = s.nextInt();
		int var4 = s.nextInt();
		int var5 = s.nextInt();
		System.out.println("Tus Numeros fueron: " + var1 + " " + var2 +" "  + var3 + " " + var4 + " " + var5);
		error = true;
		}
		catch(InputMismatchException a) {
			System.out.println("Introduce SOLO NUMEROS");
			s.next();
		}
		}
	}
}
