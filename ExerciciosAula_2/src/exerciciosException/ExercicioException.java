package exerciciosException;

import java.util.Scanner;

//Exercicio 1: divisao por 0

public class ExercicioException {
	public static void main(String args[]) {
		boolean correto = false;
		System.out.println("Divisao por 0");
		try {

			System.out.println(10 / 0);

		} catch (ArithmeticException e) {
			System.out.println("exceção" + e.getMessage());
		}
		// fosse ao contrario não da pq exceptions são lidas de cima para baixo!
		catch (Exception e) {
			System.out.println("exceção aritmética " + e.getMessage());
		}
		// Exercicio 2: aceder a uma string null/com tamanho menor do que a posiçao que
		// estamos a tentar aceder

		while (!correto) {

			try {
				System.out.println("*** Pedir um nome e imprimir as 3 primeiras letras ***\n");

				Scanner consola = new Scanner(System.in);

				System.out.println("Escreva o seu nome: ");
				String nomeInserido = consola.nextLine();
				System.out.println("As 3 primeiras letras do seu nome são:  " + nomeInserido.substring(0, 3));
				consola.close();
				correto = true;
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Não é possível porque: " + e.getMessage() + " Tente novamente\n");
			}
		}

	}

}
