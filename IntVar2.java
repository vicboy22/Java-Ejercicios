
public class IntVar2 {
	//creo una funcion de tipo entera pero ¿lista? preg. profesor. que tenga 2 parametros a ingresar tampoco se por que tiene que ser static
	static int[] metodoEntero(int n,int n2) 
	{
		n = n + n2; //pongo las operaciones a realizar
		n2 = n - n2;
		n = n - n2;
		 return new int[] {n, n2}; 
		 /*		Debo de definir el resultado como una lista de resultados por que 
		   		java no soporta devolver 2 resultados?? preg profesor   */
		 //¿En este caso "n" seria una var local y el metodo seria una var estatica?
		
	}
	/*class varinstancias{
		int resultado1;
		int resultado2;
	}
	¿esto seria una variable estatica?¿por que no puedo acceder a ella en el main?
	*/

	public static void main(String[] args) {
	
		
		//estas serian var locales
		int variableA = 50; //Defino Var A
		int variableB = 40; //Defino Var B
		
		System.out.println("valor actual A: " + variableA);//Muestro ambos valores en consola
		System.out.println("valor actual B: " + variableB);
		
	/*
	**Este es el calculo para invertir las Var** 
		variableA = variableA + variableB;
		variableB = variableA - variableB;
		variableA = variableA - variableB;
	*/
		
		int resultado[] = metodoEntero(variableA, variableB); 
		//creo una variable entera pero de tipo lista¿? para despues acceder a los resultados. Ejecuto la funcion en la var
		System.out.println();
		
	System.out.println("valor actual A: " + resultado[0]);//muestro el resultado 0 (var A)
	System.out.println("valor actual B: " + resultado[1]);//muestro el resultado 1 (var b)
			/*
	 	Tambien puedo redefinir las variables A y B para luego mostrarlas o usarlas con el nuevo valor
			variableA = resultado[0]; 
			variableB = resultado[1];
			System.out.println("valor actual A: " + variableA);//Muestro ambos valores en consola
			System.out.println("valor actual B: " + variableB);
			*/
	
	}

}
