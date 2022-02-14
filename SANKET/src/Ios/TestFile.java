package Ios;

import java.io.File;
import java.util.Date;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Admin\\Desktop","java.txt");
		
		System.out.println(f.canRead());
		System.out.println(new Date(f.lastModified()));
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getName());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.length());
	}

}
