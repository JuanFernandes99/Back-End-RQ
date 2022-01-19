package resolucaoExercicios;

//Exercicio 6_1 : Pedir dois n�mero e gerar um n�mero aleat�rio entre os dois n�meros;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6_1 {
	public static void main(String args[]) {
		System.out.println("*** Gera��o de aleat�rios (entre dois n�meros) ***"); // Exerc�cio

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o n�mero m�nimo: ");
		int numeroMinimo = consola.nextInt();
		System.out.println("Escreva o n�mero m�ximo: ");
		int numeroMaximo = consola.nextInt();

		int aleatorioGerado = geraAleatorio(numeroMinimo, numeroMaximo); // Chamada � fun��o

		System.out.println(
				"O seu n�mero aleat�rio entre " + numeroMinimo + " e " + numeroMaximo + " �: " + aleatorioGerado);

		consola.close();

	}

	public static int geraAleatorio(int aNumeroMinimo, int aNumeroMaximo) {
		Random geradorAleatorios = new Random();

		int diferencaEntreNumeros = aNumeroMaximo - aNumeroMinimo;
		int aleatorioGerado = geradorAleatorios.nextInt(diferencaEntreNumeros) + aNumeroMinimo;

		return aleatorioGerado;
	}
}
