
public class IntercambioVar {
	public static void main(String[] args) {
			int a=2, b=3, aux;
			System.out.println("Var A ="+ a+ " Var b ="+b);
			aux = a;
			a = b;
			b = aux;
			System.out.println("Var A despues del cambio ="+ a+ " Var b despues \"del\" cambio ="  +b);
	
	}
}
