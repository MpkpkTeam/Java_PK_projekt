package mpkpk.project.hotel;

public class TooManyClientsException extends Exception{
	public TooManyClientsException()
	{
	}
	public TooManyClientsException(String msg)
	{
		super(msg);
	}	
}
