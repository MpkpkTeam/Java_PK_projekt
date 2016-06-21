package mpkpk.project.hotel;

public class SingleRoom extends RoomDecorator
{
	public SingleRoom(int id, Room decoradtedRoom)
	{
		super(decoradtedRoom);
		super.id = id;
		super.capacity = 1;
		super.numberOfPeople = 0;
	}
}
