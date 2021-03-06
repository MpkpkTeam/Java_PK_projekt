package mpkpk.project.hotel;

public interface Room
{
	public boolean IsOccupied();

	public void SetNumberOfClients(int numberOfClients) throws TooManyClientsException, LessThanZeroClientsException;

	public int GetId();

	public int GetCapacity();
	
	public boolean IsVip();
}
