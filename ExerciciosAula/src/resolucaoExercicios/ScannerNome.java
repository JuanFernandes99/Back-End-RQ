package resolucaoExercicios;

//Exercicio 2: Escrever e pedir informações pela consola.

import java.util.Scanner;

public class ScannerNome {
	public static void main(String args[]) {
		System.out.println("*** Escrever e pedir informações pela consola ***"); // Exercício

		Scanner in = new Scanner(System.in); // Abrir comunicação com a consola

		System.out.println("Escreva o seu nome: ");
		String nomeInserido = in.next(); // Efetuar a leitura da próxima linha da consola

		System.out.println("O seu nome é: " + nomeInserido); // Imprimir a que foi lido

		in.close(); // Fechar a comunicação
	}
}
