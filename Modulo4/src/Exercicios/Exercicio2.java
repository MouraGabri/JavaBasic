
package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o tamanho do vetor:");
		int tamanhoArray = ler.nextInt();

		int array[] = new int[tamanhoArray];

		for (int i = 0; i < array.length; i++) {// percorre as posições do array
			System.out.println("Digite o valor na posição " + i + ": ");
			array[i] = ler.nextInt();
		}

		System.out.println("Valores no array:");// percorrer as posições e mostrando os valores
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posição " + i + ": " + array[i]);
		}

		double media = calcularMedia(array);// passando resultado para variavel media
		System.out.println("Média aritmética: " + media);
	}

	public static double calcularMedia(int[] numeros) { // metodo pra calcular a media
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		double media = (double) soma / numeros.length;// feita a média
		return media;

	}

}