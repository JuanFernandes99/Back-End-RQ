package exerciciosException;

import java.util.Scanner;

public class NomeMenor 
{
	public static void main(String args[])
	{
	    try 
		{
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Escreva o seu nome: ");
		    String nomeInserido = sc.nextLine();
		    
		    System.out.println("As 3 primeiras letras do seu nome são:  " + nomeInserido.substring(0, 3));
		    sc.close();
		}
	    
	    catch (Exception e) 
		{
			System.out.println("O nome tem menos de 3 letras.");
		}
	 }
}