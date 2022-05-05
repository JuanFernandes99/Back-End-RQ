package exercicioCao;

public class Cao extends Animal {
	//privado no conseguimos aceder ao nome
	//protected conseguiamos acceder ao nome    
	//como esta private temos q usar o super
	private String raca;

	public Cao(String aNome, int aIdade, double aPeso, String aRaca) {
		super(aNome, aIdade, aPeso);
		raca = aRaca;
	}
//metodos

	public String comunicar() {
		// podia ser todo en el return
		String latido = super.comunicar()+ "au au au, sou: " + getNome() ;
		return latido;
	}

		public  int idadeHumana() {
		int idadeHumanaa = 	getIdade() * 7;
	return idadeHumanaa;
		}

	
	//getters
	public String getRaca() {
		return raca;
	}
   //setters
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
