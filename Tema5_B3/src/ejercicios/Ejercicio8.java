package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Crea un programa que permita al usuario almacenar una secuencia aritmética en
	 * un array y luego mostrarla. Una secuencia aritmética es una serie de números
	 * que comienza por un valor inicial V, y continúa con incrementos de I. Por
	 * ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la
	 * secuencia sería 7, 17, 27, 37… El programa solicitará al usuario el valor
	 * inicial V, el incremento I y el número de valores a crear N.
	 * 
	 */

	public static void main(String[] args) {

		// Creamos el array de longitud 0 porque no sabemos su tamaño y las variables
		// necesarias.

		int[] tabla = new int[0];
		int valorInicial; //Valor inicial.
		int incremento; //El incremento.
		int numValores; //Valores a crear.

		// Creamos un escáner para poder leer los datos que introduzca el usuario por
		// consola.

		Scanner sc = new Scanner(System.in);
		
		//Solicitamos los datos al usuario.
		System.out.print("Introduzca el valor inicial de la secuencia aritmética y pulse Intro: ");
		valorInicial= sc.nextInt();
		
		System.out.print("Introduzca el valor inicial de la secuencia aritmética y pulse Intro: ");
		valorInicial= sc.nextInt();
		
	}

}
