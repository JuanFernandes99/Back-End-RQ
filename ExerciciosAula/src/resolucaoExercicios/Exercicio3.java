package resolucaoExercicios;

//Exercicio 3: Pedir dois números e devolver o maior;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[]) {
		System.out.println("*** Pedir dois números e devolver o maior ***"); // Exercício

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o primeiro número: ");
		int primeiroNumero = consola.nextInt();

		System.out.println("Escreva o segundo número: ");
		int segundoNumero = consola.nextInt();

		if (primeiroNumero > segundoNumero) // Efetuar a comparação para ver qual o maior e devolvê-lo na consola
		{
			System.out.println("O maior número é: " + primeiroNumero);
		} else {
			System.out.println("O maior número é: " + segundoNumero);
		}

		consola.close();
	}
}
