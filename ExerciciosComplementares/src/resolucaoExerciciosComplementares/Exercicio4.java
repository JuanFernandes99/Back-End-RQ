package resolucaoExerciciosComplementares;

import java.util.Scanner;

//Exercicio 4: Pedir um n�mero e informar se este est� no intervalo entre 50 e 100;

public class Exercicio4 {
	public static void main(String args[]) {
		
		System.out.println("Escreva um n�mero e ser� informado se este est� no intervalo entre 50 e 100");

		Scanner numero = new Scanner(System.in);
		int numeroInserido = numero.nextInt();
		
    if (numeroInserido >= 50 && numeroInserido <= 100) {
    	System.out.println("O n�mero est� no intervalo entre 50 e 100");
	}
    else {
    	System.out.println("O n�mero N�o est� no intervalo entre 50 e 100");
	}

		numero.close();

}
}