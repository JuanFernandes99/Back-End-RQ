package exercicioEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements EmpresaInterface {

	private String nome;
	private String morada;
	private int nif;
	private double fundoDeCaixa;
	private List<Trabalhador> trabalhadores;
	private List<Divisao> divisoes;

//construtor
	public Empresa(String aNome, String aMorada, int aNif, double aFundoDeCaixa, List<Divisao> aDivisoes) {
		nome = aNome;
		morada = aMorada;
		nif = aNif;
		fundoDeCaixa = aFundoDeCaixa;
		divisoes = aDivisoes;
		trabalhadores = new ArrayList<Trabalhador>(); // a lista de trabalhadores é null, para ficar vazia fazemos isto.

	}

	public void adicionarTrabalhador(Trabalhador aTrabalhador) {

		trabalhadores.add(aTrabalhador);

	}


	@Override
	public void cobraClientes(double aValor) {
		fundoDeCaixa += aValor;

	}

	@Override
	public void pagarTrabalhadores() {
		double totalAPagarSalarios = 0;
		for (Trabalhador trb : trabalhadores) {

			totalAPagarSalarios += trb.getSalario(); // soma dos salarios
		}
		if (totalAPagarSalarios <= fundoDeCaixa) {
			for (Trabalhador trb : trabalhadores) { // Pode ser apenas isso sem verificação
				trb.recebeSalario();
				fundoDeCaixa -= trb.getSalario();

			}
		} else {
			System.out.print("Dinheiro insuficiente para pagar aos trabalhadores");
		}

	}

	@Override
	public int getNumTrabalhadores() {
		return trabalhadores.size();
	}

	@Override
	public int getNumLugaresSentados() {
		int nLugares = 0;
		for (Divisao divisao : divisoes) {
			nLugares += divisao.getNumLugares();
		}

		return nLugares;
	}

	public String getNome() {
		return nome;
	}

	public String getMorada() {
		return morada;
	}

	public int getNif() {
		return nif;
	}

	public double getFundoDeCaixa() {
		return fundoDeCaixa;
	}

	public List<Trabalhador> getTrabalhadores() {
		return trabalhadores;
	}

	public List<Divisao> getDivisoes() {
		return divisoes;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public void setMorada(String aMorada) {
		this.morada = aMorada;
	}

	public void setNif(int aNif) {
		this.nif = aNif;
	}

	public void setFundoDeCaixa(double aFundoDeCaixa) {
		this.fundoDeCaixa = aFundoDeCaixa;
	}

	public void setTrabalhadores(List<Trabalhador> aTrabalhadores) {
		this.trabalhadores = aTrabalhadores;
	}

	public void setDivisoes(List<Divisao> aDivisoes) {
		this.divisoes = aDivisoes;
	}

}
