package resolucaoExerciciosComplementares;

import java.util.Scanner;

//Exercicio 5 : Pedir o nome completo e apresentar apenas o primeiro e o �ltimo nome;

public class Exercicio5 {
public static void main(String args[]) {
	System.out.println("*** Pedir o nome completo e apresentar apenas o primeiro e o �ltimo nome ***"); // Exerc�cio

	Scanner consola = new Scanner(System.in);

	System.out.println("Escreva o seu nome completo: ");
	String nomeInserido = consola.nextLine();
	System.out.println(nomeInserido);
    String[] primeiroUltimoNome = nomeInserido.split(" ");
    System.out.println("Primeiro nome: " + primeiroUltimoNome[0]); 
    System.out.println("�ltimo nome: " + primeiroUltimoNome[primeiroUltimoNome.length - 1]); 
consola.close();
}
}
