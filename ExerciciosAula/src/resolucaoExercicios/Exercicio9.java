package resolucaoExercicios;

//Exercicio 9 : Escrever na consola a soma dos números ímpares entre 0 e 30.

public class Exercicio9 {
	public static void main(String[] args) {
		int soma = 0;
		for (int i = 1; i < 30; i++) {
			if (i % 2 == 1) {
				System.out.println("Numero impar:" + i);
				System.out.print(soma + "+" + i + "=");
				soma += i;
				System.out.print(soma);
				System.out.println(" ");
			}
		}
	}
}
