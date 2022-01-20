package exercicioAula;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Divisao> divisoes = new ArrayList<Divisao>();

		Divisao wc = new Divisao(TipoDivisao.WC, 50, 1, 4);
		Divisao escritorio = new Divisao(TipoDivisao.Escritorio, 100, 2, 8);
		Divisao cozinha = new Divisao(TipoDivisao.Cozinha, 150, 3, 12);

		divisoes.add(wc);
		divisoes.add(escritorio);
		divisoes.add(cozinha);

		List<Empresa> empresas = new ArrayList<Empresa>();

		Empresa pastelaria = new Empresa("SÈsamo", "Rua do Nascimento,14", 271894752, 1000000, divisoes);

		empresas.add(pastelaria);

		// sempre nomes explicativos

		Trabalhador trabalhador1 = new Trabalhador("Juan", 1000, "Chefe");
		Trabalhador trabalhador2 = new Trabalhador("Pedro", 2000, "Diretor Financeiro");
		Trabalhador trabalhador3 = new Trabalhador("Diego", 3000, "Ajudante");
		Trabalhador trabalhador4 = new Trabalhador("Carlos", 4000, "Padeiro");
		Trabalhador trabalhador5 = new Trabalhador("Sara", 5000, "Contabilista");

		pastelaria.adicionarTrabalhador(trabalhador1);
		pastelaria.adicionarTrabalhador(trabalhador2);
		pastelaria.adicionarTrabalhador(trabalhador3);
		pastelaria.adicionarTrabalhador(trabalhador4);
		pastelaria.adicionarTrabalhador(trabalhador5);

		for (Trabalhador trb : pastelaria.getTrabalhadores()) {
			trb.trabalhar();

		}
		System.out.println("\n… dia de receber!\n");

		pastelaria.pagarTrabalhadores();
		for (Trabalhador trb : pastelaria.getTrabalhadores()) {
			System.out.println("Trabalhador: " + trb.getNome() + ", Cargo: " + trb.getCargo() + ", Carteira: "
					+ trb.getCarteira() + "Ä");

		}
	}

}
