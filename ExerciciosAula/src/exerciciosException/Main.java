package exerciciosException;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva um nome: ");
		//String nome = sc.nextLine();
		String nome = "Juan";
		// String nome = null;

		try {
			// validador(null); // n entra assim tenha outra bem
			validador(nome);
			validador("pedro");
		}
		/*
		 * catch (Exception e) {
		 * 
		 * System.out.println("Exception" + e.getMessage()); }
		 */
		catch (SemLetraAException e) {

			System.out.println("Ocorreu um erro: " + e.getMessage());
		} catch (NullPointerException e) {

			System.out.println("valor null: ,NullPointerException  " + e.getMessage());
		} catch (Exception e) {

			System.out.println("Exception" + e.getMessage());
		} finally {
			sc.close();
			System.out.println("Acabou");

		}

	}

	public static void validador(String aNome) throws SemLetraAException { // funçao para treinar o throw
		if (!(aNome.contains("a") || aNome.contains("A"))) {
			throw new SemLetraAException();

		} else {
			System.out.println("GOOD! o nome inserido tem uma letra A");
		}

	}
}