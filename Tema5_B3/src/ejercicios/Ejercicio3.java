package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la tabla de tamaño 10.
		int[] tabla = new int[10];
		
		//Creamos una nueva tabla, con la longitud de la original.
		int[] tablaNueva= new int [tabla.length];
		
		int posicionIzq=0;
		int posicionDer= tabla.length-1;

		//Creamos un escáner para poder leer los datos que introduzca el usuario por consola.

		Scanner sc = new Scanner(System.in);

		// Pedimos los datos y hacemos el bucle for correspondiente.
		// el bucle for se repetirá hasta que llegue al tamaño de la tabla.
		for (int i = 0; i < tabla.length; i++) {

			System.out.print("Introduzca un número y pulse Intro: ");
			tabla[i] = sc.nextInt();
			
			//Declaramos las variables donde colocaremos los números. Los primos a la 
			//izquierda y los no primos, a la derecha; dentro de un bucle for.
			
			//Comprobamos que son primos.
			boolean esPrimo=true;
			
			for (int j=2; j<=tabla [i]/2; j++) {
				
				if (tabla[i]%j==0) {
					
					esPrimo=false;
					break;
					
				}
			}
				
			if (esPrimo==true) {
				
				//Asignamos los valores de la tabla original a la nueva.
				tablaNueva[posicionIzq]=tabla[i];
				
				//Sumamos una posición desde la izquierda.
				posicionIzq++;
			
			} else {
				
				//Asignamos los valores de la tabla original a la nueva.
				tablaNueva[posicionDer]=tabla[i];
				
				//Quitamos una posición desde la derecha.
				posicionDer--;
			}

		}
		
		//Imprimimos la tabla.
		System.out.println(Arrays.toString(tablaNueva));
		
		//Cerramos el escáner.
		sc.close();
	}

}
