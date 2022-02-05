package Collections_Framework;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
	public static void main(String[] args) {
		SortedSet ss = new TreeSet();
		
		ss.add(2);
		ss.add(3);
		ss.add(4);
		ss.add(5);
		
		Iterator it = ss.iterator();
		
		ss.add(6);
		System.out.println(ss);
		for (Iterator iterator = ss.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

}
