package resolucaoExerciciosComplementares;

import java.util.Scanner;

//Exercicio 4: Pedir um número e informar se este está no intervalo entre 50 e 100;

public class Exercicio4 {
	public static void main(String args[]) {
		
		System.out.println("Escreva um número e será informado se este está no intervalo entre 50 e 100");

		Scanner numero = new Scanner(System.in);
		int numeroInserido = numero.nextInt();
		
    if (numeroInserido >= 50 && numeroInserido <= 100) {
    	System.out.println("O número está no intervalo entre 50 e 100");
	}
    else {
    	System.out.println("O número Não está no intervalo entre 50 e 100");
	}

		numero.close();

}
}