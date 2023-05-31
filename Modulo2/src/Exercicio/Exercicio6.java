package Exercicio;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um Horário:");
		int numero = ler.nextInt();

		if (numero <= 6) {
			System.out.println("Boa Madrugada");
		} else if (numero <= 11) {
			System.out.println("Bom dia");
		} else if (numero <= 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		ler.close();
	}

}
