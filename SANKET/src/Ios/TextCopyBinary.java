package Ios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TextCopyBinary {
	public static void main(String[] args) throws Exception {
		 String source = "C:\\Users\\Admin\\Desktop\\wall.jpg";
		 String target = "C:\\Users\\Admin\\Desktop\\image.jpg";
		 
		 FileInputStream reder = new FileInputStream(source);
		 FileOutputStream Writer = new FileOutputStream(target);
		 
		 int ch = reder.read();
		 while (ch!=-1) {
			 Writer.write(ch);
			 ch = reder.read();
			
		}
		 reder.close();
		 Writer.close();
		 
		 System.out.println("done");
	}

}
