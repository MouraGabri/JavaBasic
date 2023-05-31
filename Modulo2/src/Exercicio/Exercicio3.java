package Exercicio;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe um  número de 1 a 7: ");
		int numero = ler.nextInt();
		String dia;

		switch (numero) {

		case 1:
			dia = "Segunda";
			break;

		case 2:
			dia = ("Terça");
			break;

		case 3:
			dia = ("Quarta");
			break;

		case 4:
			dia = ("Quinta");
			break;

		case 5:
			dia = ("Sexta");
			break;

		case 6:
			dia = ("Sabádo");
			break;

		case 7:
			dia = ("Domingo");
			break;

		default:
			dia = ("Esse dia não existe");
			break;

		}
		System.out.println("O numero digitado corresponde ao dia: " + dia);
		ler.close();

	}

}
