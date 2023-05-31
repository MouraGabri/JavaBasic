package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Escreva um programa Java que declare um vetor de Strings e preencha-o com
		// nomes de alimentos.
		// Em seguida, use um loop 'while' para perguntar ao usuário quais alimentos ele
		// deseja encontrar e,
		// se encontrados, imprimir a posição e o nome do alimento no vetor.
		Scanner ler = new Scanner(System.in);

		String[] Alimentos = new String[3];

		System.out.println("Escreva algum alimento:");
		for (int i = 0; i < Alimentos.length; i++) {
			Alimentos[i] = ler.nextLine();
		}

		System.out.println("Qual alimento deseja encontrar?");
		String buscarAlimento = ler.nextLine();
		
		int buscar = 0;
		while (buscar < Alimentos.length) {
		    if (Alimentos[buscar].equals(buscarAlimento)) { 
		        System.out.printf("Encontrado na posição: " + buscar);
		        break; 
			}
			buscar++;

		}
		ler.close();
	}
}
