import java.util.Scanner;
public class adivinarLetra {
	public static void main (String[]ars) {
		Scanner s = new Scanner(System.in);
		String letra = "f";
		System.out.println("Intenta adivinar en que letra pienso:");
		int contador=0;
		/* if (s.hasNext(letra)) {
			System.out.println("GANASTE");
		}
		else {
			System.out.println("Perdiste"); 
		
		}*/
		
				//tambien se podria hacer con un letra.equals(letra2);
		while (!s.hasNext(letra) ) {
			System.out.println("Esa no es la letra que estaba pensando, vuelve a intentarlo");
		s.next();
			contador++;
		}
		System.out.println("Has adivinado! Te ha costado: "+ contador+ " intentos y la letra era: "+letra);
		s.close();
		
	}
}
