package resolucaoExercicios;

//Exercicio 7: Pedir um nome e imprimir as 3 primeiras letras

import java.util.Scanner;

public class Exercicio7_1 {
	public static void main(String args[]) {
		System.out.println("*** Pedir um nome e imprimir as 3 primeiras letras ***"); // Exercício

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o seu nome: ");
		String nomeInserido = consola.nextLine();
		System.out.println("As 3 primeiras letras do seu nome são:  " + nomeInserido.substring(0, 3)); // E se o nome
																										// tiver menos
																										// de 3
																										// caracteres!?
																										// O que
																										// acontece?
		// Resposta: crashou o código porque ele está a procurar o valor da string (3)
		// que não existe

		consola.close();

	}

}
