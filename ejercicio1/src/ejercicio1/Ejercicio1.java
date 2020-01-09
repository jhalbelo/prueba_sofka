package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int kilometros, dias;
		System.out.printf("Ingrese el numero de kilometros \n");
		kilometros = in.nextInt();
		System.out.printf("Ingrese el numero de dias \n");
		dias = in.nextInt();
		if (kilometros > 1000 && dias > 7) {
			System.out.printf("El valor del pasaje de avion es: " + kilometros * 35.0 *0.7);
		}
		else {
			System.out.printf("El valor del pasaje de avion es: " + kilometros * 35.0);
		}
	}

}
