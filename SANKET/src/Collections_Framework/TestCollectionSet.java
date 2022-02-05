package Collections_Framework;

import java.util.TreeSet;

public class TestCollectionSet {
public static void main(String[] args) {
	TreeSet s = new TreeSet();
	
	s.add(1232);
	//s.add(465.90);
//	s.add("vijay");
	s.add(1232);
	
	System.out.println(s.contains(1));
	System.out.println(s.isEmpty());
	System.out.println(s);//cannot contain duplicate elements
	System.out.println(s.isEmpty());
}
}
