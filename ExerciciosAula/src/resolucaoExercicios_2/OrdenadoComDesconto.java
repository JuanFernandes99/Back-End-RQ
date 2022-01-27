package resolucaoExercicios_2;

import java.util.Scanner;

//Exercicio 1: Pedir o ordenado (número) e devolver com um desconto de 15%;

public class OrdenadoComDesconto {
	public static void main(String args[]) {
		System.out.println("Escreva o seu ordenado para devolver com um desconto de 15%");
		Scanner ordenado = new Scanner(System.in);

		double ordenadoinserido = ordenado.nextDouble();
		double ordenadocomdesconto = ordenadoinserido - (ordenadoinserido * 0.15);

		System.out.println("O ordenado sem desconto era: " + ordenadoinserido + "€");
		System.out.println(" ");
		System.out.println("O ordenado com desconto de 15% ficou em : " + ordenadocomdesconto + "€");

		ordenado.close();
	}
}
