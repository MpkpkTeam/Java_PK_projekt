package mpkpk.project.hotel;

public class RoomFactory
{
	static public Room ProduceRoom(int id, int numberOfPeople, int isVip) throws WrongParametersException
	{
		if (isVip == 0)
		{
			if (numberOfPeople == 1)
			{
				return new SingleRoom(id, new NormalRoom(new BareRoom()));
			}
			else if (numberOfPeople == 2)
			{
				return new DoubleRoom(id, new NormalRoom(new BareRoom()));
			}
			else if (numberOfPeople == 3)
			{
				return new TripleRoom(id, new NormalRoom(new BareRoom()));
			}
			else if (numberOfPeople == 4)
			{
				return new QuadrupleRoom(id, new NormalRoom(new BareRoom()));
			}
		}
		else if (isVip == 1)
		{
			if (numberOfPeople == 1)
			{
				return new SingleRoom(id, new VipRoom(new BareRoom()));
			}
			else if (numberOfPeople == 2)
			{
				return new DoubleRoom(id, new VipRoom(new BareRoom()));
			}
			else if (numberOfPeople == 3)
			{
				return new TripleRoom(id, new VipRoom(new BareRoom()));
			}
			else if (numberOfPeople == 4)
			{
				return new QuadrupleRoom(id, new VipRoom(new BareRoom()));
			}
		}
		else
		{
			throw new WrongParametersException();
		}
		return null;
	}
}
