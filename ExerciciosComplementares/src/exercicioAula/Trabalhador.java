package exercicioAula;

 public class Trabalhador implements TrabalhadorInterface {
     private String nome;
	 private double salario;
	 private double carteira;
	 
	 
	 

	public Trabalhador(String aNome, double aSalario) {
		nome = aNome;
		salario = aSalario;
		carteira = 0;
		
	}



	public void trabalhar() {

		
	}

	public void recebeSalario(double aSalario) {
		carteira = carteira + aSalario;
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

 }