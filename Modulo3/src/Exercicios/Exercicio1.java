package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o tamanho do Vetor:");
		int array = ler.nextInt(); // usuário vai definar o tamanho do array

		String[] paises = new String[array]; // criei um array paises, onde o usario vai
												// informar o tamanho do array através do[array]

		for (int i = 0; i < paises.length; i++) { // i = indice 0 do nosso array, e vai contar
													// até o i for menor que o tamanho do array, fornecido pelo
													// usuário. E enquanto, for menor que o tamanho do array
													// vai pedir o nome do pais.
			System.out.println("Digite o nome do país na posição: " + i + " :");
			paises[i] = ler.next();

		}

		for (int i = 0; i < paises.length; i++) { // vai percorrer por todos os elementos do array paises,
													// onde os valores das posiçãos i, já foi definido à cima
													// e vai ser impresso assim:[paises[i] = onde paises é o
													// tamanho do array e i = é o valor na posição "i" do array.
			System.out.println("Os paises informados  na posição: " + i + ":" + paises[i]);

		}
		ler.close();
	}
}
