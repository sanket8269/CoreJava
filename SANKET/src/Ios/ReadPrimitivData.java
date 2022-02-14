package Ios;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadPrimitivData {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("D:\\Bittu\\PrimitivData.dat");
		DataInputStream in = new DataInputStream(file);
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readChar());

		 
	}

}
