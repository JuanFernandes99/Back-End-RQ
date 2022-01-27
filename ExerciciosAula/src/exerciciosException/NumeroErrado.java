package exerciciosException;

import java.util.Scanner;

public class NumeroErrado 
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
	    int numero = sc.nextInt();
	    
	    if (numero<10)
	    {
	    	throw new SemNumeroException();
	    }
	    sc.close();
		}
		catch (SemNumeroException e)
		{
			System.out.println(e.getMessage());
		}
	}	
}