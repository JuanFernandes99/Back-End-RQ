package exercicioEmpresa;

public class Trabalhador implements TrabalhadorInterface {
	private String nome;
	private double salario;
	private double carteira;
    private String cargo;
	public Trabalhador(String aNome, double aSalario, String aCargo) {
		nome = aNome;
		salario = aSalario;
		cargo = aCargo;
		carteira = 0;

	}

	public void trabalhar() {
		System.out.println("Eu sou " + nome + " e estou a trabalhar");
	}

	public void recebeSalario() {
		carteira = carteira + salario;
	}

	public String getCargo() {
		return cargo;
	}

	

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public double getCarteira() {
		return carteira;
	}

	public void setSalario(double aSalario) {
		this.salario = aSalario;
	}

	public void setCarteira(double aCarteira) {
		this.carteira = aCarteira;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}
	public void setCargo(String aCargo) {
		this.cargo = aCargo;
	}

}
