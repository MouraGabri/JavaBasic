package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
// Escreva um programa Java que peça ao usuário quantos números quer ter em uma lista de compras.
		// Em seguida, peça à ele os itens da lista e ao final imprima todos os itens.

		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a quantidade da lista:");
		int numeros = ler.nextInt();

		String ListaCompras[] = new String[numeros];

		for (int i = 0; i < ListaCompras.length; i++) {
			System.out.println("Digite o produto na posição: " + i + ": "   );
			ListaCompras[i] =  ler.next(); // digitar o produto no indice do array. O tamanho vai depender,
		}                                  // do número que o usuario informar.
		for(int i = 0; i<ListaCompras.length;i++) {
			System.out.println("Os produtos selecionados são:" + ListaCompras[i]);
		}
		
		

	}

}
