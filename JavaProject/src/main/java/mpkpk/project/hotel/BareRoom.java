package mpkpk.project.hotel;

public class BareRoom implements Room
{
	public int GetId()
	{
		return 0;
	}


	
	public boolean IsOccupied()
	{
		return false;
	}

	
	public void SetNumberOfClients(int numberOfClients) throws TooManyClientsException, LessThanZeroClientsException
	{

	}

	
	public int GetCapacity()
	{
		return 0;
	}

	
	public boolean IsVip()
	{
		return false;
	}
}
