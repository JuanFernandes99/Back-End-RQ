package exerciciosException;

public class SemNumeroException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() 
	{
		return "tem de ser um número maior que 10";
	}
}