package resolucaoExercicios;

//Exercicio 2: Escrever e pedir informa��es pela consola.

import java.util.Scanner;

public class ScannerNome {
	public static void main(String args[]) {
		System.out.println("*** Escrever e pedir informa��es pela consola ***"); // Exerc�cio

		Scanner in = new Scanner(System.in); // Abrir comunica��o com a consola

		System.out.println("Escreva o seu nome: ");
		String nomeInserido = in.next(); // Efetuar a leitura da pr�xima linha da consola

		System.out.println("O seu nome �: " + nomeInserido); // Imprimir a que foi lido

		in.close(); // Fechar a comunica��o
	}
}
