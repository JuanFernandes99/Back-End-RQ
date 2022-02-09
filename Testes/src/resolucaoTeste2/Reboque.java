package resolucaoTeste2;

public class Reboque {

	private boolean isAvariado;
	protected int numTransporte;
	protected int numServicos;

	public Reboque(int aNumTransporte) { // Atributos obrigat�rios s�o passados no construtor
		numTransporte = aNumTransporte;

		// Inicializa��o das vari�veis que n�o s�o passadas como argumentos do
		// construtor
		numServicos = 0;
		isAvariado = false;

	}

	public void trabalhar() {
		if (!isAvariado) // isAvariado == false
		{
			numServicos++;
			System.out.println("Eu, o carro/barco n�mero " + numTransporte + " estou a trabalhar!");
		} else {
			apresentaMensagemAvariado();
		}
	}

	public void avariar() {
		isAvariado = true;
		apresentaMensagemAvariado();
	}

	private void apresentaMensagemAvariado() {
		System.out.println("Eu, o carro/barco n�mero " + numTransporte + " estou avariado, n�o poderei trabalhar!");
	}

	public int getNumTransporte() {
		return numTransporte;
	}

	public int getNumServicos() {
		return numServicos;
	}

	public boolean isAvariado() {
		return isAvariado;
	}

	public void setNumeroTransporte(int aNumTransporte) {
		this.numTransporte = aNumTransporte;
	}

	public void setNumeroServicos(int aNumServicos) {
		this.numServicos = aNumServicos;
	}

	public void setPagarFuncionario(boolean aIsAvariado) {
		this.isAvariado = aIsAvariado;
	}

}