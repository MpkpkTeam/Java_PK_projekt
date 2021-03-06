package mpkpk.project.hotel;

public class Client
{
	
	private int id;
	public int getId()
	{
		return id;
	}

	private String firstName;
	public String GetFirstName()
	{
		return firstName;
	}

	private String lastName;
	public String GetLastName()
	{
		return lastName;
	}

	private int phoneNumber;
	public int GetPhoneNumber()
	{
		return phoneNumber;
	}

	/**
	 * Returns a first name and a last name in one string e.g. John Smith.
	 */
	public String GetName()
	{
		return firstName + " " + lastName;
	}

	public Client(int id, String firstName, String lastName, int phoneNumber)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
}
