package Collections_Framework;

import java.io.ObjectOutputStream.PutField;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TestCollectionMap {
	public static void main(String[] args) {
		Map m = new Hashtable();//HashMap();
		m.put(1, "ram");
		m.put(2, "shyam");
		m.put(3, "sita");
		m.put(4, "gita");
		
		
		Integer i = (Integer) m.get("");
		Set keys = m.keySet();
		Collection v = m.values();
		System.out.println(v);
		
		
		
		
		//m.keySet();
	
	//	System.out.println(m.values());
	//	System.out.println(m.keySet());
		//m.keySet();
		//System.out.println(m);
		
		

	}

}
