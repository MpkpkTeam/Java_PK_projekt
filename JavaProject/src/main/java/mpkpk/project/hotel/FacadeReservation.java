package mpkpk.project.hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FacadeReservation
{
	String dbName = "hotel";

	private Connection conn = connectToDatabase(dbName);
	private Statement stat;

	ArrayList<Client> clients; // List of clients
	ArrayList<Reservation> reservations; // List of reservations
	ArrayList<Room> rooms; // List of rooms

	public FacadeReservation(ArrayList<Client> clients, ArrayList<Reservation> reservations, ArrayList<Room> rooms)
			throws Exception
	{
		this.clients = clients;
		this.reservations = reservations;
		this.rooms = rooms;

		try
		{
			stat = conn.createStatement();
			ResultSet result = stat.executeQuery("SELECT * FROM CLIENTS");
			int id, phoneNumber;
			String firstName, lastName;
			while (result.next())
			{
				id = result.getInt("ID");
				firstName = result.getString("FIRSTNAME");
				lastName = result.getString("LASTNAME");
				phoneNumber = Integer.parseInt(result.getString("PHONE"));

				clients.add(new Client(id, firstName, lastName, phoneNumber));
			}
		}
		catch (SQLException e)
		{
			throw e;
		}

		try
		{
			stat = conn.createStatement();
			ResultSet result = stat.executeQuery("SELECT * FROM ROOMS");
			int id, capacity, isVip, numberOfPeople;
			while (result.next())
			{
				id = result.getInt("ID");
				capacity = result.getInt("CAPACITY");
				isVip = result.getInt("ISVIP");
				numberOfPeople = result.getInt("NUMBER_OF_PEOPLE");

				rooms.add(RoomFactory.ProduceRoom(id, capacity, isVip));
				rooms.get(rooms.size() - 1).SetNumberOfClients(numberOfPeople);
			}
		}
		catch (SQLException e)
		{
			throw e;
		}

		try
		{
			stat = conn.createStatement();
			ResultSet result = stat.executeQuery("SELECT * FROM RESERVATIONS");
			int id, clientId, roomId;
			String from, to;
			while (result.next())
			{
				id = result.getInt("ID");
				from = result.getString("DATE_FROM");
				to = result.getString("DATE_TO");
				roomId = result.getInt("ROOM_ID");
				clientId = result.getInt("CLIENT_ID");

				Room tempR = null;
				Client tempC = null;

				for (Room r : rooms)
				{
					if (r.GetId() == roomId)
					{
						tempR = r;
						break;
					}
				}

				for (Client c : clients)
				{
					if (c.getId() == clientId)
					{
						tempC = c;
						break;
					}
				}
				DateFormat df = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS", Locale.ENGLISH);

				try
				{
					reservations.add(new Reservation(id, df.parse(from), df.parse(to), tempC, tempR));
				}
				catch (Exception e)
				{
					throw e;
				}
			}
		}
		catch (SQLException e)
		{
			throw e;
		}
	}

	public void AddReservation(Date from, Date to, String firstName, String lastName, int phoneNumber,
			int numberOfPeople, Room room) throws Exception
	{
		try
		{
			DateFormat df = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS:SSS", Locale.ENGLISH);
			stat = conn.createStatement();

			String tabelaSQL = "insert into CLIENTS (FIRSTNAME, LASTNAME, PHONE) values( \"" + firstName + "\", \""
					+ lastName + "\", \"" + Integer.toString(phoneNumber) + "\" )";
			stat.executeUpdate(tabelaSQL);

			stat = conn.createStatement();
			ResultSet result = stat.executeQuery(
					"SELECT ID FROM CLIENTS WHERE FIRSTNAME=\"" + firstName + "\" AND LASTNAME= \"" + lastName + "\"");
			int id = -1;
			while (result.next())
			{
				id = result.getInt("ID");
			}
			Client client = new Client(id, firstName, lastName, phoneNumber);
			clients.add(client);

			tabelaSQL = "insert into RESERVATIONS (DATE_FROM, DATE_TO, CLIENT_ID, ROOM_ID) values( \"" + df.format(from)
					+ "\", \"" + df.format(to) + "\", " + client.getId() + ", " + room.GetId() + " )";
			stat.executeUpdate(tabelaSQL);
			result = stat.executeQuery(
					"SELECT ID FROM RESERVATIONS WHERE CLIENT_ID= " + client.getId() + " AND ROOM_ID=" + room.GetId());
			id = -1;
			while (result.next())
			{
				id = result.getInt("ID");
			}
			reservations.add(new Reservation(id, from, to, client, room));

			stat.close();
		}
		catch (Exception e)
		{
			throw e;
		}
	}

	public ArrayList<Room> FindEmptyRooms(Date from, Date to, int capacity)
	{
		ArrayList<Room> tempRooms = new ArrayList<Room>();
		DateFormat df = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS:SSS", Locale.ENGLISH);

		try
		{
			stat = conn.createStatement();

			for (Room item : rooms)
			{
				if (item.GetCapacity() >= capacity)
				{
					ResultSet result = stat.executeQuery("SELECT COUNT(*) FROM RESERVATIONS " + "WHERE ROOM_ID="
							+ item.GetId() + " AND" + "(" + "(DATE_FROM <= \"" + df.format(to)
							+ "\" AND DATE_FROM >= \"" + df.format(from) + "\") OR" + "(DATE_TO >= \"" + df.format(from)
							+ "\" AND DATE_TO <= \"" + df.format(to) + "\") OR" + "(DATE_FROM <= \"" + df.format(from)
							+ "\" AND DATE_TO >= \"" + df.format(to) + "\") OR" + "(DATE_TO <= \"" + df.format(to)
							+ "\" AND DATE_FROM >= \"" + df.format(from) + "\")" + ")");
					result.next();
					if (result.getInt("COUNT(*)") == 0)
					{
						tempRooms.add(item);
					}
				}
			}
			stat.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return tempRooms;
	}

	public ArrayList<Room> ListAllRooms()
	{
		return rooms;
	}

	public ArrayList<Reservation> ListaAllReservation()
	{
		return reservations;
	}

	public ArrayList<Client> ListAllClients()
	{
		return clients;
	}

	static Connection connectToDatabase(String dbName)
	{
		Connection conn = null;
		try
		{
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:" + dbName + ".sqlite");
		}
		catch (Exception e)
		{
			System.err.println("B³¹d w po³¹czeniu z baz¹: \n" + e.getMessage());
			return null;
		}
		return conn;
	}
}
