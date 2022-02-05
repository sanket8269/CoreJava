package Collections_Framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestCollactionHasmap {
	public static void main(String[] args) {
		HashMap hm	= new HashMap();
		
		hm.put("ram", 1);
		hm.put("shyam", 2);
		hm.put("sita", 3);
		hm.put("gita", 4);
		hm.put("laxman", 5);
		hm.put("bhrat", 6);
		
		Integer i = (Integer) hm.get("sita");
		System.out.println(i);
		Set keys = hm.keySet();
		Collection vals = hm.values();	
		System.out.println(vals);
		System.out.println(keys);


	}


}
