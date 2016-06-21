package mpkpk.project.hotel;

import java.util.Date;

public class Reservation
{
	int id;
	public int GetId()
	{
		return id;
	}

	Date from;
	public Date GetFromDate()
	{
		return from;
	}

	Date to;
	public Date GetToDate()
	{
		return to;
	}

	Client client;
	public Client GetClient()
	{
		return client;
	}

	Room room;
	public Room GetRoom()
	{
		return room;
	}

	public Reservation(int id, Date from, Date to, Client client, Room room)
	{
		this.id = id;
		this.from = from;
		this.to = to;
		this.client = client;
		this.room = room;
	}
}
