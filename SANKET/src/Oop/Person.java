package Oop;

import java.util.Date;

public class Person {
private String name;
private String Address;
private Date dob;
public static final int avg = 60; 

public static int getAvg() {
	return avg;
}
public void setName(String n) {
	name=n;
}
public String getName() {
	return name;
}
public void setdob(Date d) {
	dob=d;
}
public Date getdob() {
	return dob;
}
public void setAddress(String a) {
	Address= a;
	}
public String getAddress() {
	return Address;
}}