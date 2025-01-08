import java.util.Scanner;
public class conversorTemp {
	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Introduce los grados Celcius a convertir:");
	 float gradosC = s.nextFloat();
	 float gradosK;
	 float gradosF;
	 gradosK = gradosC + 273;
	 gradosF = ((gradosC * 9)/5)+32;
	 System.out.println("\n El equivalente en kelvin seria:"+ gradosK+ "\n El equivalente en fahrenheit seria:"+ gradosF);
	
	}
}
