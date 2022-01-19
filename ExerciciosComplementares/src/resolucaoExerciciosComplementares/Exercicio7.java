package resolucaoExerciciosComplementares;

import java.util.Scanner;

//Exercicio 7 : Pedir o nome e inverter a ordem (João ->oãoJ);

public class Exercicio7 {
	public static void main(String args[]) {
		System.out.println("*** Pedir o nome e inverter a ordem (João ->oãoJ) ***"); // Exercício

		Scanner consola = new Scanner(System.in);

		System.out.println("Escreva o seu nome completo: ");
		String nomeInserido = consola.nextLine();
		System.out.println(nomeInserido);
		char ch;
		String nstr = "";
		for (int i = 0; i < nomeInserido.length(); i++) {
			ch = nomeInserido.charAt(i); // extracts each character
		//	System.out.println("ch:       " + ch);
			nstr = ch + nstr; // adds each character in front of the existing string
		//	System.out.println("nstr:       " + nstr);
		}
		System.out.println("Ordem invertida " + nstr);
		consola.close();
	}

}
