package mpkpk.project;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import mpkpk.project.hotel.*;

public class Test1 {

	@Test
	public void testRoomId() {
		try{
		int id = 123;
		Room roomA = RoomFactory.ProduceRoom(id,2,0);
		Assert.assertEquals(id,roomA.GetId());
		}
		catch(WrongParametersException ex)
		{
			System.out.println("Wyjatek");
		}
	}

}
