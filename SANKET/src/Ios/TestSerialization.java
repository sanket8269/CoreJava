package Ios;

import java.io.Serializable;

public class TestSerialization implements Serializable{
	private int id;
	private String firstName;
	private String lastName;
	private transient String address;
	
	public TestSerialization() {}
	
	public TestSerialization(int d, String n, String ln , String add) {
		id=d;
		firstName=n;
		lastName=ln;
		address=add;		
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}
	
	
	

}
