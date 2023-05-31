package Exercicio;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe um valor para numero 1: ");
		int numero1 = ler.nextInt();

		System.out.print("Informe um valor para numero 2: ");
		int numero2 = ler.nextInt();

		System.out.print("Informe um valor para numero 3: ");
		int numero3 = ler.nextInt();

		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("Número 1 é menor!");
		}

		else if (numero2 < numero3 && numero2 < numero1) {
			System.out.println("Número 2 é o menor!");
		} else {
			System.out.println("Número 3 é o menor!");
		}
		ler.close();
	}

}
