package mpkpk.project.hotel;

public class QuadrupleRoom extends RoomDecorator
{
	public QuadrupleRoom(int id, Room decoradtedRoom)
	{
		super(decoradtedRoom);
		super.id = id;
		super.capacity = 4;
		super.numberOfPeople = 0;
	}
}