package resolucaoExercicios;

//Exercicio 3: Pedir dois n�meros e devolver o maior;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[]) {
		System.out.println("*** Pedir dois n�meros e devolver o maior ***"); // Exerc�cio

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o primeiro n�mero: ");
		int primeiroNumero = consola.nextInt();

		System.out.println("Escreva o segundo n�mero: ");
		int segundoNumero = consola.nextInt();

		if (primeiroNumero > segundoNumero) // Efetuar a compara��o para ver qual o maior e devolv�-lo na consola
		{
			System.out.println("O maior n�mero �: " + primeiroNumero);
		} else {
			System.out.println("O maior n�mero �: " + segundoNumero);
		}

		consola.close();
	}
}
