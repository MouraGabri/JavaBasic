package Modulo1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int calculo;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informa a Largura do Retângulo: ");
		int A = ler.nextInt();

		System.out.println("Informa a Altura do Retângulo: ");
		int B = ler.nextInt();

		calculo = A * B;
		System.out.println("A área do retângulo é: " + calculo);
	}

}
