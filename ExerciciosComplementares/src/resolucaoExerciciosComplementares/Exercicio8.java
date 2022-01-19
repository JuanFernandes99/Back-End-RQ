package resolucaoExerciciosComplementares;
//Exercicio 8 : Pedir uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
//A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String args[]) {
		System.out.println("*** Pedir uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit***"); // Exercício

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva a temperatura em graus Celsius: ");
		double temperaturaInserida = consola.nextDouble();
		System.out.println("Temperatura em graus Celsius: " +temperaturaInserida + " °C" );
		
		
		double temperaturaFahrenheit = (9 * temperaturaInserida + 160) / 5;
		
		System.out.println("Temperatura em graus Fahrenheit: " +temperaturaFahrenheit + " °F" );

		consola.close();
	}

}


