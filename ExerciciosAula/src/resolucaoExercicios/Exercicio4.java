package resolucaoExercicios;

// Exercicio 4: Pedir um n�mero e escrever na consola todos os n�meros desde o 0 at� ao mesmo;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String args[]) {
		System.out.println("*** Pedir um n�mero e escrever na consola todos os n�meros desde o 0 at� ao mesmo ***"); // Exerc�cio

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva um n�mero: ");
		int maiorNumero = consola.nextInt();

		System.out.println("Os n�meros at� ao n�mero " + maiorNumero + " s�o: ");

		for (int i = 0; i <= maiorNumero; i++) {
			System.out.println(i);
		}

		consola.close();

	}
}
