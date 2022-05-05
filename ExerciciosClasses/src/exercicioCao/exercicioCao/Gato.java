package exercicioCao;

public class Gato extends Animal {

	boolean isCacador;

	public Gato(String aNome, int aIdade, double aPeso, boolean aIscacador) {
		super(aNome, aIdade, aPeso);
		isCacador = aIscacador;
	}

	public String comunicar() {

		return super.comunicar() + "miau miau, sou: " + getNome() ;
	}

	public Boolean isCacador() {
		return isCacador;
	}

	public void setIsCacador(Boolean aIsCacador) {
		this.isCacador = aIsCacador;
	}

}
