package Coustum_Data_Type;

import java.util.Date;

public class Person {
	private String Name;
	private Date dob;
	private String Address;
	public String getName() {
		return Name;
	}
	public void setName(String n) {
		Name = n;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date D) {
		dob = D;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String ad) {
		Address = ad;
	}
	public static int getAge() {
		return age;
	}
	public static final int age=30;

}
