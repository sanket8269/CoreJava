import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
	public static void main(String[] args) {
		try {
		Date d= new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("e/DD/MM/YY");
		String dd= sdf.format(d);
		System.out.println(dd);
	}catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
		
	}
	}
}
