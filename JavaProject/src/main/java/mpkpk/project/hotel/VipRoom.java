package mpkpk.project.hotel;

public class VipRoom extends RoomDecorator
{
	private boolean isVip = true;

	public VipRoom(Room decoratedRoom)
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
