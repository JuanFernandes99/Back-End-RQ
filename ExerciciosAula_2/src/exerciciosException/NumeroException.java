package exerciciosException;

public class NumeroException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "tem de ser um n�mero maior que 10";
	}
}
