package resolucaoExercicios_2;
//Exercicio 6 : Pedir o nome e escrever se o tamanho deste � par ou �mpar;

import java.util.Scanner;

public class TamanhoParOuImpar {
	public static void main(String args[]) {
		System.out.println("*** Pedir o nome completo e  escrever se o tamanho deste � par ou �mpar ***"); // Exerc�cio

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o seu nome completo: ");
		String nomeInserido = consola.nextLine();
		System.out.println(nomeInserido);
		System.out.println("Tamanho: " + nomeInserido.length());

		if (nomeInserido.length() % 2 == 1) {
			System.out.println("Tamanho impar");
		} else {
			System.out.println("Tamanho par");
		}
		consola.close();
	}
}
