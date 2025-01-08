import java.util.Scanner;

public class EjRombo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dime cuantas filas queres que te dibuje: ");
		int cantFilas = s.nextInt();
		
		for (int i = 1; i <= cantFilas;i++) {
			for (int x = cantFilas; x != i; x--) {
				System.out.print(" ");
			}
			int aux =i;
			//i = (i*2)-1;
			for(int j=0;j != i; j++) {
				System.out.print("$ ");
				}
			i = aux;
			System.out.println();
			
		}
		for (int i = (cantFilas-1); i > 0;i--) {
			for (int x = cantFilas; x > i; x--) {
				System.out.print(" ");
			}
			for(int j=1;j <= i; j++) {
				System.out.print("$ ");
				}
			System.out.println();
			
		}
	
		s.close();
	}
	
}