package app;

import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String matrizUsuarios[][] = new String[4][6];
      
		int escolha = 0;
		do {
			
							System.out.println("Bora");
				
			System.out.println("\n------------------Jornada Bank----------------------\n"
	      
				
		+ "1) criar conta:\n"
		+ "2) fazer deposito:\n" 
		+ "3) fazer saque:\n" 
		+ "4) fazer transferencia:\n"
		+ "5) mostrar contas cadastradas:\n" 
		+ "0) sair do programa:");

			int escolha11 = ler.nextInt();
			switch (escolha11) {
		
			case 1:
				criarconta(matrizUsuarios);
				break;

			case 2:
				fazerdeposito(matrizUsuarios);
				break;

			case 3:
				fazersaque(matrizUsuarios);
				break;

			case 4:

				fazertransferencia(matrizUsuarios);
				
			case 5:
				mostrarcontascadastradas(matrizUsuarios);
				
			}
			break;
			
		} while (escolha == 0);
		
		System.out.println("Programa encerrado");

	}

	private static void mostrarcontascadastradas(String[][] matrizUsuarios) {
		
	}

	private static void fazertransferencia(String[][] matrizUsuarios) {

	}

	private static void fazersaque(String[][] matrizUsuarios) {

	}

	private static void fazerdeposito(String[][] matrizUsuarios) {

	}

	private static void criarconta(String[][] matrizUsuarios) {
	}
}
