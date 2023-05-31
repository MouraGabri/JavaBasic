package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
//escreva um programa Java que declare uma matriz 3x3 de doubles e preencha-a com 
	// os valores 1.0, 2.5 e 3.7 (para todas as linhas). Em seguida, use dois loops
	// 'for'
	// aninhados para imprimir cada elemento da matriz
	// e a soma dos valores da coluna.
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");//usado quando queremos duas casas decimais.
		Scanner ler = new Scanner(System.in);
        double soma = 0.0;
		double[][] matriz = { 
				{ 1.0, 2.5, 3.7 },
				{ 1.0, 2.5, 3.7 }, // declarei os valores da matriz 3x3
				{ 1.0, 2.5, 3.7 } };

		for (int i = 0; i < 3; i++) { // incremento para percorrer as linhas
			for (int j = 0; j < 3; j++) { // incremento para percorrer as colunas
				System.out.print(matriz[i][j]);
			
			System.out.print("  ");
			System.out.println();
			}
		}
		
		for (int j = 0; j < matriz[0].length; j++) { // percorre as colunas da matriz
            double somaColuna = 0.0; // aqui vai armazenar  a soma das colunas
            for (int i = 0; i < matriz.length; i++) {// percorrer as linhas
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + j + ": " + decimalFormat.format(somaColuna));
					
		}
	}


}
