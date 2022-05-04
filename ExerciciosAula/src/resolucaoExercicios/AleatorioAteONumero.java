package resolucaoExercicios;

//Exercicio 6 : Pedir um número e gerar um número aleatório até a esse número;

import java.util.Random;
import java.util.Scanner;

public class AleatorioAteONumero {
	public static void main(String args[]) {
		System.out.println("*** Geração de aleatórios ***"); // Exercício

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva um número: ");
		int numero = consola.nextInt();

		int soma = soma(numero);
		int aleatorioGerado = geraAleatorio(numero); // chamada à função

		System.out.println(soma);
		System.out.println("O seu número aleatório até " + numero + " é: " + aleatorioGerado);

		consola.close();

	}

	public static int soma(int n) {
		if (n == 0)
			return 0;
		else
			System.out.println(n + soma(n - 1));
		return n + soma(n - 1);
	}

	public static int geraAleatorio(int aNumeroMaximo) {
		Random geradorAleatorios = new Random();

		return geradorAleatorios.nextInt(aNumeroMaximo);
	}

}
