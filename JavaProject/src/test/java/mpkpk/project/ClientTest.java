package mpkpk.project;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import mpkpk.project.hotel.Client;


public class ClientTest {

	@Test
	public void testGetId() {
		String firstName="Anna";
		String lastName="Kowalska";
		int id=1;
		int phoneNumber=100200300;
		Client person = new Client(id,firstName,lastName,phoneNumber);
		Assert.assertEquals(1,person.getId());
	}

	@Test
	public void testGetFirstName() {
		String firstName="Anna";
		String lastName="Kowalska";
		int id=12;
		int phoneNumber=100200300;
		Client person = new Client(id,firstName,lastName,phoneNumber);
		Assert.assertNotNull(person.GetFirstName());
	}

	@Test
	public void testGetLastName() {
		String firstName="Anna";
		String lastName="Kowalska";
		int id=123;
		int phoneNumber=300400500;
		Client person = new Client(id,firstName,lastName,phoneNumber);
		Assert.assertNotNull(person.GetLastName());
	}

	@Test
	public void testGetPhoneNumber() {
		String firstName="Anna";
		String lastName="Kowalska";
		int id=1234;
		int phoneNumber=600700800;
		Client person = new Client(id,firstName,lastName,phoneNumber);
		Assert.assertEquals(600700800,person.GetPhoneNumber());
	}

	@Test
	public void testGetName() {
		String firstName="Anna";
		String lastName="Kowalska";
		int id=12345;
		int phoneNumber=700800900;
		Client person = new Client(id,firstName,lastName,phoneNumber);
		Assert.assertNotNull(person.GetName());
	}

	@Test
	public void testClient() {
		String firstName="Anna";
		String lastName="Kowalska";
		int id=12345;
		int phoneNumber=700800900;
		Client person = new Client(id,firstName,lastName,phoneNumber);
		Assert.assertNotNull(person);
	}

}

