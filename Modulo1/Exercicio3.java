package Modulo1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double Celsius;
		double Kelvin;
		double Fahrenheit;
		double calculofahrenheit;
		double calculokelvin;

		System.out.println("Infome uma temperatura em Celsius: ");
		Celsius = ler.nextDouble();

		calculofahrenheit = (Celsius * 9 / 5) + 32;
		calculokelvin = Celsius + 273.15;

		System.out.println("Temperatura em Fahrenheit:" + calculofahrenheit);
		System.out.println("Temperatura em Kelvin:" + calculokelvin);
		ler.close();
	}

}
