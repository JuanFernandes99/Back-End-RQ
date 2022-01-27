package exercicioCao;
//Resolucao Professor
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Gato> gatos = new ArrayList<Gato>();

		Gato gato1 = new Gato("Ringo", 10, 10, true);
		Gato gato2 = new Gato("Frida", 14, 20, false);

		gatos.add(gato1);
		gatos.add(gato2);

		List<Cao> caes = new ArrayList<Cao>();

		Cao cao1 = new Cao("Brenda", 7, 18, "Bulldog");
		Cao cao2 = new Cao("Coco", 13, 19, "Beagle");

		caes.add(cao1);
		caes.add(cao2);

		List<Animal> animais = new ArrayList<Animal>();

		animais.add(gato1);
		animais.add(gato2);
		animais.add(cao1);
		animais.add(cao2);

		for (Animal nimal : animais) {

			System.out.println(nimal.comunicar());
			
			if(nimal instanceof Gato) {
				
				if(((Gato)nimal).isCacador()==true){
					System.out.println("e sou um gato caçador");
				}
				else {
					System.out.println("Não Sou um gato caçador");
				}
					
				//System.out.println(" Gato Caçador ?: " + ((Gato)nimal).isCacador());
			}
		}

	}

}