package Ios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Testreadlinebyline {
	public static void main(String[] args) throws Exception {
		FileReader Fr = new FileReader("C:\\Users\\Admin\\Desktop\\java.txt");
		BufferedReader Br = new BufferedReader(Fr);
		
		String S =  Br.readLine();
		
		while (S!=null) {
			System.out.println(S);
			S= Br.readLine();
		}
		Br.close();
	}
	

}
