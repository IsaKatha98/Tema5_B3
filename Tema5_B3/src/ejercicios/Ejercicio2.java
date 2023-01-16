package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
	
	//Declaramos las variables.
	int[] tabla= new int [20];//Tabla de longitud 20.
	
	//Creamos una nueva tabla, con la longitud de la original.
	
	int[] tablaNueva= new int [tabla.length];
	
	int posicionIzq=0;
	int posicionDer= tabla.length-1;
	
	//Generamos 20 números aleatorios y los guardamos en el array.
	for (int i=0; i<tabla.length; i++) {
		
		//Hacemos la cuenta de los números aleatorios entre 1 y 100.
		tabla[i]=(int)(Math.random()*100+1);
		
		//Declaramos las variables donde colocaremos los números. Los pares a la 
		//izquierda y los impares, a la derecha.
		if (tabla[i]%2==0) {
			
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
	}

}
