package Ios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
///WRITE AN OBJECT
public class WriteSerialization {
	public static void main(String[] args) throws Exception {
		FileOutputStream Fos = new FileOutputStream("D:\\Bittu\\object.ser");
		ObjectOutputStream Oos = new ObjectOutputStream(Fos);
		
		TestSerialization emp = new TestSerialization(12,"sachin","jain","indore");
		
		Oos.writeObject(emp);
		Oos.close();
		System.out.println("done");

	}
	

}
