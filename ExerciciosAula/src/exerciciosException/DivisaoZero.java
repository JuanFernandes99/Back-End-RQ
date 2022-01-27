
package exerciciosException;

public class DivisaoZero 
{
	public static void main(String args[])
	{
		try 
		{
			double erro = 7/0;
			System.out.println(erro);
		}
		catch (ArithmeticException e) // pode ser só Exception e - ponho arithmetic para saber qual é a exceção
		{
			System.out.println("Exceção areitmética " + e.getMessage());
		}
		
		catch (Exception e) // não posso por a exceção geral antes da exceção específica
		{
			System.out.println("Exeção geral " + e.getMessage());
		}
		
		System.out.println("Depos da exceção");
	}
}