import java.util.Scanner;
public class EjDibujar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dime cuantas filas queres que te dibuje: ");
		int cantFilas = s.nextInt();
		String dollar = "$";;
		/*for (int i = 0; i<= cantFilas; i++) {
			System.out.print(dollar.repeat(i));
			System.out.println();
		}*/
	
		for (int i = 0; i <= cantFilas;i++) {
			
			for(int j=0; j != i;j++) {
			System.out.print(dollar);
			}
			System.out.println(" ");
		}
		s.close();
	}
	
}
