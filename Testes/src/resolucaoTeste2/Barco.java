package resolucaoTeste2;



public class Barco extends Reboque {

	private int comprimento;
	private int largura;

	public Barco(int aNumeroTransporte, String aTipoReboque, int aComprimento, int aLargura) {
		super(aNumeroTransporte, aTipoReboque);
		comprimento = aComprimento;
		largura = aLargura;
	}

	public int getComprimento() {
		return comprimento;
	}

	public int getLargura() {
		return largura;
	}

	public void setComprimento(int aComprimento) {
		this.comprimento = aComprimento;
	}

	public void setLargura(int aLargura) {
		this.largura = aLargura;
	}

}