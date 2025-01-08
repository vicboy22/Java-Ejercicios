import java.util.InputMismatchException;
import java.util.Scanner;
public class EjErrorString {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		boolean error = false;
		try {
		while (!error) {
		
		System.out.println("Introduce 5 num");
		int var1 = s.nextInt();
		int var2 = s.nextInt();
		int var3 = s.nextInt();
		int var4 = s.nextInt();
		int var5 = s.nextInt();
		error = true;
		}
		}
		catch(InputMismatchException a) {
			System.out.println("SOLO PUEDES METER UN NUMERO");
			error = false; 
			}//revisar luego bucle infinito
		
		}
		
		
		
	}

