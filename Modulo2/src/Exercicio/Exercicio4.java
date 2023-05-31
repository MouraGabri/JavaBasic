package Exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print(" Digite seu nome:");
		String nome = ler.next();

		System.out.print("Informe sua idade:");
		int idade = ler.nextInt();

		System.out.print("Informe sua cidade:");
		String cidade = ler.next();

		System.out.print("Informe o estado de onde você mora:");
		String estado = ler.next();

		System.out.println("Olá, seu nome é " + nome + ", você tem " + idade + " anos, é da cidade de " + cidade
				+ ", situada no estado de " + estado);

		ler.close();

	}

}
