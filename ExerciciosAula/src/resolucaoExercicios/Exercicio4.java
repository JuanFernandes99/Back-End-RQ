package resolucaoExercicios;

// Exercicio 4: Pedir um número e escrever na consola todos os números desde o 0 até ao mesmo;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String args[]) {
		System.out.println("*** Pedir um número e escrever na consola todos os números desde o 0 até ao mesmo ***"); // Exercício

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva um número: ");
		int maiorNumero = consola.nextInt();

		System.out.println("Os números até ao número " + maiorNumero + " são: ");

		for (int i = 0; i <= maiorNumero; i++) {
			System.out.println(i);
		}

		consola.close();

	}
}
