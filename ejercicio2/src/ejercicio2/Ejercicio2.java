package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int bulto=0, cantidad=0, peso=0, mayor=0, menor=500, menu=10;
		int ingreso= 0;
		while (menu > 0) {
			System.out.println("1. Ingresar bulto");
			System.out.println("2. Ver numero total de bultos");
			System.out.println("3. Ver el bulto mas pesado y el mas liviano");
			System.out.println("4. Ver el peso promedio");
			System.out.println("5. Ver el ingreso en pesos y dolares");
			System.out.println("0. Salir");
			
			menu = in.nextInt();
			switch (menu) {
			case 1:
				System.out.printf("Ingrese el peso del bulto a cargar: ");
				bulto = in.nextInt();
				if (bulto <= 500 && (peso+bulto)<=18000) {
					if (bulto >300) {
						ingreso = ingreso + (bulto * 2500);
					}
					else if (26 <= bulto && bulto <= 300) {
						ingreso = ingreso + (bulto * 1500);
					}
					if (bulto > mayor) {
						mayor = bulto;
					}
					if (bulto < menor) {
						menor = bulto;
					}
					cantidad = cantidad +1;
					peso = peso + bulto;
				}
				else {
					System.out.println("El bulto no se puede cargar porque excede el peso permitido");
				}
				break;
			case 2:
				System.out.println("El numero de bultos cargados es : " + cantidad);
				break;
			case 3:
				if (cantidad > 0 ){
					System.out.println("El bulto mas liviano es: " + menor);
					System.out.println("El bulto mas pesado es: " + mayor);
					
				}
				else {
					System.out.println("Aun no se cargan bultos.");
				}				
				break;
			case 4:
				if (cantidad > 0 ){
					System.out.println("El peso total es: " + peso);
					System.out.println("El peso promedio es: " + (peso/cantidad));					
				}
				else {
					System.out.println("Aun no se cargan bultos.");
				}
				break;
			case 5:
				System.out.println("El ingreso en pesos es: " + ingreso);
				System.out.println("El ingreso en dolares es: " + ingreso/3500);
				break;
			case 0:
				System.out.println("Fin del programa.");
				break;
			default:
				System.out.println("Ingrese una opcion valida.");
			}
		}
		
	}

}
