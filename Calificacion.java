import java.util.Scanner;
public class Calificacion {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca la nota del alumno");
		float notaA = s.nextFloat();
		if (notaA > 10 || notaA <0 ) {
			System.out.println("La nota no puede ser mayor a 10 o menor a 0");
		}
		else {
			if (notaA < 5) {
				System.out.println("El Alumno ha suspendido");
			}
			else if ( notaA <6) {
				System.out.println("El Alumno esta Aprobado");
			}
			else if ( notaA <7) {
				System.out.println("El Alumno esta Aprobado con nota BIEN");
			}
			else if ( notaA <9) {
				System.out.println("El Alumno esta Aprobado con nota NOTABLE");
			}
			else if ( notaA <10) {
				System.out.println("El Alumno esta Aprobado con nota Sobresaliente");
			}
			else if ( notaA == 10) {
				System.out.println("El Alumno tiene un 10");
			}
		}
		
		s.close();
	}
}
