package Modulo1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o valor de A: ");
		int A = ler.nextInt();

		System.out.println("Informe o valor de B: ");
		int B = ler.nextInt();

		int soma = A + B;
		System.out.println("A soma de A e B: " + soma);

		ler.close();
	}

}
