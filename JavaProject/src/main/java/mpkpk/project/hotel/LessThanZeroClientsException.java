package mpkpk.project.hotel;

public class LessThanZeroClientsException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LessThanZeroClientsException()
	{

	}

	public LessThanZeroClientsException(String msg)
	{
		super(msg);
	}
}
