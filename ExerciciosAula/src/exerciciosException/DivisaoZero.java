
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
		catch (ArithmeticException e) // pode ser s� Exception e - ponho arithmetic para saber qual � a exce��o
		{
			System.out.println("Exce��o areitm�tica " + e.getMessage());
		}
		
		catch (Exception e) // n�o posso por a exce��o geral antes da exce��o espec�fica
		{
			System.out.println("Exe��o geral " + e.getMessage());
		}
		
		System.out.println("Depos da exce��o");
	}
}