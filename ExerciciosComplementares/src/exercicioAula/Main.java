package exercicioAula;

import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) { 
		
		
		Trabalhador trabalhador1 = new Trabalhador("Juan", 1000);
		Trabalhador trabalhador2 = new Trabalhador("Pedro", 2000);
		Trabalhador trabalhador3 = new Trabalhador("Diego", 3000);
		Trabalhador trabalhador4 = new Trabalhador("Carlos", 4000);
		Trabalhador trabalhador5 = new Trabalhador("Sara", 5000);
		
		Empresa empresa = new Empresa(100000);

empresa.adicionarTrabalhador(trabalhador1);
empresa.adicionarTrabalhador(trabalhador2);
empresa.adicionarTrabalhador(trabalhador3);
empresa.adicionarTrabalhador(trabalhador4);
empresa.adicionarTrabalhador(trabalhador5);

		
	double aux = empresa.pagarFuncionarios();
	System.out.println("Resultado da operacao:" + aux);
	System.out.println("Saldo carteira trabalhador 1 :" + trabalhador1.getCarteira());
	  } 
}











/*for (Tipodivisao myVar : Tipodivisao.values()) {
System.out.println(myVar);
}*/