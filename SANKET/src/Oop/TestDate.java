package Oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDate {
public static void main(String[] args) throws ParseException {
	Person p = new Person();
	p.setName("sanket");
    
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String d ="27/09/1996";
	
	p.setdob(sdf.parse(d));
    p.setAddress("kalindi gold");
	
	System.out.println("Name"+ p.getName());
	System.out.println("Address"+ p.getAddress());
	System.out.println("dob"+p.getdob());
	System.out.println("age"+Person.getAvg());
}
}
