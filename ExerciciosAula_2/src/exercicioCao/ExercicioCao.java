package exercicioCao;
////Minha Resolucao
import java.util.ArrayList;

import java.util.List;



public class ExercicioCao {

	public static void main(String[] args) {
		List<Cao> caes = new ArrayList<Cao>();

		Cao cao1 = new Cao("Bolinha", 3, 9, "Doberman");
		Cao cao2 = new Cao("Sparrow", 5, 10, "Labrador Retriever");
		Cao cao3 = new Cao("Simba", 7, 8, "Buldogue");
		Cao cao4 = new Cao("Pumba", 9, 70, "Poodle");
		Cao cao5 = new Cao("Jack", 11, 40, "Golden Retriever");

		caes.add(cao1);
		caes.add(cao2);
		caes.add(cao3);
		caes.add(cao4);
		caes.add(cao5);

		double somaPeso = 0;
		double mediaPeso = 0;
		double caoLeve = caes.get(0).getPeso();
		double caoPesado = caes.get(0).getPeso();
		String nomeCaoLeve = "";
		String nomeCaoPesado = "";

		for (Cao cao : caes) {
		
System.out.println(cao.comunicar() + " tenho " + cao.getIdade() + " anos " + "e a idade  equivalente em um ser humano é: " + cao.idadeHumana() + " anos");
			double auxPeso = cao.getPeso();
			String auxNome = cao.getNome();
			somaPeso += auxPeso;
			mediaPeso = somaPeso / caes.size();

			if (auxPeso <= caoLeve) {
				caoLeve = auxPeso;
				nomeCaoLeve = auxNome;

			}

			if (auxPeso >= caoPesado) {
				caoPesado = auxPeso;
				nomeCaoPesado = auxNome;

			}

		}

		System.out.println("Peso médio dos cães : " + mediaPeso + " Kg");
		System.out.println("Nome do cão mais leve: " + nomeCaoLeve + " com " + caoLeve + " Kg");
		System.out.println("Nome do cão mais pesado: " + nomeCaoPesado + " com " + caoPesado + " Kg");
		

	}
}
