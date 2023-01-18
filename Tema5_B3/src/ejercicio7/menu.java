package ejercicio7;

import java.util.Arrays;

public class menu {

	// Creemos los array y las variables pertinentes.
	int[] tabla = new int[10];

	int valor;
	int index;

	public void menu(String opcion) {

		while (!opcion.equals("c") || opcion.equals("C")) {

			switch (opcion) {

			case "A", "a":

				System.out.println(Arrays.toString(tabla));
				break;

			case "B", "b":
				
				valores(valor, index);
				break;

			case "C", "c":

				System.out.println("Ha salido del programa.");
				break;

			default:
				System.out.println("Error. Opción no válida.");

			}
		}
	}

	public void valores(int valor, int index) {

		if (index <= 10) {

			tabla[index] = valor;

			System.out.println(Arrays.toString(tabla));

		} else {

			System.out.println("Error. No se puede poner un número mayor de 10");
		}

	}
}
