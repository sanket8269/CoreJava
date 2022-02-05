package Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClassIterator {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add("Sanket");
		v.add(12);
		Iterator it = v.iterator();
//			
//	for (Object object : v) {  
//		System.out.println(object);
//		
//	}
		System.out.println(v.remove(1));
	
		while (it.hasNext()) {
			Object object = (Object) it.next();
	System.out.println(object);			
	System.out.println(v.remove(1));
		}
	}
	}

