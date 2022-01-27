package resolucaoExercicios;

//Exercicio 7: Pedir o vosso nome, colocar tudo em maiúsculas e substituir todas as ocorrências de um caractere por um número;

import java.util.Scanner;

public class NomeMaiusculaESubstituirCaracter {
	public static void main(String args[]) {
		System.out.println(
				"*** Pedir um nome, colocar em maiúsculas, subsituir uma letra por um número e imprimir as 3 primeiras letras ***"); // Exercício

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o seu nome: ");
		String nomeInserido = consola.nextLine();

		String nomeEmMaiusculas = nomeInserido.toUpperCase();
		System.out.println("O seu nome em maiúsculas é:  " + nomeEmMaiusculas);

		String nomeComNumeros = nomeInserido.replaceAll("a", "4");

		System.out.println("O seu nome em maiúsculas é com números:  " + nomeComNumeros);

		System.out.println("As 3 primeiras letras do seu nome são:  " + nomeInserido.substring(0, 3)); // E se o nome
																										// tiver menos
																										// de 3
																										// caracteres!?
																										// O que
																										// acontece?

		consola.close();

	}

}
