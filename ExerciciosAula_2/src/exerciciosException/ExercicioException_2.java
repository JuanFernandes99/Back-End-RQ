package exerciciosException;



import java.util.Scanner;

public class ExercicioException_2 {
	public static void main(String args[]) {
		try {
			System.out.println("*** Pedir um nome e imprimir as 3 primeiras letras ***"); // Exercício

			Scanner consola = new Scanner(System.in);

			System.out.println("Escreva o seu nome: ");
			String nomeInserido = consola.nextLine();
			System.out.println("As 3 primeiras letras do seu nome são:  " + nomeInserido.substring(0, 3));
			consola.close();

		}catch (Exception e) {
			System.out.println("nao é possivel " + e.getMessage());
		}

	}

}