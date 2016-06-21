package mpkpk.project.hotel;

public class DoubleRoom extends RoomDecorator
{
	public DoubleRoom(int id, Room decoradtedRoom)
	{
		super(decoradtedRoom);
		super.id = id;
		super.capacity = 2;
		super.numberOfPeople = 0;
	}
}
