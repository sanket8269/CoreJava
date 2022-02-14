package Ios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWrite {
	public static void main(String[] args) throws Exception {
		FileWriter Fw = new FileWriter("C:\\Users\\Admin\\Desktop\\newjava.txt", true);//Append Text in existing File
		PrintWriter Pw = new PrintWriter(Fw);
		
		for (int i = 0; i < 5; i++) {
			Pw.println(i+":jain");
		}
		Pw.close();
		Fw.close();
		System.out.println("done");
	}

}
