package mpkpk.project;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import mpkpk.project.hotel.*;

public class RoomTest {

	@Test
	public void testRoomId() throws Exception{
		int id = 123;
		Room roomA = RoomFactory.ProduceRoom(id,2,0);
		Assert.assertEquals(id,roomA.GetId());

	}
	
	@Test
	public void testCapacity() throws Exception{
			int cap = 3;
			Room roomB = RoomFactory.ProduceRoom(1,cap,0);
			Assert.assertEquals(cap,roomB.GetCapacity());
	}
	
	@Test
	public void testIsVip() throws Exception{
			Room roomB = RoomFactory.ProduceRoom(1,2,1);
			Room roomC = RoomFactory.ProduceRoom(1,2,0);
			Assert.assertTrue(roomB.IsVip());
			Assert.assertFalse(roomC.IsVip());
	}
	
	@Test
	public void testIsOccupied() throws Exception {
			Room roomD = RoomFactory.ProduceRoom(1,3,0);
			roomD.SetNumberOfClients(2);
			Assert.assertTrue(roomD.IsOccupied());
			roomD.SetNumberOfClients(0);
			Assert.assertFalse(roomD.IsOccupied());

	}
	
	@Test(expected=LessThanZeroClientsException.class)
	public void testSetNumberOfClientsLessThanZero() throws Exception {
			Room roomD = RoomFactory.ProduceRoom(1,3,0);
			roomD.SetNumberOfClients(-1);
	}
	
	@Test(expected=TooManyClientsException.class)
	public void testSetNumberOfClientsTooMany() throws Exception {
			Room roomD = RoomFactory.ProduceRoom(1,3,0);
			roomD.SetNumberOfClients(4);
	}

}
