package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Escribir un programa que lea 10 valores enteros por teclado y los almacene en
	 * una tabla (tablaEnteros). A continuación, debes crear dos tablas: numPares y
	 * numImpares. En numPares almacenarás los números pares que se encuentren en
	 * tablaEnteros y en numImpares almacenarás los números impares.
	 */
	public static void main(String[] args) {

		// Creamos la tabla de tamaño 10.
		int[] tablaEnteros = new int[10];

		// Creamos una nueva tabla, de tamaño 0 porque no sabemos cómo de grande será.
		int[] tablaNueva = new int[0];

		int numDobles; // Variable donde se copiarán los números dobles.

		// Creamos un escáner para poder leer los datos que introduzca el usuario por
		// consola.

		Scanner sc = new Scanner(System.in);

		// Pedimos los datos y hacemos el bucle for correspondiente.
		// el bucle for se repetirá hasta que llegue al tamaño de la tabla.
		for (int i = 0; i < tablaEnteros.length; i++) {

			System.out.print("Introduzca un número y pulse Intro: ");
			tablaEnteros[i] = sc.nextInt();

		}

	}

}
