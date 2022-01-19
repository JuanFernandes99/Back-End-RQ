package resolucaoExerciciosComplementares;

import java.util.Scanner;

//Exercicio 3: Pedir o nome de um aluno e as notas das 3 frequências que ele teve numa cadeira. No final informar o nome do aluno e a sua média
//(assumindo que as 3 frequências têm o mesmo peso). Informar ainda se o aluno passou (>=10 valores);

public class Exercicio3 {
	public static void main(String args[]) {
		System.out.println("Escreva o seu nome");

		Scanner nomeAluno = new Scanner(System.in);
		String nomeAlunoInserido = nomeAluno.next();
		System.out.println("Aluno: " + nomeAlunoInserido);
		System.out.println(" ");

		Scanner notaFrequencia = new Scanner(System.in);

		System.out.println("Escreva a nota da 1ª Frequência");
		double notaFreq1 = notaFrequencia.nextDouble();
		System.out.println("Escreva a nota da 2ª Frequência");
		double notaFreq2 = notaFrequencia.nextDouble();
		System.out.println("Escreva a nota da 3ª Frequência");
		double notaFreq3 = notaFrequencia.nextDouble();

		double mediaNotas = (notaFreq1 + notaFreq2 + notaFreq3) / 3;

		System.out.println("Aluno: " + nomeAlunoInserido + "  média: " + mediaNotas);
		System.out.println(" ");
		if (mediaNotas >= 10) {
			System.out.println("Passou :) ");

		} else {
			System.out.println("Não passou :( ");
		}

		notaFrequencia.close();
		nomeAluno.close();

	}
}
