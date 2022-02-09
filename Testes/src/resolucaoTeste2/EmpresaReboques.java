package resolucaoTeste2;

import java.util.ArrayList;
import java.util.List;

public class EmpresaReboques implements IEmpresaReboques {

	private String nome;
	private int nif;
	private List<Reboque> reboques;

	public EmpresaReboques(String aNome, int aNif) {
		nome = aNome;
		setNif(aNif);

		// Inicialização das variáveis que não são passadas como argumentos do
		// construtor
		reboques = new ArrayList<Reboque>();
	}

	@Override
	public int getNumReboques() {
		return reboques.size();
	}

	@Override
	public int getNumReboquesAvariados() {
		int numAvariados = 0;

		for (Reboque reboque : reboques) {

			if (reboque.isAvariado()) {
				numAvariados++;

			}
		}

		return numAvariados;
	}

	public void todosReboquesTrabalhar() {
		for (Reboque reboque : reboques) {
			reboque.trabalhar();
		}
	}

	public void addReboque(Reboque aReboque) {
		reboques.add(aReboque);
	}

	public String getNome() {
		return nome;
	}

	public List<Reboque> getReboques() {
		return reboques;
	}

	public int getNif() {
		return nif;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public void setNif(int aNif) {
		nif = aNif;
	}

}
