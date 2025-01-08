package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import clases.Lista_trabajos;

public class GasMonkeyMain {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		Lista_trabajos gasmonkey = new Lista_trabajos();
		boolean salir = false;
		int id ;
		int resultado;
		while(!salir) {
		System.out.println("Bienvenido a GasMonkeyGarage ¿Que deseas hacer?");
		System.out.println("1. Registrar trabajo \n"
				+ "2. Aumentar hs \n"
				+ "3. Aumentar coste piezas \n"
				+ "4. Finalizar trabajo \n"
				+ "5. Muestra trabajo \n"
				+ "6. Eliminar trabajo \n");
		try {
			
		
		int opcion = s.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce el tipo de trabajo \nActualmente hay 4 tipos \n \"Revision\" \n \"Reparacion chapa y pintura\" \n \"Reparacion mecanica\" \\\"Reparacion electrica\\\" ");
				s.nextLine();
				String tipotrabajo = s.nextLine();
				System.out.println("Introduci la descripcion del trabajo");
				s.nextLine();
				String desc = s.nextLine();
				System.out.println("Introduci El nombre del ingeniero");
				String ing = s.nextLine();
				System.out.println("Introduci el modelo de la maquina de diagnosis");
				String maq_diag = s.nextLine();
				System.out.println("Introduci el costo de los materiales");
				double material = s.nextDouble();
				 id = gasmonkey.anadirTrabajo(tipotrabajo, desc,ing,maq_diag,material);
				if( id == -1) {
					System.err.println("El trabajo no se ha podido agregar");
				}
				else {
					System.out.println("El trabajo se agrego correctamente, El id es: " + id);
				}
				break;
			case 2:
				System.out.println("Introducì el ID del trabajo");
				id = s.nextInt();
				System.out.println("Introducì la cantidad de HS a agregar");
				int hs = s.nextInt();
				resultado = gasmonkey.aumentarHoras(id, hs);
				if (resultado == 0) {
					System.err.println("No podes poner las hs en negativo");
				}
				else if(resultado == -1) {
					System.err.println("No existe ese trabajo");
				}
				else if(resultado == -2) {
					System.err.println("El trabajo ya esta finalizado");
				}
				else {
					System.out.println("Hs añadidas correctamente");
				}
				break;
			case 3:
				System.out.println("Introduci el ID");
				id=  s.nextInt();
				System.out.println("Introduci el coste de las piezas");
				double piezas = s.nextDouble();
				resultado = gasmonkey.aumentarCostePiezas(id, piezas);
				switch (resultado) {
				case -1:
					System.err.println("El trabajo no es una reparacion ");
					break;
				case 0:
					System.err.println("El coste de piezas es negativo");
					break;
				case 1:
					System.out.println("Coste de piezas aumentado satisfactoriamente");
					break;
				case -3:
					System.err.println("No existe trabajo con ese ID");
					break;
				case -2:
					System.err.println("Trabajo ya finalizado");
					break;
				}
				break;
			case 4:
				System.out.println("Introduci el ID del trabajo a finalizar");
				id= s.nextInt();
				resultado = gasmonkey.finalizarTrabajo(id);
				switch (resultado) {
				case -1:
					System.err.println("No existe ningun trabajo con ese codigo ");
					break;
				case 0:
					System.err.println("El trabajo ya esta finalizado ");
					break;
				case 1:
					System.out.println("El trabajo ha podido ser finalizado satisfactoriamente");
					break;
				}
				break;
			case 5:
				System.out.println("Introduci el ID del trabajo que queres mostrar");
				id=s.nextInt();
				System.out.println(gasmonkey.muestraTrabajo(id));
				break;
			case 6:
				System.out.println("Introduci el ID del trabajo que quieras eliminar");
				id=s.nextInt();
				resultado = gasmonkey.eliminarTrabajo(id);
				switch (resultado) {
				case -1:
					System.err.println("No existe ningun trabajo con ese codigo ");
					break;
				case 1:
					System.out.println("El trabajo ha podido ser finalizado satisfactoriamente");
					break;
				}
				break;
			default:
				System.out.println("La opcion introducida no es correcta");
			}
			
		} catch (InputMismatchException e) {
			System.err.println("Introduce valores validos por favor");
			s.next();
		}
		}
	}
}
