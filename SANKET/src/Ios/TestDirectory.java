package Ios;

import java.io.File;

//file subDirectory
public class TestDirectory {
	public static void main(String[] args) {
		File dir = new File("C:\\Users\\Admin\\Desktop");
		File[] list = dir.listFiles();

		
		//String[] l = dir.list();//file from a folder

		for (int i = 0; i < list.length; i++) {
		//	File f = new File("C:\\Users\\Admin\\Desktop", "java.txt");
			if (list[i].isFile())
				;
			System.out.println((i + 1) + ":" + list[i].getName());

		}
	}

}
