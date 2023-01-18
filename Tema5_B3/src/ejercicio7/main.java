package ejercicio7;

import java.util.Arrays;
import java.util.Scanner;

public class main {
	
	/*
	 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
		a) Mostrar valores.
		b) Eliminar valor.
		c)Salir.

	La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y eliminará todas las 
	apariciones de V del array. El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que 
	terminará el programa.

	 */

	public static void main(String[] args) {
		
		//Declaramos las variables necesarias.
		String opcion;
		// Creemos los array y las variables pertinentes.
		int[] tabla = new int[10];

		int valor;
		int index;
		//Creamos un escáner.
		Scanner sc= new Scanner (System.in);
		
		
		do {
		
			//Presentamos el menú al usuario y le pedimos que elija una opción.
			System.out.println("Elija una de las siguientes opciones: ");
			System.out.println("a) Mostrar los valores.");
			System.out.println("b) Introducir valores.");
			System.out.println("c) Salir.");
			
			System.out.println("Introduzca su selección: ");
			opcion=sc.next();
			
			switch (opcion) {

			case "A", "a":

				System.out.println(Arrays.toString(tabla));
				break;

			case "B", "b":
				
				//Solicitamos datos otra vez.
				System.out.println("Introduzca el valor que quiere mostrar: ");
				valor=sc.nextInt();
				
				System.out.println("Introduzca la posición en la que quiere mostrar el valor anterior: ");
				index= sc.nextInt();				
			
				if (index <= 10) {

					tabla[index] = valor;

					System.out.println(Arrays.toString(tabla));

				} else {

					System.out.println("Error. No se puede poner un número mayor de 10");
				}
				break;

			case "C", "c":

				System.out.println("Ha salido del programa.");
				break;

			default:
				System.out.println("Error. Opción no válida.");

			}
		
			
		} while(!opcion.equals("c")&&!opcion.equals("C"));
		
		
	}

}
