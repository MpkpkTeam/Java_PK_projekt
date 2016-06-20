package mpkpk.project.hotel;

public class Room {
	private int id;
	public int getId()
	{
		return id;
	}
	
	private String name;
	public String getName()
	{
		return name;
	}
	
	private int capacity;
	public int getCapacity()
	{
		return capacity;
	}
	
	private int numberOfPeople;
	public int getNumberOfPeople()
	{
		return numberOfPeople;
	}
	public void setNumberOfPeople(int number) throws TooManyClientsException
	{
		if (numberOfPeople + number <= capacity) 
		{
			numberOfPeople += number;
		}
		else
		{
			throw new TooManyClientsException();
		}
	}
	
	public Room(int id, String name, int capacity)
	{
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		numberOfPeople = 0;
	}
}
