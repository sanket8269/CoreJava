package Ios;

import java.util.StringTokenizer;

public class TestTokenString {
	public static void main(String[] args) {
		String str = "This Is a Java, Java Is Object Oriented Language,";
		
		StringTokenizer stn = new StringTokenizer(str,",");
		String Token = null;
		
		while (stn.hasMoreElements()) {
			Token= stn.nextToken();
			System.out.println(Token);
		}
		
	}

}
