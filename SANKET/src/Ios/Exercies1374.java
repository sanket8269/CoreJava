package Ios;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exercies1374 {
	public static void main(String[] args) throws Exception {
		String target = "C:\\Users\\Admin\\Desktop\\jain.txt";
		FileWriter Fw = new FileWriter(target);
		PrintWriter Pw = new PrintWriter(Fw);
		
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(ISR);
		
		String line = BR.readLine();
		while (!line.equals("quit")) {
			Pw.print(line);
			line = BR.readLine();
		}
		Pw.close();
		ISR.close();
		System.out.println("done");
	}

}
