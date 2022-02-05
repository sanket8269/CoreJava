package Collections_Framework;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector v = new Vector();//Default capacity (10)
		Enumeration e = v.elements();
		
		v.add(87);
		v.add(89);
		v.add(90);
		
		v.remove(2);
		
		
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
			
		}
		
		
		
	}

}
