package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		//Creamos la tabla de tamaño 15.
		int [] tabla= new int [15];
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
										
		Scanner sc= new Scanner (System.in); 
				
		//Pedimos los datos y hacemos el bucle for correspondiente.		
		//el bucle for se repetirá hasta que llegue al tamaño de la tabla.
		for (int i=0; i<tabla.length; i++) {
		
			System.out.print("Introduzca un número y pulse Intro: ");
			tabla[i]=sc.nextInt();
			
		}
		
		//Ahora vamos a hacer una copia de la tabla, para ello crearemos otra tabla.
		int[] tablaNueva= new int [tabla.length];
		
		//Guardamos el ultimo valor de la tabla en una variable.
		int valor = tabla[tabla.length-1];
		
		//Hacemos la copia de la tabla, moviendo 1 una posición los valores de la tabla original.
		System.arraycopy(tabla, 0, tablaNueva, 1 , tablaNueva.length-1);
		
		//Asignamos en la primera posición de la tabla nueva, el último valor de la tabla original.
		tablaNueva[0] = valor;
			
		//Imprimimos la tabla.
		System.out.println(Arrays.toString(tablaNueva));
			
		//Cerramos el escáner.
		sc.close();
	}

}
