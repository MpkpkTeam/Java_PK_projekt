package mpkpk.project.hotel;

public class NormalRoom extends RoomDecorator
{
	private boolean isVip = false;

	public NormalRoom(Room decoratedRoom)
	{
		super(decoratedRoom);
		super.isVip = isVip;
	}

	public boolean CheckIfVip()
	{
		if (isVip)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
