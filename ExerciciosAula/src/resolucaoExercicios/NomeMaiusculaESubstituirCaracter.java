package resolucaoExercicios;

//Exercicio 7: Pedir o vosso nome, colocar tudo em mai�sculas e substituir todas as ocorr�ncias de um caractere por um n�mero;

import java.util.Scanner;

public class NomeMaiusculaESubstituirCaracter {
	public static void main(String args[]) {
		System.out.println(
				"*** Pedir um nome, colocar em mai�sculas, subsituir uma letra por um n�mero e imprimir as 3 primeiras letras ***"); // Exerc�cio

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o seu nome: ");
		String nomeInserido = consola.nextLine();

		String nomeEmMaiusculas = nomeInserido.toUpperCase();
		System.out.println("O seu nome em mai�sculas �:  " + nomeEmMaiusculas);

		String nomeComNumeros = nomeInserido.replaceAll("a", "4");

		System.out.println("O seu nome em mai�sculas � com n�meros:  " + nomeComNumeros);

		System.out.println("As 3 primeiras letras do seu nome s�o:  " + nomeInserido.substring(0, 3)); // E se o nome
																										// tiver menos
																										// de 3
																										// caracteres!?
																										// O que
																										// acontece?

		consola.close();

	}

}
