import java.util.Scanner;
public class conversorMoneda {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double euros, libras, dolares;
		System.out.println("Introduzca el valor en €:");
		euros = s.nextDouble();
		libras= euros* 0.87;
		dolares= euros*0.99;
		dolares= (float) dolares;
		libras= (float) libras;
		
		System.out.println(euros+"€ pasados a dolares serian: "+ dolares+" Y pasados a libras serian: "+  libras);
	}
}
