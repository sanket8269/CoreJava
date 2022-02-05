package Coustum_Data_Type;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test_Person {
	public static void main(String[] args) throws ParseException {
		Person p = new Person();
		p.setName("Sanket");
		p.setAddress("kalindi gold city");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String s = "27-09-1996";
		 
		p.setDob(sdf.parse(s));
		System.out.println(p.getAddress());
				System.out.println(p.getName());
				System.out.println(p.getDob());
				System.out.println(Person.getAge());	
	}

}
