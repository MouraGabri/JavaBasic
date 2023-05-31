package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite uma palavra ");
		String texto = ler.next();

		if (verificarCarac(texto)) {
			System.out.println("Possui caracteres alfabéticos!");
		} else {
			System.out.println("Não possui caracteres alfabéticos!");
		}
	
	}

	public static Boolean verificarCarac(String mensagem) {
		if (mensagem.matches("[a-zA-Z]+")) {
			return true;
		}

		return false;
	}

}
