package Ios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadScanner {
	public static void main(String[] args) throws Exception {	
		FileReader Fr = new FileReader("C:\\Users\\Admin\\Desktop\\jain.txt");
		Scanner sc = new Scanner(Fr);
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
			
		} 
		Fr.close();
	}

}
