import java.util.Scanner;
public class EjMayorYMenorV2 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Introduzca 3 numeros a comparar separados por espacios: ");
	int var1 = s.nextInt();
	int var2 = s.nextInt();
	int var3 = s.nextInt();
	
	if (var1 >= var2 && var1 >= var3) {
		if (var2 >= var3) { 	//Var1 Es la mayor
			System.out.println(var1+ ">"+ var2 +">" + var3);
			}
		else {
			System.out.println(var1+ ">"+ var3 +">" + var2);
		}
	}
	else if (var1 <= var2 && var1 <= var3) { //Var1 Es la menor
		if (var2 >= var3) { 	
			System.out.println(var2+ ">"+ var3 +">" + var1);
			}
		else {
			System.out.println(var3+ ">"+ var2 +">" + var1);
		}
	} 
	else if (var1 > var2 && var1 < var3 || var1 < var2 && var1 > var3 ) {  //Var1 Es la del medio
		if (var2 >= var3) { 	
			System.out.println(var2+ ">"+ var1 +">" + var3);
			}
		else {
			System.out.println(var3+ ">"+ var1 +">" + var2);
			}
		}
	s.close();
	} 
}
