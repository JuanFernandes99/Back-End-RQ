package resolucaoExercicios;

//Exercicio 9_1: Escrever na consola a multiplica��o dos n�meros pares entre 0 e 30;

public class MultiplicacaoParesRango {
	public static void main(String[] args) {
		long resultado = 2;
		for (int i = 2; i < 30; i++) {
			if (i % 2 == 0) {

				resultado = resultado * i;
				System.out.println(resultado);

			}
		}
	}
}
