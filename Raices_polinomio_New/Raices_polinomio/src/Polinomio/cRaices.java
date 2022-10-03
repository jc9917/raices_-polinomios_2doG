package Polinomio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cRaices {
	long a, b, c;

	cRaices(long a, long b, long c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void LeerDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el valor de a");
		try {
			do {
				a = entrada.nextLong();
			} while (a != 0);
		} catch (InputMismatchException ex) {
			System.out.println("Debe ingresar obligatoriamente un número entero.");
		}

		System.out.println("Ingrese el valor de b");
		try {

			b = entrada.nextLong();

		} catch (InputMismatchException ex) {
			System.out.println("Debe ingresar obligatoriamente un número entero.");
		}

		System.out.println("Ingrese el valor de c");
		try {

			c = entrada.nextLong();

		} catch (InputMismatchException ex) {
			System.out.println("Debe ingresar obligatoriamente un número entero.");
		}

	}

}
