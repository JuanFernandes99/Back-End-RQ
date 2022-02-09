package resolucaoTeste2;

public class Carro extends Reboque {

	private Integer numLugaresSentados; // Integer e n�o int, porque � opcional, e pode ser null (n�o definido)
	private double pesoMaxRebocavel;

	public Carro(int aNumTransporte,double aPesoMaxRebocavel) {
		super(aNumTransporte);
		pesoMaxRebocavel = aPesoMaxRebocavel;
	}

	public int getNumeroLugaresSentados() {
		return numLugaresSentados;
	}

	public double getPesoMaximoRebocavel() {
		return pesoMaxRebocavel;
	}

	public void setNumeroLugaresSentados(int aNumeroLugaresSentados) {
		this.numLugaresSentados = aNumeroLugaresSentados;
	}

	public void setPesoMaximoRebocavel(double aPesoMaxRebocavel) {
		this.pesoMaxRebocavel = aPesoMaxRebocavel;
	}

}
