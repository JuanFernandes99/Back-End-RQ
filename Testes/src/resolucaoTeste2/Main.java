package resolucaoTeste2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Reboque> reboques = new ArrayList<Reboque>();
		Reboque Reboque1 = new Carro(001, "Carro", 100, 0);
		Reboque Reboque2 = new Carro(002, "Carro", 200, 0);
		Reboque Reboque3 = new Barco(003, "Barco", 300, 0);
		Reboque Reboque4 = new Barco(004, "Barco", 400, 0);

		reboques.add(Reboque1);
		reboques.add(Reboque2);
		reboques.add(Reboque3);
		reboques.add(Reboque4);

		Empresa javaReboques = new Empresa("javaReboques", reboques);

		System.out.println("Número total de reboques da empresa: " + javaReboques.getNumReboques() + "\n");

		for (Reboque rebo : reboques) {
			rebo.trabalhar();
			System.out.println("número de serviços: " + rebo.getNumeroServicos());
		}

		Reboque1.Avariar();
		Reboque2.Avariar();

		System.out.println(
				"\nNúmero total de reboques avariados da empresa: " + javaReboques.getNumReboquesAvariados() + "\n");

		for (Reboque rebo : reboques) {
			rebo.trabalhar();
			System.out.println("número de serviços: " + rebo.getNumeroServicos());

		}

	}

}
