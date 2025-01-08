import java.util.Scanner;
public class Operaciones {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce los valores con el siguiente formato:\n Operando1 Operando2 Accion \n Siendo accion: 1=Suma 2=Resta 3=Multiplicacion");
		double operando1 = s.nextDouble();
		double operando2 = s.nextDouble();
		int operacion =s.nextInt();
		
		if (operacion == 1) {
			System.out.println(operando1 + " + " +  operando2 + " = " + (operando1+operando2));
		}
		else if (operacion == 2) {
			System.out.println(operando1 + " - " +  operando2 + " = " + (operando1-operando2));
		}
		else if (operacion == 3) {
			System.out.println(operando1 + " x " +  operando2 + " = " + (operando1*operando2));
		}
		else {
			System.out.println("Introduzca un valor valido en la accion");
		}
		s.close();
	}
}
