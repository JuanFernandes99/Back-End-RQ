package resolucaoExercicios;

//Exercicio 6 : Pedir um n?mero e gerar um n?mero aleat?rio at? a esse n?mero;

import java.util.Random;
import java.util.Scanner;

public class AleatorioAteONumero {
	public static void main(String args[]) {
		System.out.println("*** Gera??o de aleat?rios ***"); // Exerc?cio

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva um n?mero: ");
		int numero = consola.nextInt();

		int soma = soma(numero);
		int aleatorioGerado = geraAleatorio(numero); // chamada ? fun??o

		System.out.println(soma);
		System.out.println("O seu n?mero aleat?rio at? " + numero + " ?: " + aleatorioGerado);

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
