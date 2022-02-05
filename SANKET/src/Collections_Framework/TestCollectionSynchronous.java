package Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class TestCollectionSynchronous {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(12);  l.add(13); l.add(43);
		
		System.out.println(Collections.synchronizedCollection(l));
		
		
 
	}

}
