package resolucaoTeste2;

public class Barco extends Reboque {

	private double comprimento;
	private Double largura; // Double e não double, porque é opcional, e pode ser null (não definido)
	
	 // Construtor(es)
	public Barco(int aNumTransporte,int aComprimento) {
		super(aNumTransporte);
		comprimento = aComprimento;
	}
	  // Getters e Setters

	public double getComprimento() {
		return comprimento;
	}

	public Double getLargura() {
		return largura;
	}

	public void setComprimento(double aComprimento) {
		comprimento = aComprimento;
	}

	public void setLargura(Double aLargura) {
		largura = aLargura;
	}
	


}