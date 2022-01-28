package resolucaoTeste2;

public class Reboque {
	private boolean isAvariado;
	protected int numeroTransporte;
	protected int numeroServicos;
	protected String tipoReboque;
	protected int quantidadeAvariados;

	public Reboque(int aNumeroTransporte, String aTipoReboque) {
		numeroTransporte = aNumeroTransporte;
		tipoReboque = aTipoReboque;
		numeroServicos = 0;

	}

	public void trabalhar() {
		if (isAvariado == false) {
			numeroServicos++;
			System.out.print("Eu, " + tipoReboque + " numero " + numeroTransporte + " estou a trabalhar, ");
		} else {
			System.out.print(
					"Eu, " + tipoReboque + " numero " + numeroTransporte + " estou avariado, não consigo  trabalhar, ");
		}
	}

	public void Avariar() {
		quantidadeAvariados++;
		isAvariado = true;
		System.out.println("\nEu número, " + numeroTransporte + " estou avariado!, não poderei trabalhar");
	}

	public int getNumeroTransporte() {
		return numeroTransporte;
	}

	public int getNumeroServicos() {
		return numeroServicos;
	}

	public boolean isAvariado() {
		return isAvariado;
	}

	public void setNumeroTransporte(int aNumeroTransporte) {
		this.numeroTransporte = aNumeroTransporte;
	}

	public void setNumeroServicos(int aNumeroServicos) {
		this.numeroServicos = aNumeroServicos;
	}

	public void setPagarFuncionario(boolean aIsAvariado) {
		this.isAvariado = aIsAvariado;
	}

	public int getQuantidadeAvariados() {
		return quantidadeAvariados;
	}

	public void setQuantidadeAvariados(int quantidadeAvariados) {
		this.quantidadeAvariados = quantidadeAvariados;
	}

}