package exercicioTrabalhador;
import java.util.ArrayList;

import java.util.List;
import java.util.OptionalDouble;
public class Main {
	public static void main(String[] args) {
		List<Trabalhador> trabalhadores = new ArrayList<Trabalhador>();

		Trabalhador trabalhador1 = new Trabalhador("Juan", 500.28);
		Trabalhador trabalhador2 = new Trabalhador("Pedro", 580);
		Trabalhador trabalhador3 = new Trabalhador("Ricardo", 300);
		Trabalhador trabalhador4 = new Trabalhador("Diego", 400);
		Trabalhador trabalhador5 = new Trabalhador("Daniela", 900);
		Trabalhador trabalhador6 = new Trabalhador("Rafael", 700, 20);
		
		trabalhadores.add(trabalhador1);
		trabalhadores.add(trabalhador2);
		trabalhadores.add(trabalhador3);
		trabalhadores.add(trabalhador4);
		trabalhadores.add(trabalhador5);
		trabalhadores.add(trabalhador6);
		
		//trab nome qualquer
		
OptionalDouble media2 = trabalhadores.stream().mapToDouble(trabalhador -> trabalhador.getSalario()).average();

System.out.println(media2.getAsDouble());

System.out.println( media2) ;
System.out.println( " ") ;
double soma = 0;
double soma1 = 0;		 
double media = soma/trabalhadores.size();		
double maximo= trabalhadores.get(0).getSalario();
double minimo = trabalhadores.get(0).getSalario();
		 for (int i = 0; i < trabalhadores.size(); i++) {
			 
			 soma1 +=trabalhadores.get(i).getSalario();
			 
			 media = soma1 / trabalhadores.size();
			 
			double aux = trabalhadores.get(i).getSalario();
			
			if (aux>maximo) {
				maximo = aux;
			}
			if (aux<minimo) {
				minimo = aux;
			}
		}
		 System.out.println("soma: " + soma1) ;
		 System.out.println("media: " + media) ;
		 System.out.println("max: " + maximo) ;
		 System.out.println("min: " + minimo) ;

	
	for (Trabalhador trab : trabalhadores) {
		 soma = soma + trab.getSalario();
		 media = soma / trabalhadores.size();
			double aux = trab.getSalario();
			
			if (aux>maximo) {
				maximo = aux;
			}
			if (aux<minimo) {
				minimo = aux;
			}
		}
	System.out.println("soma: " + soma) ;
	 System.out.println("media: " + media) ;
	 System.out.println("max: " + maximo) ;
	 System.out.println("min: " + minimo) ;
		 
	}
}
	

		
		
	/* double maxNum = trabalhadores.get(0).getSalario();
		 for (Trabalhador trab : trabalhadores) {
			
	            if (trab.getSalario() > maxNum)
	                maxNum = trab.getSalario();
	           
	        }
		 System.out.println("Maximum number = " + maxNum);
	      
	    }
	 * 
	 */
	
		
	
		/* for(int i = 0; i < trabalhadores.size(); i++) {
	            System.out.println(trabalhadores.get(i).getNome()) ;
	            System.out.println(trabalhadores.get(i).getSalario()) ;
	            System.out.println(trabalhadores.get(i).getIdade()) ;
	        }*/




