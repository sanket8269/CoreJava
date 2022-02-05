package Excercies_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class CalculateAge {
public static void main(String[] args) throws ParseException {
	String S="27/09/1996";
 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 Calendar dob = Calendar.getInstance();
 dob.setTime(sdf.parse(S));
 System.out.println("age is:"+getAge(dob));
}

public static int getAge(Calendar dob) {
	Calendar today = Calendar.getInstance();
	
	int curentYear = today.getWeekYear();
	int dobYear = dob.getWeekYear();
	int age = curentYear - dobYear;
	 
	int curentMonth = today.get(Calendar.MONTH);
	int dobMonth = dob.get(Calendar.MONTH);
	if (dobMonth>curentMonth) {
		age--;
	}else if (dobMonth==curentMonth) {
		int curentDay= today.get(Calendar.DAY_OF_MONTH);
		int dobDay= dob.get(Calendar.DAY_OF_MONTH);
		if (dobDay>curentDay) {
			age--;
		}
		}
	return age;
	

	
	}
}
