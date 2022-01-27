package resolucaoExercicios;

//Exercicio 5 : Calcular a idade atual a partir do ano de nascimento.

import java.util.Calendar;
import java.util.Scanner;

public class IdadeAnoNascimento {
	public static void main(String args[]) {
		System.out.println("*** Calcular a idade atual a partir do ano de nascimento ***"); // Exerc�cio

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o seu ano de nascimento: ");
		int anoNascimento = consola.nextInt();

		int idade = calculaIdade(anoNascimento); // Chamada � fun��o

		System.out.println("A sua idade �: " + idade);

		consola.close();

	}

	public static int calculaIdade(int aAnoNascimento) {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR); // Obter o ano atual. Assim funcionar�
																  // independentemente do ano que corram a aplica��o

		return anoAtual - aAnoNascimento;
	}
}
