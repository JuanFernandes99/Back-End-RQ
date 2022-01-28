package resolucaoTeste2;

public class Carro extends Reboque {

	private int numeroLugaresSentados;
	private int pesoMaximoRebocavel;

	public Carro(int aNumeroTransporte, String aTipoReboque, int aNumeroLugaresSentados, int aPesoMaximoRebocavel) {
		super(aNumeroTransporte, aTipoReboque);
		numeroLugaresSentados = aNumeroLugaresSentados;
		pesoMaximoRebocavel = aPesoMaximoRebocavel;
	}

	public int getNumeroLugaresSentados() {
		return numeroLugaresSentados;
	}

	public int getPesoMaximoRebocavel() {
		return pesoMaximoRebocavel;
	}

	public void setNumeroLugaresSentados(int aNumeroLugaresSentados) {
		this.numeroLugaresSentados = aNumeroLugaresSentados;
	}

	public void setPesoMaximoRebocavel(int aPesoMaximoRebocavel) {
		this.pesoMaximoRebocavel = aPesoMaximoRebocavel;
	}

}
