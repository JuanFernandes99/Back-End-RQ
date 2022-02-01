package resolucaoTeste2;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements EmpresaInterface {

	private String nome;
	private List<Reboque> reboques = new ArrayList<Reboque>();

	public Empresa(String aNome, List<Reboque> aReboques) {
		nome = aNome;
		reboques = aReboques;

	}

	public int getNumReboques() {
		return reboques.size();
	}

	public int getNumReboquesAvariados() {
		int numAvariados = 0;
		for (Reboque rebo : reboques) {
			if (rebo.isAvariado()) {
				numAvariados++;

			}
		}

		return numAvariados;
	}

	public String getNome() {
		return nome;
	}

	public List<Reboque> getReboques() {
		return reboques;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public void setReboques(List<Reboque> reboques) {
		this.reboques = reboques;
	}

}
