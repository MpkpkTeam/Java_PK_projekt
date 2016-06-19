package mpkpk.project.hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
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
            while(result.next()) 
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
            e.printStackTrace();
        }
        
        try 
        {
            stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM ROOMS");
            int id, capacity, isVip, numberOfPeople;
            while(result.next()) 
            {
                id = result.getInt("ID");
                capacity = result.getInt("CAPACITY");
                isVip = result.getInt("ISVIP");
                numberOfPeople = result.getInt("NUMBER_OF_PEOPLE");

                
                if (isVip == 0) 
                {
					if (capacity == 1) 
					{
						rooms.add(new SingleRoom(id, new NormalRoom(new BareRoom())));
						try 
						{
							rooms.get(rooms.size() - 1).SetNumberOfClients(numberOfPeople);
						} 
						catch (Exception e)
						{
							
						}
					}
					else if (capacity == 2)
					{
						rooms.add(new DoubleRoom(id, new NormalRoom(new BareRoom())));	
						try 
						{
							rooms.get(rooms.size() - 1).SetNumberOfClients(numberOfPeople);
						} 
						catch (Exception e)
						{
							
						}
					}		
					else if (capacity == 3)
					{
						rooms.add(new TripleRoom(id, new NormalRoom(new BareRoom())));
						try 
						{
							rooms.get(rooms.size() - 1).SetNumberOfClients(numberOfPeople);
						} 
						catch (Exception e)
						{
							
						}
					}	
					else if (capacity == 4)
					{
						rooms.add(new QuadrupleRoom(id, new NormalRoom(new BareRoom())));
						try 
						{
							rooms.get(rooms.size() - 1).SetNumberOfClients(numberOfPeople);
						} 
						catch (Exception e)
						{
							
						}
					}
				}
                else if(isVip == 1)
                {
					if (capacity == 1) 
					{
						rooms.add(new SingleRoom(id, new VipRoom(new BareRoom())));
						try 
						{
							rooms.get(rooms.size() - 1).SetNumberOfClients(numberOfPeople);
						} 
						catch (Exception e)
						{
							
						}
					}
					else if (capacity == 2)
					{
						rooms.add(new DoubleRoom(id, new VipRoom(new BareRoom())));	
						try 
						{
							rooms.get(rooms.size() - 1).SetNumberOfClients(numberOfPeople);
						} 
						catch (Exception e)
						{
							
						}
					}		
					else if (capacity == 3)
					{
						rooms.add(new TripleRoom(id, new VipRoom(new BareRoom())));
						try 
						{
							rooms.get(rooms.size() - 1).SetNumberOfClients(numberOfPeople);
						} 
						catch (Exception e)
						{
							
						}
					}	
					else if (capacity == 4)
					{
						rooms.add(new QuadrupleRoom(id, new VipRoom(new BareRoom())));
						try 
						{
							rooms.get(rooms.size() - 1).SetNumberOfClients(numberOfPeople);
						} 
						catch (Exception e)
						{
							
						}
					}
                }
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        } 
        
        try 
        {
            stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM RESERVATIONS");
            int id, clientId, roomId;
            String from, to;
            while(result.next()) 
            {
                id = result.getInt("ID");
                from = result.getString("DATE_FROM");
                to = result.getString("DATE_TO");
                roomId = result.getInt("ROOM_ID");
                clientId = result.getInt("CLIENT_ID");
                
                Room tempR = null;
                Client tempC = null;
                
                for(Room r : rooms)
                {
                	if (r.GetId() == roomId) 
                	{
						tempR = r;
                		break;
					}
                }

                for(Client c : clients)
                {
                	if (c.getId() == clientId) 
                	{
						tempC = c;
                		break;
					}
                
                }
                DateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS", Locale.ENGLISH);
                
                try 
                {
                    reservations.add(new Reservation(id, format.parse(from), format.parse(to), tempC, tempR));
				}
                catch (Exception e)
                {
					
				}
            	// TODO
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        
        
        
		System.out.println("DONE");
		
	}
	
	public void AddReservation(Date from, Date to, Client client, int numberOfPeople, Room room)
	{
		try 
		{
			stat = conn.createStatement();

			// zapytanie
            ResultSet result = stat.executeQuery("SELECT ID FROM RESERVATIONS WHERE DATE_FROM > "");
            int id = -1;
            while(result.next()) 
            {
                id = result.getInt("ID");
            }
			
			//if
            DateFormat df = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS", Locale.ENGLISH);
			//room.SetNumberOfClients(numberOfPeople);
			
			String tabelaSQL = "insert into RESERVATIONS (DATE_FROM, DATE_TO, CLIENT_ID, ROOM_ID) values( \"" + df.format(from) + "\", \"" + df.format(to) + "\", " + client.getId() + ", " + room.GetId() + " )";
			stat.executeUpdate(tabelaSQL);
            result = stat.executeQuery("SELECT ID FROM RESERVATIONS WHERE CLIENT_ID= " + client.getId() + " AND ROOM_ID=" + room.GetId());
            int id = -1;
            while(result.next()) 
            {
                id = result.getInt("ID");
            }
			reservations.add(new Reservation(id, from, to, client, room));
			
			//else TODO
			
			
			stat.close();
			conn.close();
		} 
		catch (Exception e) 
		{
			System.out.println("ERROR");
		}
	}
	public ArrayList<Room> FindEmptyRooms(Date from, Date to, int capacity)
	{
		ArrayList<Room> ret = new ArrayList<Room>();

		for(Room item: rooms)
		{
			if (item.GetCapacity() >= capacity && !item.IsOccupied()) 
			{
				ret.add(item);
			}
		}
	
		return ret;
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
            conn = DriverManager.getConnection("jdbc:sqlite:"+dbName+".sqlite");
            //System.out.println("Po��czy�em si� z baz� "+dbName);
        } 
        catch (Exception e)
        {
            System.err.println("B��d w po��czeniu z baz�: \n" + e.getMessage());
            return null;
        }
        return conn;
    }
}