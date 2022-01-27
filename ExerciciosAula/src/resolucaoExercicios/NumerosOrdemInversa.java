package resolucaoExercicios;

//Exercicio 8: Pedir dois números, NumA e NumB, nessa ordem, e imprima em ordem inversa, isto é, se os dados lidos forem NumA = 5 e NumB = 9,
//por exemplo, devem ser impressos NumA = 9 e NumB = 5.

import java.util.Scanner;

public class NumerosOrdemInversa {
	public static void main(String[] args) {

		Scanner inputUtilizador = new Scanner(System.in);
		int num1 = inputUtilizador.nextInt();
		int num2 = inputUtilizador.nextInt();
		System.out.println(num1 + "," + num2);

		int aux = num2;
		num2 = num1;

		System.out.print(aux + "," + num2);
		inputUtilizador.close();
	}
}
