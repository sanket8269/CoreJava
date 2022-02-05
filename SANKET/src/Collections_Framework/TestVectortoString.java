package Collections_Framework;

import java.util.Vector;

public class TestVectortoString {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("vijay");
		v.add("Dinanath");
		v.add("Chouhan");
		v.add("jai ho");
		
		Integer i = new Integer(4);
		v.add(i);
		
		Integer value = (Integer) v.get(4);
		System.out.println("Index#4 of value =" + value);
		System.out.println(v);
	}

}
