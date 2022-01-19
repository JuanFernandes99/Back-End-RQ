package resolucaoExercicios;

//Exercicio 6_1 : Pedir dois número e gerar um número aleatório entre os dois números;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6_1 {
	public static void main(String args[]) {
		System.out.println("*** Geração de aleatórios (entre dois números) ***"); // Exercício

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o número mínimo: ");
		int numeroMinimo = consola.nextInt();
		System.out.println("Escreva o número máximo: ");
		int numeroMaximo = consola.nextInt();

		int aleatorioGerado = geraAleatorio(numeroMinimo, numeroMaximo); // Chamada à função

		System.out.println(
				"O seu número aleatório entre " + numeroMinimo + " e " + numeroMaximo + " é: " + aleatorioGerado);

		consola.close();

	}

	public static int geraAleatorio(int aNumeroMinimo, int aNumeroMaximo) {
		Random geradorAleatorios = new Random();

		int diferencaEntreNumeros = aNumeroMaximo - aNumeroMinimo;
		int aleatorioGerado = geradorAleatorios.nextInt(diferencaEntreNumeros) + aNumeroMinimo;

		return aleatorioGerado;
	}
}
