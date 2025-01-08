import java.util.Scanner;
public class NumeroMayor {
	public static void main (String[]ars) {
		Scanner s= new Scanner(System.in);
		int primNum;
		int segNum;
		System.out.println("Introduzca 2 numeros Enteros separados por espacios");
		primNum =s.nextInt();
		segNum = s.nextInt();
		if (primNum > segNum) {
			System.out.println(primNum+" Es mayor que " + segNum);
		}
		else if (segNum > primNum) {
			System.out.println(segNum+" Es mayor que " + primNum);
		}
		else if(segNum == primNum) {
			System.out.println("los numeros son iguales");
		}
		s.close();
	}
}
