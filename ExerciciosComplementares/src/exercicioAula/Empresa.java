package exercicioAula;

import java.util.ArrayList;
import java.util.List;



public class Empresa implements EmpresaInterface {

	private int fundoDeCaixa;

	
	List<Trabalhador> trabalhadores = new ArrayList<Trabalhador>();
	
	public void adicionarTrabalhador(Trabalhador aTrabalhador) {
		
		trabalhadores.add(aTrabalhador);
		

	}
	public Empresa(int aFundoDeCaixa) {
		fundoDeCaixa = aFundoDeCaixa;
	}

	@Override
	public void cobraClientes() {
		
	}

	@Override
	public double pagarFuncionarios() {
	double soma =0;
		for (Trabalhador trb : trabalhadores) {
			soma = (fundoDeCaixa - trb.getSalario()) + trb.getCarteira(); 
		}
		return soma;

	}

	@Override
	public int getNumFuncionarios() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumLugaresSentados() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getFundoDeCaixa() {
		return fundoDeCaixa;
	}

	public void setFundoDeCaixa(int aFundoDeCaixa) {
		this.fundoDeCaixa = aFundoDeCaixa;
	}
	
	
	


}
