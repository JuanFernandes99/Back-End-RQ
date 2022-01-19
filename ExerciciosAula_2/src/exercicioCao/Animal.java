package exercicioCao;

public class Animal {

	protected String nome;
	protected int idade;
	protected double peso;

//construtor
	public Animal() {
		//animal sem dados
			}
	public Animal(String aNome, int aIdade, double aPeso) {
		nome = aNome;
		idade = aIdade;
		peso = aPeso;
	}
	
	//metodos
	public String comunicar() {
		return "Eu comunico: ";
	}

//getters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

//setters
	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public void setIdade(int aIdade) {
		this.idade = aIdade;
	}

	public void setPeso(double aPeso) {
		this.peso = aPeso;
	}

}
