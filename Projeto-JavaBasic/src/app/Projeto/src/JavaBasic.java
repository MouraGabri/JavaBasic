import java.util.Random;
import java.util.Scanner;

public class JavaBasic {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String matrizUsuarios[][] = new String[4][6];
		int escolha;

		do {
			System.out.println("\n------------------Jornada Bank----------------------\n"

					+ "1) criar conta:\n"  
					+ "2) fazer deposito:\n" 
					+ "3) fazer saque:\n" 
					+ "4) fazer transferencia:\n"
					+ "5) mostrar contas cadastradas:\n" 
					+ "0) sair do programa:");
			 escolha = ler.nextInt();
			switch (escolha) {

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
				break;

			case 5:
				mostrarcontascadastradas(matrizUsuarios);
                 break;
                 
			default:
				break;
			}
			
           
		} while (escolha  != 0);
		System.out.println("Programa encerrado");
		
	}

	private static void mostrarcontascadastradas(String[][] matrizUsuarios) {
		
		System.out.println("\nDados da Matriz:\n"
				+ "nome / CPF / E-mail / Senha / Conta / Saldo");
		
		for(int i = 0; i<matrizUsuarios.length;i++) {
			for(int j = 0; j<matrizUsuarios[i].length; j++) {
				System.out.print(matrizUsuarios[i][j] + "--");
			}
			System.out.println();
		}
		
		
		
	}

	private static void fazertransferencia(String[][] matrizUsuarios) {

	}

	private static void fazersaque(String[][] matrizUsuarios) {

	}

	private static void fazerdeposito(String[][] matrizUsuarios) {

	}

	private static void criarconta(String[][] matrizUsuarios ) {
		Random aleatorio =  new Random();
		 int posicao = encontrarPosicaoVazia(matrizUsuarios);
	      System.out.println("------Crie sua Conta conosco-------");

		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe seu nome completo:");
		matrizUsuarios[posicao][0] = ler.next();
		
		System.out.print("Informe seu cpf:");
        matrizUsuarios[posicao][1] = ler.next();
        
		System.out.print("Informe seu E-mail:");
		matrizUsuarios[posicao][2] = ler.next();
		
		System.out.print("Informe uma senha:");
		matrizUsuarios[posicao][3] = ler.next();
		System.out.print("Conta");
	    matrizUsuarios[posicao][4] = String.valueOf(aleatorio);	
	    int numeroAleatorio = aleatorio.nextInt(5000) + 1;
	
	 
	}

	private static int encontrarPosicaoVazia(String[][] matrizUsuarios) {
		for(int i = 0; i < matrizUsuarios.length;i++) {//percorre as linhas
			for(int j = 0; j < matrizUsuarios.length;j++) {//percorre as colunas
				if(matrizUsuarios[i][j]== null) {//vai mostrar a posição que estiver vazia
					return i;
				}
			}
		}
		return 0;
		
	
	}

}
