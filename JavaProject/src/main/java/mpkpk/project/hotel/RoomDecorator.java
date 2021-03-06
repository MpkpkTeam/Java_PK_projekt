package mpkpk.project.hotel;

public abstract class RoomDecorator implements Room
{
	protected Room decoratedRoom;

	protected int id;
	protected int capacity;
	protected int numberOfPeople;
	protected boolean isVip;

	public RoomDecorator(Room decoratedRoom)
	{
		this.decoratedRoom = decoratedRoom;
		this.isVip = decoratedRoom.IsVip();
	}

	public boolean IsOccupied()
	{
		if (numberOfPeople != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void SetNumberOfClients(int numberOfClients) throws TooManyClientsException, LessThanZeroClientsException
	{
		if (numberOfClients < 0)
		{
			throw new LessThanZeroClientsException("Number of people must be greater than zero");
		}
		else if (numberOfClients <= capacity)
		{
			numberOfPeople = numberOfClients;
		}
		else
		{
			throw new TooManyClientsException("Too many people in one room");
		}
	}

	public int GetId()
	{
		return id;
	}

	public int GetCapacity()
	{
		return capacity;
	}

	public boolean IsVip()
	{
		return isVip;
	}
}
