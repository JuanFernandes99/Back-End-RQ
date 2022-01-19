package resolucaoExerciciosComplementares;

import java.util.Scanner;

//Exercicio 2: Pedir um número e devolver o seu antecessor e o seu sucessor;

public class Exercicio2 {
	public static void main(String args[]) {
		System.out.println("Escreva um número e será retornado o seu antecessor e o seu sucessor");

		Scanner numero = new Scanner(System.in);
		int numeroInserido = numero.nextInt();
		int antecessor = numeroInserido - 1;
		int sucessor = numeroInserido + 1;

		System.out.println("número antecessor: " + antecessor);
		System.out.println("número: " + numeroInserido);
		System.out.println("número sucessor: " + sucessor);

		numero.close();

	}
}
