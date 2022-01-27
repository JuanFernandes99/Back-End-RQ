package exercicioEmpresa;



public class Chefe extends Trabalhador {
	
	private boolean isPagarFuncionario;
	
	public Chefe(String aNome, double aSalario, String aCargo, boolean aPagarFuncionario) {
		super(aNome, aSalario, aCargo);
		isPagarFuncionario = aPagarFuncionario;
	}
	

	public boolean isPagarFuncionario() {
		return isPagarFuncionario;
	}
	public void setPagarFuncionario(boolean pagarFuncionario) {
		this.isPagarFuncionario = pagarFuncionario;
	}




}
