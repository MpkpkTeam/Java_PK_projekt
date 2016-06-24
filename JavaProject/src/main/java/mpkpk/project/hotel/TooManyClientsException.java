package mpkpk.project.hotel;

public class TooManyClientsException extends Exception
{
	/**
	 * 
	 */ 
	 
	private static final long serialVersionUID = 1L;

	
	public TooManyClientsException()
	{
	}

	public TooManyClientsException(String msg)
	{
		super(msg);
	}
}
