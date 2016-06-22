package mpkpk.project.hotel;

public class TripleRoom extends RoomDecorator
{
	public TripleRoom(int id, Room decoradtedRoom)
	{
		super(decoradtedRoom);
		super.id = id;
		super.capacity = 3;
		super.numberOfPeople = 0;
	}
}
