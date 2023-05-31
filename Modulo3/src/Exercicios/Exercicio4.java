package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		 int[] array = {10,20,80,40,50};
		int num = 0; //Maior valor até o momento. vai percorrer o array.
		for (int i = 0; i < array.length; i++) {//percorre o vetor	
			if (num < array[i]) { //verifica se valor de num = 0, for menor que o indice i,
				                  // sera atualizado com o novo valor, no caso o do indice i
				num = array[i]; // quando encontrado um valor maior enquanto percorreu.
			}
		}
		System.out.printf("Maior valor: " + num);
		
	}

}
