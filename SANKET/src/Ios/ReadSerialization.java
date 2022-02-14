package Ios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadSerialization {
	public static void main(String[] args) throws Exception {
		FileInputStream Fis = new FileInputStream("D:\\Bittu\\object.ser");
		ObjectInputStream Ois = new ObjectInputStream(Fis);
		
		TestSerialization emp = (TestSerialization)Ois.readObject();
		
		System.out.println(emp.getFirstName());
		System.out.println(emp.getId());
		System.out.println(emp.getLastName());
		System.out.println(emp.getAddress());
	}}
