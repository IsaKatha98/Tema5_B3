package ejercicios;

import java.util.Arrays;
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
		int[] tablaPares = new int[0];
		int[] tablaImpares= new int [0];

		int valor;
		int indexPares=0; // Variable que indica la posición de la tablaPares.
		int indexImpares=0; //Variables que indica la posición de la tablaImpares.

		// Creamos un escáner para poder leer los datos que introduzca el usuario por
		// consola.

		Scanner sc = new Scanner(System.in);

		// Pedimos los datos y hacemos el bucle for correspondiente.
		// el bucle for se repetirá hasta que llegue al tamaño de la tabla.
		for (int i = 0; i < tablaEnteros.length; i++) {

			System.out.print("Introduzca un número y pulse Intro: ");
			tablaEnteros[i] = sc.nextInt();
			
			valor= tablaEnteros[i]; 
			
			//Ahora separamos los números pares de los impares.
			//En caso de que sean pares, guardamos esos números en la tablaPares.
			if (valor%2==0) {
				
				//Para ello, necesitamos que la tablaPares vaya aumentando según necesidad.
				tablaPares= Arrays.copyOf(tablaPares, tablaPares.length+1);
				
				//Ahora, guardaremos los valores en la tablaPares.
				tablaPares[indexPares]=valor;
				
				//Aumentamos en 1 la posición que tiene la tabla.
				indexPares++;
				
			//Repetimos lo mismo con los números impares.
			} else {
				
				tablaImpares= Arrays.copyOf(tablaImpares, tablaImpares.length+1);
				
				tablaImpares [indexImpares]= valor;
				
				indexImpares++;
			}

		}
		
		//Imprimimos las dos tablas.
		
		System.out.println("A continuación se muestra la tabla de números pares: ");
		System.out.println(Arrays.toString(tablaPares));
		
		System.out.println("Y la tabla de números impares: ");
		System.out.println(Arrays.toString(tablaImpares));
		
		//Cerramos el escáner.
		sc.close();
	}

}
