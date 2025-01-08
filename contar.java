import java.util.Scanner;
public class contar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		
		System.out.println("introduce un numero entero del 1 al 10");
		numero = s.nextInt();
		/*if(numero == 1) {
			System.out.println("uno");
		}
		else if (numero == 2) {
			System.out.println("uno, dos");
		}
		else if (numero == 3) {
			System.out.println("uno, dos, tres");
		}
		else if (numero == 4) {
			System.out.println("uno, dos, tres, cuatro");
		}
		else if (numero == 5) {
			System.out.println("uno, dos, tres, cuatro, cinco");
		}
		else if (numero == 6) {
			System.out.println("uno, dos, tres, cuatro, cinco, seis");
		}
		else if (numero == 7) {
			System.out.println("uno, dos, tres, cuatro, cinco, seis, siete");
		}
		else if (numero == 8) {
			System.out.println("uno, dos, tres, cuatro, cinco, seis, siete, ocho");
		}
		else if (numero == 9) {
			System.out.println("uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve");
		}
		else if (numero == 10) {
			System.out.println("uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez");
		}
		else {
			System.out.println("El numero introducido no es correcto");
		}*/
		String contador[] = {"uno", "dos", "tres", "cuatro", "cinco", "seis","siete","ocho","nueve", "diez" };
		/*contador[1] = "uno";
		contador[2] = "dos";
		contador[3] = "tres";
		contador[4] = "cuatro";
		contador[5] = "cinco";
		contador[6] = "seis";
		contador[7] = "siete";
		contador[8] = "ocho";
		contador[9] = "nueve";
		contador[10] = "diez";*/
		
		for(int i = 0; i < numero; i++) {
			
			System.out.println(contador[i]);
		s.close();
			
		}
	
	}
}
