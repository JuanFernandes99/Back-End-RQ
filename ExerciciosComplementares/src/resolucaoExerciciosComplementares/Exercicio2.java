package resolucaoExerciciosComplementares;

import java.util.Scanner;

//Exercicio 2: Pedir um n�mero e devolver o seu antecessor e o seu sucessor;

public class Exercicio2 {
	public static void main(String args[]) {
		System.out.println("Escreva um n�mero e ser� retornado o seu antecessor e o seu sucessor");

		Scanner numero = new Scanner(System.in);
		int numeroInserido = numero.nextInt();
		int antecessor = numeroInserido - 1;
		int sucessor = numeroInserido + 1;

		System.out.println("n�mero antecessor: " + antecessor);
		System.out.println("n�mero: " + numeroInserido);
		System.out.println("n�mero sucessor: " + sucessor);

		numero.close();

	}
}
