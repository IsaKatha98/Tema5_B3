package ejercicios;

import java.util.Arrays;

public class Ejercicio6 {

	/*
	 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array 
	 * todos los valores del 1 al 100. Por último, deberá copiar todos los valores del primer array al 
	 * segundo array en orden inverso, y mostrar ambos por pantalla.
	 */
	
	public static void main(String[] args) {
		
		//Creamos dos arrays de tamaño cien.
		 
		int [] tabla= new int[100]; 
		int [] tablaInversa= new int [100];
		
		//Rellenamos el primer array de 1 a 100.
		
		for (int i= 0; i<tabla.length; i++) {
			
			//Le sumamos 1 para que inice la tabla en 1 y no en 0.
			tabla [i]=i+1;
			
		}
		
		System.out.println(Arrays.toString(tabla));
		
		//Ahora, rellenaremos el array tabla Inversa a la inversa.
		//Para ello, recorremos la tablaInversa y asignamos la longitud menos la i.
		
		for (int i=0; i<tabla.length; i++) {
			tablaInversa [tabla.length-1-i] = tabla[i];
		}
		
		System.out.println(Arrays.toString(tablaInversa));
	}
	

}
