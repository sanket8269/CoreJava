package Ios;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestPrimitvDataInput {
	public static void main(String[] args) throws Exception {
		FileOutputStream File = new FileOutputStream("D:\\Bittu\\PrimitivData.dat");
		DataOutputStream out = new DataOutputStream(File);
		out.writeInt(1);
		out.writeBoolean(false);
		out.writeChar('k');
		out.writeDouble(1.1);
		
		
	
		out.close();
		File.close();
		
		System.out.println("Primitiv Data Successfully");
	}
}
