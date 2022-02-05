import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class TestDateFormat{
	public static void main(String[] args) throws ParseException {
		Date d= new Date();
	SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
	String str= format.format(d);
	System.out.println(str);
	String S ="13/01/22";
	Date s1 =format.parse(S);
	System.out.println(s1);
	}
	}