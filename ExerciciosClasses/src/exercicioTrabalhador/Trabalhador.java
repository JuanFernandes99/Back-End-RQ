package exercicioTrabalhador;

public class Trabalhador {

	// atributos
	private String nome;
	private int idade;
	private double salario;

//construtors
	public Trabalhador(String aNome, double aSalario) {

		nome = aNome;
		salario = aSalario;
	}

	public Trabalhador(String aNome, double aSalario, int aIdade) {
		this.nome = aNome;
		this.idade = aIdade;
		this.salario = aSalario;
	}

	// getters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getSalario() {
		return salario;
	}

	// setters
	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public void setIdade(int aIdade) {
		this.idade = aIdade;
	}

	public void setSalario(double aSalario) {
		this.salario = aSalario;
	}

}

