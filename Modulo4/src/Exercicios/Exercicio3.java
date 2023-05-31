package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = ler.nextInt();
		boolean ehPrimo = isPrimo(numero);
		System.out.println(isPrimo(numero));
	}

	public static boolean isPrimo(int numero) {
		if (numero <= 1) {//verifica se é menor ou igual a 1
			return false;
		}
		for (int i = 2; i <= numero / 2; i++) {
			if (numero % i == 0) { //verifica se o resto dar 0
				return false;
			}
		}
		return true;
	}

}
