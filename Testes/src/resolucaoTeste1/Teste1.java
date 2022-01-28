package resolucaoTeste1;

//Teste 1: Escreva um programa que pede ao utilizador dois números (inteiros). Com o maior destes, deve chamar uma função que some todos os números
//desde o 0 até esse número (incluíndo). Esse número deve ser depois apresentado ao utilizador.
//Exemplo de input: 2 e 4
//Exemplo de resultado: 10(1+2+3+4)

import java.util.Scanner;

public class Teste1 {
	public static void main(String args[]) {
		Scanner consola = new Scanner(System.in);
		System.out.println(
				"Programa para comparar dois números e com o maior destes, somar todos os números de 0 até esse numero (incluindo)");
		System.out.println("Escreva o primero número");
		int numero1 = consola.nextInt();
		System.out.println("Escreva o segundo número");
		int numero2 = consola.nextInt();

		if (numero1 > numero2) {
			int numeroMaior = somaNumeroMaior(numero1);
			System.out.print("O resultado é: " + numeroMaior);
		} else {
			int numeroMaior = somaNumeroMaior(numero2);
			System.out.print("O resultado é: " + numeroMaior);
		}

		consola.close();
	}

	public static int somaNumeroMaior(int aNumeroMaior) {
		int soma = 0;
		for (int i = 0; i <= aNumeroMaior; i++) {
			soma = soma + i;
		}
		return soma;
	}
}
