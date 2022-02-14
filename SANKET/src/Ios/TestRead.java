package Ios;

import java.io.FileNotFoundException;
import java.io.FileReader;
//Read char from file
public class TestRead {
	public static void main(String[] args) throws Exception {
		FileReader FR = new FileReader("C:\\Users\\Admin\\Desktop\\java.txt");

		int ch = FR.read();
		char chr;
		while (ch != -1) {
			chr = (char) ch;
			System.out.println(chr);
			ch = FR.read();
		}
	}
}