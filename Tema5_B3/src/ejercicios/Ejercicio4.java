package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la tabla de tamaño 10.
		int[] tablaEnteros = new int[10];

		// Creamos una nueva tabla, de tamaño 0 porque no sabemos cómo de grande será.
		int[] tablaNueva = new int[0];

		int indexNuevo=0; //Variable que hará de contador.

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
		
		//Recorremos la tabla nueva y hacemos una búsqueda.
		for (int i=0; i<tablaEnteros.length; i++) {
			
			//Asignamos en una variable valor los elementos de la tabla.
			int valor= tablaEnteros[i];
			
			//Hacemos una búsqeda si ese valor ya existe en la tabla nueva y lo guardamos en la variable posición.
			int posicion= Arrays.binarySearch(tablaNueva, valor);
			
			//Hacemos un if para saber si el elemento está en la tabla nueva.
			//En caso de que la posición sea negativa, significa que no está en la tabla nueva.
			if (posicion<0) {
				
				//Si no encuentra la posición en la tabla, significa que no existe el elemento,
				//por lo que hay que copiarlo en la tabla nueva.
				
				//Ahora hacemos que en la tabla nueva se añada una posición más.
				tablaNueva= Arrays.copyOf(tablaNueva, tablaNueva.length+1);
				
				//Asignamos a una posición de la tabla un valor.
				tablaNueva[indexNuevo]=valor;
				
				//Sumamos 1 a las posiciones.
				indexNuevo++;
				
			}
		}
		
		//Imprimimos la tabla nueva.
		System.out.println(Arrays.toString(tablaNueva));
		
		//Cerramos el escáner.
		sc.close();

	}

}
