package Ios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assigmentemail {
	public static void main(String[] args) throws Exception {
		String source = "C:\\Users\\Admin\\Desktop\\email.txt";
		String target = "C:\\Users\\Admin\\Desktop\\Testemail.txt";
		
		FileReader fr = new FileReader(source);
	    Scanner br = new Scanner(fr);
	    
	    
	    FileWriter fw = new FileWriter(target);
	    PrintWriter pw = new PrintWriter(fw);
	    
	    String regex = "^(.+)@(.+)$";
		
		while(br.hasNextLine()) {
			
			String  s= br.nextLine();	
			if (s.matches(regex)){
				pw.println(s);	
			}
		
			}
		System.out.println("done");
		 br.close();		
		 fw.close();
		 pw.close();
		 fr.close();

}}