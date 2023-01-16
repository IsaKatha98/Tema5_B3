package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la tabla de tamaño 10.
		int[] tablaEnteros = new int[10];

		// Creamos una nueva tabla, de tamaño 0 porque no sabemos cómo de grande será.
		int[] tablaNueva = new int[0];

		int numDobles; //Variable donde se copiarán los números dobles.

		// Creamos un escáner para poder leer los datos que introduzca el usuario por
		// consola.

		Scanner sc = new Scanner(System.in);
		
		// Pedimos los datos y hacemos el bucle for correspondiente.
		// el bucle for se repetirá hasta que llegue al tamaño de la tabla.
		for (int i = 0; i < tablaEnteros.length; i++) {

			System.out.print("Introduzca un número y pulse Intro: ");
			tablaEnteros[i] = sc.nextInt();
			
		}
		
		//Ahora, ordenamos la tabla original.
		Arrays.sort(tablaEnteros);
		
		//Una vez ordenada, hacemos una copia y hacemos una búsqueda de los números repetidos.
		tablaNueva= Arrays.copyOf(tablaEnteros, tablaEnteros.length);
		
		//Recorremos la tabla nueva y hacemos una búsqueda.
		for (int tablaRecorrido: tablaNueva) {
			
			numDobles= Arrays.binarySearch(tablaNueva,tablaEnteros[i]);
			
			
		}
					

	}

}
