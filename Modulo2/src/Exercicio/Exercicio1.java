package Exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um número para A:");
		int A = ler.nextInt();

		System.out.println("Informe um número para B:");
		int B = ler.nextInt();

		int soma = A + B;
		System.out.println("A soma de A + B é:" + soma);

		ler.close();
	}

}
